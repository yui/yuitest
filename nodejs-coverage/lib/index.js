
var spawn = require('child_process').spawn,
    fs = require('fs'),
    path = require('path'),
    jar, idx = 0,
    exists = fs.exists || path.exists,
    lists = fs.readdirSync(path.join(__dirname, '../build'));

lists.some(function(item) {
    if (path.extname(item) === '.jar') {
        jar = path.join(__dirname, '../build/', item);
        return true;
    }
});

exports.jar = jar;


var cover = function(item, options, callback) {
    if (typeof options === 'function') {
        callback = options;
        options = { charset: 'utf8' };
    }

    getFile(item, options.name, function(err, file, rm) {
        coverFile(file, options, callback, rm);
    });
};

var getFile = function(str, name, callback) {
    exists(str, function(y) {
        if (y) {
            callback(null, str);
        } else {
            //Write Temp File..
            var tmpFile = name || path.join(__dirname, 'tmp-' + (new Date()).getTime() + '.' + (++idx));
            fs.writeFile(tmpFile, str, 'utf8', function(err) {
                callback(null, tmpFile, true);
            });
        }
    });
};


var coverFile = function(file, options, callback, rm) {

    var args = [
        '-jar',
        jar,
        '--charset',
        options.charset,
        file
    ], buffer = '', errBuffer = '', child;

    child = spawn('java', args, {
        stdio: ['pipe', 'pipe', 'pipe']
    });

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
        if (rm) {
            fs.unlink(file);
        }
        callback(err, buffer, errBuffer);
    });
};

exports.cover = cover;
