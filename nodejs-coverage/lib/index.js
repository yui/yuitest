
var spawn = require('child_process').spawn,
    fs = require('fs'),
    path = require('path'),
    jar, idx = 0,
    exists = fs.exists || path.exists,
    base = path.join(__dirname, '../jar'),
    lists = fs.readdirSync(base);

lists.some(function(item) {
    if (path.basename(item) === 'yuitest-coverage.jar') {
        jar = path.join(base, item);
        return true;
    }
});

exports.jar = jar;


var cover = function(item, options, callback) {
    if (typeof options === 'function') {
        callback = options;
        options = { charset: 'utf8' };
    }

    getString(item, function(err, file) {
        coverString(file, options, callback);
    });
};

var getString = function(str, callback) {
    exists(str, function(y) {
        if (y) {
            fs.readFile(str, 'utf8', function(err, data) {
                //Set the type from the file name
                callback(err, data);
            });
        } else {
            callback(null, str);
        }
    });
};


var coverString = function(str, options, callback) {

    var args = [
        '-jar',
        jar,
        '--charset',
        options.charset,
        '--stdin'
    ], buffer = '', errBuffer = '', child;
    

    if (options.name) {
        args.push('--cover-name');
        args.push(options.name);
    }

    child = spawn('java', args, {
        stdio: ['pipe', 'pipe', 'pipe']
    });

    child.stdin.write(str);
    child.stdin.end();

    child.stdout.on('data', function(chunk) {
        buffer += chunk;
    });
    child.stderr.on('data', function(chunk) {
        errBuffer += chunk;
    });
    
    child.on('exit', function() {
        var err = null;
        if (errBuffer) {
            err = errBuffer;
        }
        callback(err, buffer, errBuffer);
    });
};

exports.cover = cover;
