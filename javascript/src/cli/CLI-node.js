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


