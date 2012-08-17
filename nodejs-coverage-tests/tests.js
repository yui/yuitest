var YUITest = require('yuitest'),
    fs = require('fs'),
    path = require('path'),
    Assert = YUITest.Assert,
    coverage = require('../nodejs-coverage/lib/index'),
    suite = new YUITest.TestSuite('Node.js Coverage Wrapper');


suite.add(new YUITest.TestCase({
    name: 'coverage testing',
    'test: string passing': function() {
        var test = this;
        coverage.cover('var foo = function() { var bar; };', function(err, data) {
            test.resume(function() {
                Assert.isNull(err, 'err object should be null');
                Assert.isTrue(data.indexOf('_yuitest_coverage') > -1, 'Failed to cover file');
            });
        });
        test.wait();
    },
    'test: file passing': function() {
        var test = this;
        coverage.cover(path.join(__dirname, '../nodejs-coverage/lib/index.js'), function(err, data) {
            test.resume(function() {
                Assert.isNull(err, 'err object should be null');
                Assert.isTrue(data.indexOf('_yuitest_coverage') > -1, 'Failed to cover file');
            });
        });
        test.wait();
    },
    'test: bad file': function() {
        var test = this;
        coverage.cover('/foo/bar/bax', function(err, data) {
            test.resume(function() {
                Assert.isNotNull(err, 'err object should not be null');
            });
        });
        test.wait();
    }
}));


YUITest.TestRunner.add(suite);
