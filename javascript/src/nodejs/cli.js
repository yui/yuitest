/*
 * YUI Test Node.js Command Line Interface
 */
 
var fs      = require("fs"),
    path    = require("path"),
    vm      = require("vm"),
    YUITest = require("./lib/yuitest-node.js").YUITest,
    TestRunner = YUITest.TestRunner,
    stdout  = process.stdout,
    stderr  = process.stderr;
    
  
//options collected from command line  
var options = {
    verbose: false
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
// Determine output format
//-----------------------------------------------------------------------------

//TODO: Other types of output
YUITest.Node.CLI.XUnit();

//-----------------------------------------------------------------------------
// Set up TestRunner
//-----------------------------------------------------------------------------

TestRunner.subscribe("complete", function(event){

    //if there are failed tests, exit with code 1
    if (event.results.failed){
        process.exit(1);
    }
});

//-----------------------------------------------------------------------------
// Include test files
//-----------------------------------------------------------------------------

var i, len;

if (files.length){
    for (i=0, len=files.length; i < len; i++){

        if (options.verbose){
            stderr.write("[INFO] Loading " + files[i] + "\n");
        }
        
        var output = fs.readFileSync(files[i]);
        vm.runInThisContext("(function(YUITest){\n" + output + "\n})", files[i])(YUITest);
    }
} else {
    stderr.write("[ERROR] No tests to run, exiting.\n");
    process.exit(1);    
}

//-----------------------------------------------------------------------------
// Run it!
//-----------------------------------------------------------------------------

TestRunner.run();