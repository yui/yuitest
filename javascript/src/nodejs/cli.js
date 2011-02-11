/*
 * YUI Test Node.js Command Line Interface
 */
 
var fs      = require("fs"),
    path    = require("path"),
    //YUITest = require(path.join(process.cwd(), "lib/yuitest-node.js")).YUITest,
    YUITest = require("./lib/yuitest-node.js").YUITest,
    TestRunner = YUITest.TestRunner,
    stdout  = process.stdout;
    
  
//options collected from command line  
var options = {
    verbose: false
};

//-----------------------------------------------------------------------------
// Setup TestRunner
//-----------------------------------------------------------------------------

stdout.write("YUI Test for Node.js\n");

//handles test runner events
function handleEvent(event){
var message = "";
    switch(event.type){
        case TestRunner.BEGIN_EVENT:
            message = "Testing began at " + (new Date()).toString() + ".";
            messageType = "info";
            break;
            
        case TestRunner.COMPLETE_EVENT:
            message = "Testing completed at " +
                (new Date()).toString() + ".\n" +
                "Passed:" + event.results.passed + " Failed:" + event.results.failed +
                " Total:" + event.results.total + "(" + event.results.ignored + " ignored)"; 
            messageType = "info";
            break;
            
        case TestRunner.TEST_FAIL_EVENT:
            message = event.testName + ": failed.\n" + event.error.getMessage();
            messageType = "fail";
            break;
            
        case TestRunner.TEST_IGNORE_EVENT:
            message = event.testName + ": ignored.";
            messageType = "ignore";
            break;
            
        case TestRunner.TEST_PASS_EVENT:
            message = event.testName + ": passed.";
            messageType = "pass";
            break;
            
        case TestRunner.TEST_SUITE_BEGIN_EVENT:
            message = "Test suite \"" + event.testSuite.name + "\" started.";
            messageType = "info";
            break;
            
        case TestRunner.TEST_SUITE_COMPLETE_EVENT:
            message = "Testing completed at " +
                (new Date()).toString() + ".\n" +
                "Passed:" + event.results.passed + " Failed:" + event.results.failed +
                " Total:" + event.results.total + "(" + event.results.ignored + " ignored)";
            messageType = "info";
            break;
            
        case TestRunner.TEST_CASE_BEGIN_EVENT:
            message = "Test case \"" + event.testCase.name + "\" started.";
            messageType = "info";
            break;
            
        case TestRunner.TEST_CASE_COMPLETE_EVENT:
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
    
    stdout.write(message + "\n");
}


TestRunner.subscribe(TestRunner.BEGIN_EVENT, handleEvent)
TestRunner.subscribe(TestRunner.TEST_FAIL_EVENT, handleEvent);
TestRunner.subscribe(TestRunner.TEST_PASS_EVENT, handleEvent);
TestRunner.subscribe(TestRunner.TEST_IGNORE_EVENT, handleEvent);
TestRunner.subscribe(TestRunner.TEST_CASE_BEGIN_EVENT, handleEvent);
TestRunner.subscribe(TestRunner.TEST_CASE_COMPLETE_EVENT, handleEvent);
TestRunner.subscribe(TestRunner.TEST_SUITE_BEGIN_EVENT, handleEvent);
TestRunner.subscribe(TestRunner.TEST_SUITE_COMPLETE_EVENT, handleEvent);
TestRunner.subscribe(TestRunner.COMPLETE_EVENT, handleEvent); 


//-----------------------------------------------------------------------------
// Function get all files in a directory
//-----------------------------------------------------------------------------

function getFiles(dir){
    var files = [];
    
    try {
        fs.statSync(dir);
    } catch (ex){
        return [];
    }

    function traverse(dir, stack){
        stack.push(dir);
        fs.readdirSync(stack.join("/")).forEach(function(file){
            var path = stack.concat([file]).join("/");
            var stat = fs.statSync(path);
            
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
}

//-----------------------------------------------------------------------------
// Process command line
//-----------------------------------------------------------------------------

var args    = process.argv.slice(2),  
    arg     = args.shift(),     
    files   = [];
    
while(arg){
    if (arg.indexOf("--") == 0){
        options[arg.substring(2)] = true;
    } else {
        
        //see if it's a directory or a file
        if (fs.statSync(arg).isDirectory()){
            files = files.concat(getFiles(arg));
        } else {
            files.push(arg);
        }
    }
    arg = args.shift();
}

//get the full path names
files = files.map(function(filename){
    return path.join(process.cwd(), filename);
});

//-----------------------------------------------------------------------------
// Include test files
//-----------------------------------------------------------------------------

var code = [];

files.forEach(function(filename){

    if (options.verbose){
        stdout.write("Loading " + filename + "\n");
    }
    
    var output = fs.readFileSync(filename);
    code.push(output);
});

eval(code.join("\n\n"));
TestRunner.run();