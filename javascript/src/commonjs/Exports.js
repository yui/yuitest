/**
 * YUI Test Framework
  */

/**
 * The root namespace for YUI Test.
 * @class YUITest
 * @static
 */

var YUITest = exports;
YUITest.version = "@VERSION@";

//backwards compatibility
exports.YUITest = YUITest;

YUITest._idx = 0;
YUITest.guid = function(pre) {
    var id = (new Date()).getTime() + '_' + (++YUITest._idx);
    return (pre) ? (pre + id) : id;
};
