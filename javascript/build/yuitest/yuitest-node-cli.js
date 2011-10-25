/*!
 * Portions of this code incorporated from CSS Lint:
 * https://github.com/stubbornella/csslint
 */
var fs      = require("fs"),
    path    = require("path"),
    vm      = null,
    YUITest = require("./lib/yuitest"),
    stdout  = process.stdout,
    stderr  = process.stderr || stdout;   //stderr added in 0.3.8    
  
if (process.binding("natives").vm){
    vm = require("vm");
}
 
//-----------------------------------------------------------------------------
// Make sure exit code is 1 when there are failures
//-----------------------------------------------------------------------------

process.on("exit", function(){
    var results = YUITest.TestRunner.getResults();
    if (results && results.failed){
        YUITest.CLI.quit(1);
    }
});
      
    
YUITest.CLI = {
    args: process.argv.slice(2),

    print: function(message){
        fs.writeSync(1, message);
    },
    
    println: function(message){
        this.print(message + "\n");
    },
    
    warn: function(message){
        this.warn(message);
    },
    
    quit: function(code){
    
        //Workaround for https://github.com/joyent/node/issues/1669
        var flushed = process.stdout.flush();
        if (!flushed) {
            process.once("drain", function () {
                process.exit(code || 0);
            });
        } else {
            process.exit(code || 0);
        }
    },
    
    isDirectory: function(name){
        return fs.statSync(name).isDirectory();
    },

    getFiles: function(dir){
        var files = [];

        try {
            fs.statSync(dir);
        } catch (ex){
            return [];
        }

        function traverse(dir, stack){
            stack.push(dir);
            fs.readdirSync(stack.join("/")).forEach(function(file){
                var path = stack.concat([file]).join("/"),
                    stat = fs.statSync(path);
                
                if (file[0] == ".") {
                    return;
                } else if (stat.isFile() && /\.js$/.test(file)){
                    files.push(path);
                } else if (stat.isDirectory()){
                    traverse(file, stack);
                }
            });
            stack.pop();
        }

        traverse(dir, []);

        return files;
    },
    
    getFullPath: function(filename){
        return path.resolve(process.cwd(), filename);
    },

    readFile: function(filename){
        return fs.readFileSync(filename, "utf-8");    
    },
    
    processFiles: function(){
        var files = this.files,
            i, len, output;

        if (files.length){
            for (i=0, len=files.length; i < len; i++){

                if (this.options.verbose){
                    this.warn("[INFO] Loading " + files[i] + "\n");
                }
                
                if (this.options.webcompat){
                    output = fs.readFileSync(files[i]);
                    if (vm){
                        vm.runInThisContext("(function(YUITest){\n" + output + "\n})", files[i])(YUITest);
                    } else {
                        process.compile("(function(YUITest){\n" + output + "\n})", files[i])(YUITest);
                    }
                } else {
                    try {
                        require(files[i]);
                    } catch (ex) {
                        this.warn("[ERROR] " + ex.stack);
                        this.warn("\n[ERROR] No tests loaded from " + files[i] + ". If you're not using CommonJS module format, try running with --webcompat option.\n");
                        this.quit(1);
                    }            
                }
            }
        } else {
            this.warn("[ERROR] No tests to run, exiting.\n");
            this.quit(1);    
        }
    
    }
};





/**
 * Console output that mimics logger output from YUI Test for YUI 2/3.
 * @namespace YUITest.Node.CLI
 * @class Logger
 * @constructor
 */
