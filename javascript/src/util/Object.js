
/**
 * Object containing object helper methods.
 * @namespace YUITest
 * @class Object
 * @static
 */
YUITest.Object = {
    /**
     * Property names that IE doesn't enumerate in for..in loops, even when they
     * should be enumerable. When `_hasEnumBug` is `true`, it's necessary to
     * manually enumerate these properties.
     *
     * @property _forceEnum
     * @type String[]
     * @protected
     * @static
     */
    _forceEnum : [
        'hasOwnProperty',
        'isPrototypeOf',
        'propertyIsEnumerable',
        'toString',
        'toLocaleString',
        'valueOf'
    ],

    /**
     * `true` if this browser has the JScript enumeration bug that prevents
     * enumeration of the properties named in the `_forceEnum` array, `false`
     * otherwise.
     *
     * See:
     *   - <https://developer.mozilla.org/en/ECMAScript_DontEnum_attribute#JScript_DontEnum_Bug>
     *   - <http://whattheheadsaid.com/2010/10/a-safer-object-keys-compatibility-implementation>
     *
     * @property _hasEnumBug
     * @type {Boolean}
     * @protected
     * @static
     */
    _hasEnumBug : !{valueOf: 0}.propertyIsEnumerable('valueOf'),
    
    /**
     * Returns an array containing the object's enumerable keys. Does not include
     * prototype keys or non-enumerable keys.
     *
     * Note that keys are returned in enumeration order (that is, in the same order
     * that they would be enumerated by a `for-in` loop), which may not be the same
     * as the order in which they were defined.
     *
     * This method is an alias for the native ES5 `Object.keys()` method if
     * available.
     *
     * @example
     *
     *     Y.Object.keys({a: 'foo', b: 'bar', c: 'baz'});
     *     // => ['a', 'b', 'c']
     *
     * @method keys
     * @param {Object} obj An object.
     * @return {String[]} Array of keys.
     * @static
     */
    keys : (!unsafeNatives && Object.keys) || function (obj) {
        if (!Y.Lang.isObject(obj)) {
            throw new TypeError('Object.keys called on a non-object');
        }

        var keys = [],
            i, key, len;

        for (key in obj) {
            if (owns(obj, key)) {
                keys.push(key);
            }
        }

        if (YUITest.Object._hasEnumBug) {
            for (i = 0, len = YUITest.Object._forceEnum.length; i < len; ++i) {
                key = YUITest.Object._forceEnum[i];

                if (owns(obj, key)) {
                    keys.push(key);
                }
            }
        }

        return keys;
    }
};
