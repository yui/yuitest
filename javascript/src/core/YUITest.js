/**
 * YUI Test Framework
 * @module yuitest
 */

/**
 * The root namespace for YUI Test.
 * @class YUITest
 * @static
 */

var YUITest = {
    version: "@VERSION@"
    _idx: 0,
    guid: function(pre) {
        var id = (new Date()).getTime() + '_' + (++YUITest._idx);
        return (pre) ? (pre + id) : id;
    }
};