YUITest.CLI.Logger = function(){

    var testRunner  = YUITest.TestRunner,
        cli         = YUITest.CLI;

    //handles test runner events
    function handleEvent(event){
    
        var message = "";
        switch(event.type){
            case testRunner.BEGIN_EVENT:
                message = "Testing began at " + (new Date()).toString() + ".";
                messageType = "info";
                break;
                
            case testRunner.COMPLETE_EVENT:
                message = "Testing completed at " +
                    (new Date()).toString() + ".\n" +
                    "Passed:" + event.results.passed + " Failed:" + event.results.failed +
                    " Total:" + event.results.total + "(" + event.results.ignored + " ignored)"; 
                messageType = "info";
                break;
                
            case testRunner.TEST_FAIL_EVENT:
                message = event.testName + ": failed.\n" + event.error.getMessage();
                messageType = "fail";
                break;
                
            case testRunner.ERROR_EVENT:
                message = event.methodName + ": error.\n" + event.error.message;
                messageType = "error";
                break;
                
            case testRunner.TEST_IGNORE_EVENT:
                message = event.testName + ": ignored.";
                messageType = "ignore";
                break;
                
            case testRunner.TEST_PASS_EVENT:
                message = event.testName + ": passed.";
                messageType = "pass";
                break;
                
            case testRunner.TEST_SUITE_BEGIN_EVENT:
                message = "Test suite \"" + event.testSuite.name + "\" started.";
                messageType = "info";
                break;
                
            case testRunner.TEST_SUITE_COMPLETE_EVENT:
                message = "Testing completed at " +
                    (new Date()).toString() + ".\n" +
                    "Passed:" + event.results.passed + " Failed:" + event.results.failed +
                    " Total:" + event.results.total + "(" + event.results.ignored + " ignored)";
                messageType = "info";
                break;
                
            case testRunner.TEST_CASE_BEGIN_EVENT:
                message = "Test case \"" + event.testCase.name + "\" started.";
                messageType = "info";
                break;
                
            case testRunner.TEST_CASE_COMPLETE_EVENT:
                message = "Testing completed at " +
                    (new Date()).toString() + ".\n" +
                    "Passed:" + event.results.passed + " Failed:" + event.results.failed +
                    " Total:" + event.results.total + "(" + event.results.ignored + " ignored)";
                messageType = "info";
                break;
            default:
                message = "Unexpected event " + event.type;
                messageType = "info";
        }    
        
        cli.print(message + "\n");
    }

    testRunner.subscribe(testRunner.BEGIN_EVENT, handleEvent)
    testRunner.subscribe(testRunner.TEST_FAIL_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_PASS_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_IGNORE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_CASE_BEGIN_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_CASE_COMPLETE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_SUITE_BEGIN_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_SUITE_COMPLETE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.COMPLETE_EVENT, handleEvent); 

};



/**
 * Console output that mimics XUnit output.
 * @namespace YUITest.CLI
 * @class XUnit
 * @constructor
 */
YUITest.CLI.XUnit = function(){

    var testRunner  = YUITest.TestRunner,
        cli         = YUITest.CLI,
        errors      = [],
        failures    = [],
        stack       = [];
        
    function filterStackTrace(stackTrace){
        if (stackTrace){
            var lines = stackTrace.split("\n"),
                result = [],
                i, len;
                
            //skip first line, it's the error
            for (i=1, len=lines.length; i < len; i++){
                if (lines[i].indexOf("yuitest-node") > -1){
                    break;
                } else {
                    result.push(lines[i]);
                }
            }
            
            return result.join("\n");    
        } else {
            return "Unavailable."
        }
    }

    //handles test runner events
    function handleEvent(event){
    
        var message = "",
            results = event.results,
            i, len;
            
        switch(event.type){
            case testRunner.BEGIN_EVENT:
                message = "YUITest\n";
                
                if (testRunner._groups){
                    message += "Filtering on groups '" + testRunner._groups.slice(1,-1) + "'\n";
                }
                break;
                
            case testRunner.COMPLETE_EVENT:
                message = "\nTotal tests: " + results.total + ", Failures: " + 
                    results.failed + ", Skipped: " + results.ignored +
                    ", Time: " + (results.duration/1000) + " seconds\n";
                    
                if (failures.length){
                    message += "\nTests failed:\n";
                    
                    for (i=0,len=failures.length; i < len; i++){
                        message += "\n" + (i+1) + ") " + failures[i].name + " : " + failures[i].error.getMessage() + "\n";
                        message += "Stack trace:\n" + filterStackTrace(failures[i].error.stack) + "\n";
                    }
                
                    message += "\n";
                }
                
                if (errors.length){
                    message += "\nErrors:\n";
                    
                    for (i=0,len=errors.length; i < len; i++){
                        message += "\n" + (i+1) + ") " + errors[i].name + " : " + errors[i].error.message + "\n";
                        message += "Stack trace:\n" + filterStackTrace(errors[i].error.stack) + "\n";
                    }
                
                    message += "\n";
                }
                
                message += "\n\n";
                break;
                
            case testRunner.TEST_FAIL_EVENT:
                message = "F";
                failures.push({
                    name: stack.concat([event.testName]).join(" > "),
                    error: event.error
                });

                break;
                
            case testRunner.ERROR_EVENT:
                errors.push({
                    name: stack.concat([event.methodName]).join(" > "),
                    error: event.error
                });

                break;
                
            case testRunner.TEST_IGNORE_EVENT:
                message = "S";
                break;
                
            case testRunner.TEST_PASS_EVENT:
                message = ".";
                break;
                
            case testRunner.TEST_SUITE_BEGIN_EVENT:
                stack.push(event.testSuite.name);
                break;
                
            case testRunner.TEST_CASE_COMPLETE_EVENT:
            case testRunner.TEST_SUITE_COMPLETE_EVENT:
                stack.pop();
                break;
                
            case testRunner.TEST_CASE_BEGIN_EVENT:
                stack.push(event.testCase.name);
                break;
                
            //no default
        }    
        
        cli.print(message);
    }

    testRunner.subscribe(testRunner.BEGIN_EVENT, handleEvent)
    testRunner.subscribe(testRunner.TEST_FAIL_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_PASS_EVENT, handleEvent);
    testRunner.subscribe(testRunner.ERROR_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_IGNORE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_CASE_BEGIN_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_CASE_COMPLETE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_SUITE_BEGIN_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_SUITE_COMPLETE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.COMPLETE_EVENT, handleEvent); 

};



