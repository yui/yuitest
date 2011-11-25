/*!
 * Portions of this code incorporated from CSS Lint:
 * https://github.com/stubbornella/csslint
 */
 
importPackage(java.io);
importPackage(java.lang);
    
YUITest.CLI = {
    args: arguments,
    
    print: function(message){
        System.out.print(message);
    },
    
    println: print,
    
    warn: function(message){
        System.err.print(message);
    },
    
    quit: quit,
    
    isDirectory: function(name){
        var dir = new File(name);
        return dir.isDirectory();
    },
    
    getFiles: function(dir){
        var files = [];

        function traverse(dir) {
            var dirList = dir.listFiles();
            dirList.forEach(function (file) {
                if (/\.js$/.test(file)) {
                    files.push(file.toString());
                } else if (file.isDirectory()) {
                    traverse(file);
                }
            });
        }

        traverse(new File(dir));

        return files;    
    },
    
    getFullPath: function(filename){
        return (new File(filename)).getCanonicalPath();
    },

    readFile: readFile,
    
    processFiles: function(){
        var files = this.files,
            i, len, output;

        if (files.length){
            for (i=0, len=files.length; i < len; i++){

                if (this.options.verbose){
                    this.warn("[INFO] Loading " + files[i] + "\n");
                }
                
                load(files[i]);

            }
        } else {
            this.warn("[ERROR] No tests to run, exiting.\n");
            this.quit(1);    
        }    
    }
};


