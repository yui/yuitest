#!/usr/bin/env node

/*
 * YUI Test Node.js Command Line Interface
 */
 
var fs      = require("fs"),
    path    = require("path"),
    vm      = null,
    YUITest = require("yuitest"),
    TestRunner = YUITest.TestRunner,
    stdout  = process.stdout,
    stderr  = process.stderr || stdout;   //stderr added in 0.3.8
    
  
 if (process.binding("natives").vm){
    vm = require("vm");
 }
 
  
//options collected from command line  
var options = {
    verbose: false,
    webcompat: false,
    help: false,
    format: "xunit"
};

//-----------------------------------------------------------------------------
// Function to get all files in a directory
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

function outputHelp(){
    stdout.write([
        "\nUsage: yuitest [options] [file|dir]*",
        " ",
        "Global Options",
        "  --groups groupname  Run only tests cases that are part of groupname.",
        "  --help              Displays this information.",
        "  --format <format>   Specifies output format (junitxml, tap, xunit).",
        "  --verbose           Display informational messages and warnings.",
        "  --webcompat         Load tests designed for use in browsers."   
    ].join("\n") + "\n\n");
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
        
        //get the next argument
        if (arg == "--groups" || arg == "--format"){
            options[arg.substring(2)] = args.shift();
        }
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

if (options.help){
    outputHelp();
    process.exit(0);
}

//get the full path names
files = files.map(function(filename){
    return path.join(process.cwd(), filename);
});

//-----------------------------------------------------------------------------
// Determine output format
//-----------------------------------------------------------------------------

switch(options.format){
    case "junitxml":
        if (options.verbose){
            stderr.write("[INFO] Using JUnitXML output format.\n");
        }
        YUITest.Node.CLI.Format(YUITest.TestFormat.JUnitXML);
        break;
    case "tap":
        if (options.verbose){
            stderr.write("[INFO] Using TAP output format.\n");
        }
        YUITest.Node.CLI.Format(YUITest.TestFormat.TAP);
        break;
    default:
        if (options.verbose){
            stderr.write("[INFO] Using XUnit output format.\n");
        }
        YUITest.Node.CLI.XUnit();            
}

//-----------------------------------------------------------------------------
// Make sure exit code is 1 when there are failures
//-----------------------------------------------------------------------------

process.on("exit", function(){
    if (TestRunner.getResults().failed){
        process.exit(1);
    }
});

//-----------------------------------------------------------------------------
// Include test files
//-----------------------------------------------------------------------------

var i, len, output;

if (files.length){
    for (i=0, len=files.length; i < len; i++){

        if (options.verbose){
            stderr.write("[INFO] Loading " + files[i] + "\n");
        }
        
        if (options.webcompat){
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
                stderr.write("[ERROR] " + ex.stack);
                stderr.write("\n[ERROR] No tests loaded from " + files[i] + ". If you're not using CommonJS module format, try running with --webcompat option.\n");
                process.exit(1);
            }            
        }
    }
} else {
    stderr.write("[ERROR] No tests to run, exiting.\n");
    process.exit(1);    
}

//-----------------------------------------------------------------------------
// Run it!
//-----------------------------------------------------------------------------

TestRunner.run({
    groups: options.groups ? options.groups.split(",") : null
});