/**
 * Console output that uses TestFormat formats.
 * @namespace YUITest.Node.CLI
 * @class Format
 * @constructor
 */
YUITest.CLI.Format = function(format){

    var testRunner  = YUITest.TestRunner,
        cli         = YUITest.CLI;

    //handles test runner events
    function handleEvent(event){
    
        var results = event.results;

        cli.print(format(results));
    }

    testRunner.subscribe(testRunner.COMPLETE_EVENT, handleEvent); 

};

/*
 * Augments the environment-specific CLI API with common functionality.
 */
YUITest.Util.mix(YUITest.CLI, {

    files: [],

    options: {
        verbose: false,
        webcompat: false,
        help: false,
        format: "xunit"
    },
    
    outputHelp: function(){
        this.print([
            "\nUsage: yuitest [options] [file|dir]*",
            " ",
            "Global Options",
            "  --groups groupname  Run only tests cases that are part of groupname.",
            "  --help              Displays this information.",
            "  --format <format>   Specifies output format (junitxml, tap, xunit).",
            "  --verbose           Display informational messages and warnings.",
            "  --webcompat         Load tests designed for use in browsers."   
        ].join("\n") + "\n\n");
    },
    
    processArguments: function(){

        var args    = this.args,  
            arg     = args.shift(), 
            files   = [];  
            
        while(arg){
            if (arg.indexOf("--") == 0){
                this.options[arg.substring(2)] = true;
                
                //get the next argument
                if (arg == "--groups" || arg == "--format"){
                    this.options[arg.substring(2)] = args.shift();
                }
            } else {
                
                //see if it's a directory or a file
                if (this.isDirectory(arg)){
                    files = files.concat(this.getFiles(arg));
                } else {
                    files.push(arg);
                }
            }
            arg = args.shift();
        }

        if (this.options.help || files.length === 0){
            this.outputHelp();
            this.quit(0);
        }

        this.files = files;
        
        //-----------------------------------------------------------------------------
        // Determine output format
        //-----------------------------------------------------------------------------

        switch(this.options.format){
            case "junitxml":
                if (this.options.verbose){
                    this.warn("[INFO] Using JUnitXML output format.\n");
                }
                YUITest.CLI.Format(YUITest.TestFormat.JUnitXML);
                break;
            case "tap":
                if (this.options.verbose){
                    this.warn("[INFO] Using TAP output format.\n");
                }
                YUITest.CLI.Format(YUITest.TestFormat.TAP);
                break;
            default:
                if (this.options.verbose){
                    this.warn("[INFO] Using XUnit output format.\n");
                }
                YUITest.CLI.XUnit();
        }    
    },
    
    start: function(){
    
        this.processArguments();
        this.processFiles();
        
        YUITest.TestRunner.run({
            groups: this.options.groups ? this.options.groups.split(",") : null
        });    
    }        
});

YUITest.CLI.start();

