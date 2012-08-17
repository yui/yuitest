
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


var cover = function(item, charset, callback) {
    if (typeof charset === 'function') {
        callback = charset;
        charset = 'utf8';
    }

    getFile(item, function(err, file, rm) {
        coverFile(file, charset, callback, rm);
    });
};

var getFile = function(str, callback) {
    exists(str, function(y) {
        if (y) {
            callback(null, str);
        } else {
            //Write Temp File..
            var tmpFile = path.join(__dirname, 'tmp-' + (new Date()).getTime() + '.' + (++idx));
            fs.writeFile(tmpFile, str, 'utf8', function(err) {
                callback(null, tmpFile, true);
            });
        }
    });
};


var coverFile = function(file, charset, callback, rm) {

    var args = [
        '-jar',
        jar,
        '--charset',
        charset,
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
