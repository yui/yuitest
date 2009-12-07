/**
 * Utilities for cookie management
 * @namespace YAHOO.util
 * @module cookie
 */
if (typeof _yuitest_coverage == "undefined"){
    _yuitest_coverage = {};
    _yuitest_coverline = function(src, line){
        var coverage = _yuitest_coverage["tests/cookie.js"];
        if (!coverage.lines[line]){
            coverage.calledLines++;
        }
        coverage.lines[line]++;
    };
    _yuitest_coverfunc = function(src, name, line){
        var coverage = _yuitest_coverage["tests/cookie.js"],
            funcId = name + ":" + line;
        if (!coverage.functions[funcId]){
            coverage.calledFunctions++;
        }
        coverage.functions[funcId]++;
    };
}
_yuitest_coverage["tests/cookie.js"] = {
    lines: {"6":0,"13":0,"33":0,"37":0,"39":0,"40":0,"44":0,"45":0,"49":0,"50":0,"54":0,"55":0,"59":0,"73":0,"75":0,"76":0,"79":0,"81":0,"82":0,"83":0,"87":0,"100":0,"104":0,"105":0,"106":0,"107":0,"111":0,"125":0,"127":0,"129":0,"132":0,"137":0,"140":0,"141":0,"142":0,"143":0,"144":0,"150":0,"151":0,"153":0,"158":0,"175":0,"176":0,"179":0,"181":0,"200":0,"203":0,"204":0,"205":0,"206":0,"207":0,"209":0,"212":0,"214":0,"215":0,"218":0,"219":0,"222":0,"223":0,"225":0,"244":0,"247":0,"249":0,"250":0,"253":0,"254":0,"257":0,"258":0,"260":0,"263":0,"278":0,"281":0,"282":0,"285":0,"286":0,"287":0,"289":0,"307":0,"308":0,"312":0,"317":0,"335":0,"337":0,"340":0,"341":0,"345":0,"346":0,"350":0,"353":0,"354":0,"356":0,"359":0,"362":0,"363":0,"364":0,"368":0,"371":0,"389":0,"391":0,"393":0,"394":0,"397":0,"398":0,"401":0,"402":0,"403":0,"420":0,"422":0,"423":0,"426":0,"427":0,"430":0,"431":0,"434":0,"436":0,"437":0,"440":0,"442":0,"459":0,"461":0,"462":0,"465":0,"466":0,"469":0,"470":0,"471":0,"476":0},
    functions: {"_createCookieString:30":0,"_createCookieHashString:70":0,"_parseCookieHash:98":0,"(anonymous 5):129":0,"_parseCookieString:123":0,"exists:173":0,"get:198":0,"getSub:242":0,"getSubs:276":0,"remove:304":0,"removeSub:333":0,"set:387":0,"setSub:418":0,"setSubs:457":0},
    totalLines: 127,
    calledLines: 0,
    totalFunctions: 14,
    calledFunctions: 0
};
(_yuitest_coverline("tests/cookie.js", 6)); YAHOO.namespace("util");

/**
 * Cookie utility.
 * @class Cookie
 * @static
 */
(_yuitest_coverline("tests/cookie.js", 13)); YAHOO.util.Cookie = {
    
    //-------------------------------------------------------------------------
    // Private Methods
    //-------------------------------------------------------------------------
    
    /**
     * Creates a cookie string that can be assigned into document.cookie.
     * @param {String} name The name of the cookie.
     * @param {String} value The value of the cookie.
     * @param {Boolean} encodeValue True to encode the value, false to leave as-is.
     * @param {Object} options (Optional) Options for the cookie.
     * @return {String} The formatted cookie string.
     * @method _createCookieString
     * @private
     * @static
     */
    _createCookieString : function (name /*:String*/, value /*:Variant*/, encodeValue /*:Boolean*/, options /*:Object*/) /*:String*/ {
        
        //shortcut
        (_yuitest_coverfunc("tests/cookie.js", "_createCookieString", 30));
(_yuitest_coverline("tests/cookie.js", 33)); var lang = YAHOO.lang,
            text = encodeURIComponent(name) + "=" + (encodeValue ? encodeURIComponent(value) : value);
        
        
        (_yuitest_coverline("tests/cookie.js", 37)); if (lang.isObject(options)){
            //expiration date
            (_yuitest_coverline("tests/cookie.js", 39)); if (options.expires instanceof Date){
                (_yuitest_coverline("tests/cookie.js", 40)); text += "; expires=" + options.expires.toUTCString();
            }
            
            //path
            (_yuitest_coverline("tests/cookie.js", 44)); if (lang.isString(options.path) && options.path !== ""){
                (_yuitest_coverline("tests/cookie.js", 45)); text += "; path=" + options.path;
            }
            
            //domain
            (_yuitest_coverline("tests/cookie.js", 49)); if (lang.isString(options.domain) && options.domain !== ""){
                (_yuitest_coverline("tests/cookie.js", 50)); text += "; domain=" + options.domain;
            }
            
            //secure
            (_yuitest_coverline("tests/cookie.js", 54)); if (options.secure === true){
                (_yuitest_coverline("tests/cookie.js", 55)); text += "; secure";
            }
        }
        
        (_yuitest_coverline("tests/cookie.js", 59)); return text;
    },
    
    /**
     * Formats a cookie value for an object containing multiple values.
     * @param {Object} hash An object of key-value pairs to create a string for.
     * @return {String} A string suitable for use as a cookie value.
     * @method _createCookieHashString
     * @private
     * @static
     */
    _createCookieHashString : function (hash /*:Object*/) /*:String*/ {
        
        //shortcuts
        (_yuitest_coverfunc("tests/cookie.js", "_createCookieHashString", 70));
(_yuitest_coverline("tests/cookie.js", 73)); var lang = YAHOO.lang;
        
        (_yuitest_coverline("tests/cookie.js", 75)); if (!lang.isObject(hash)){
            (_yuitest_coverline("tests/cookie.js", 76)); throw new TypeError("Cookie._createCookieHashString(): Argument must be an object.");
        }
        
        (_yuitest_coverline("tests/cookie.js", 79)); var text /*:Array*/ = [];
        
        (_yuitest_coverline("tests/cookie.js", 81)); for (var key in hash){
            (_yuitest_coverline("tests/cookie.js", 82)); if (lang.hasOwnProperty(hash, key) && !lang.isFunction(hash[key]) && !lang.isUndefined(hash[key])){
                (_yuitest_coverline("tests/cookie.js", 83)); text.push(encodeURIComponent(key) + "=" + encodeURIComponent(String(hash[key])));
            }
        }
        
        (_yuitest_coverline("tests/cookie.js", 87)); return text.join("&");
    },
    
    /**
     * Parses a cookie hash string into an object.
     * @param {String} text The cookie hash string to parse. The string should already be URL-decoded.
     * @return {Object} An object containing entries for each cookie value.
     * @method _parseCookieHash
     * @private
     * @static
     */
    _parseCookieHash : function (text /*:String*/) /*:Object*/ {
        
        (_yuitest_coverfunc("tests/cookie.js", "_parseCookieHash", 98));
(_yuitest_coverline("tests/cookie.js", 100)); var hashParts /*:Array*/ = text.split("&"),
            hashPart /*:Array*/ = null,
            hash /*:Object*/ = {};
        
        (_yuitest_coverline("tests/cookie.js", 104)); if (text.length > 0){
            (_yuitest_coverline("tests/cookie.js", 105)); for (var i=0, len=hashParts.length; i < len; i++){
                (_yuitest_coverline("tests/cookie.js", 106)); hashPart = hashParts[i].split("=");
                (_yuitest_coverline("tests/cookie.js", 107)); hash[decodeURIComponent(hashPart[0])] = decodeURIComponent(hashPart[1]);
            }
        }
        
        (_yuitest_coverline("tests/cookie.js", 111)); return hash;
    },
    
    /**
     * Parses a cookie string into an object representing all accessible cookies.
     * @param {String} text The cookie string to parse.
     * @param {Boolean} decode (Optional) Indicates if the cookie values should be decoded or not. Default is true.
     * @return {Object} An object containing entries for each accessible cookie.
     * @method _parseCookieString
     * @private
     * @static
     */
    _parseCookieString : function (text /*:String*/, decode /*:Boolean*/) /*:Object*/ {
        
        (_yuitest_coverfunc("tests/cookie.js", "_parseCookieString", 123));
(_yuitest_coverline("tests/cookie.js", 125)); var cookies /*:Object*/ = {};
        
        (_yuitest_coverline("tests/cookie.js", 127)); if (YAHOO.lang.isString(text) && text.length > 0) {
            
            (_yuitest_coverline("tests/cookie.js", 129)); var decodeValue = (decode === false ? function(s){(_yuitest_coverfunc("tests/cookie.js", "(anonymous 5)", 129));
return s;} : decodeURIComponent);
            
            //if (/[^=]+=[^=;]?(?:; [^=]+=[^=]?)?/.test(text)){
                (_yuitest_coverline("tests/cookie.js", 132)); var cookieParts /*:Array*/ = text.split(/;\s/g),
                    cookieName /*:String*/ = null,
                    cookieValue /*:String*/ = null,
                    cookieNameValue /*:Array*/ = null;
                
                (_yuitest_coverline("tests/cookie.js", 137)); for (var i=0, len=cookieParts.length; i < len; i++){
                    
                    //check for normally-formatted cookie (name-value)
                    (_yuitest_coverline("tests/cookie.js", 140)); cookieNameValue = cookieParts[i].match(/([^=]+)=/i);
                    (_yuitest_coverline("tests/cookie.js", 141)); if (cookieNameValue instanceof Array){
                        (_yuitest_coverline("tests/cookie.js", 142)); try {
                            (_yuitest_coverline("tests/cookie.js", 143)); cookieName = decodeURIComponent(cookieNameValue[1]);
                            (_yuitest_coverline("tests/cookie.js", 144)); cookieValue = decodeValue(cookieParts[i].substring(cookieNameValue[1].length+1));
                        } catch (ex){
                            //ignore the entire cookie - encoding is likely invalid
                        }
                    } else {
                        //means the cookie does not have an "=", so treat it as a boolean flag
                        (_yuitest_coverline("tests/cookie.js", 150)); cookieName = decodeURIComponent(cookieParts[i]);
                        (_yuitest_coverline("tests/cookie.js", 151)); cookieValue = "";
                    }
                    (_yuitest_coverline("tests/cookie.js", 153)); cookies[cookieName] = cookieValue;
                }
            //}
        }
        
        (_yuitest_coverline("tests/cookie.js", 158)); return cookies;
    },
    
    //-------------------------------------------------------------------------
    // Public Methods
    //-------------------------------------------------------------------------
    
    /**
     * Determines if the cookie with the given name exists. This is useful for
     * Boolean cookies (those that do not follow the name=value convention).
     * @param {String} name The name of the cookie to check.
     * @return {Boolean} True if the cookie exists, false if not.
     * @method exists
     * @static
     */
    exists: function(name) {

        (_yuitest_coverfunc("tests/cookie.js", "exists", 173));
(_yuitest_coverline("tests/cookie.js", 175)); if (!YAHOO.lang.isString(name) || name === ""){
            (_yuitest_coverline("tests/cookie.js", 176)); throw new TypeError("Cookie.exists(): Cookie name must be a non-empty string.");
        }

        (_yuitest_coverline("tests/cookie.js", 179)); var cookies /*:Object*/ = this._parseCookieString(document.cookie, true);
        
        (_yuitest_coverline("tests/cookie.js", 181)); return cookies.hasOwnProperty(name);
    },
    
    /**
     * Returns the cookie value for the given name.
     * @param {String} name The name of the cookie to retrieve.
     * @param {Object|Function} options (Optional) An object containing one or more
     *      cookie options: raw (true/false) and converter (a function).
     *      The converter function is run on the value before returning it. The
     *      function is not used if the cookie doesn't exist. The function can be
     *      passed instead of the options object for backwards compatibility.
     * @return {Variant} If no converter is specified, returns a string or null if
     *      the cookie doesn't exist. If the converter is specified, returns the value
     *      returned from the converter or null if the cookie doesn't exist.
     * @method get
     * @static
     */
    get : function (name /*:String*/, options /*:Variant*/) /*:Variant*/{
        
        (_yuitest_coverfunc("tests/cookie.js", "get", 198));
(_yuitest_coverline("tests/cookie.js", 200)); var lang = YAHOO.lang,
            converter;
        
        (_yuitest_coverline("tests/cookie.js", 203)); if (lang.isFunction(options)) {
            (_yuitest_coverline("tests/cookie.js", 204)); converter = options;
            (_yuitest_coverline("tests/cookie.js", 205)); options = {};
        } else {(_yuitest_coverline("tests/cookie.js", 206)); if (lang.isObject(options)) {
            (_yuitest_coverline("tests/cookie.js", 207)); converter = options.converter;
        } else {
            (_yuitest_coverline("tests/cookie.js", 209)); options = {};
        }}
        
        (_yuitest_coverline("tests/cookie.js", 212)); var cookies /*:Object*/ = this._parseCookieString(document.cookie, !options.raw);
        
        (_yuitest_coverline("tests/cookie.js", 214)); if (!lang.isString(name) || name === ""){
            (_yuitest_coverline("tests/cookie.js", 215)); throw new TypeError("Cookie.get(): Cookie name must be a non-empty string.");
        }
        
        (_yuitest_coverline("tests/cookie.js", 218)); if (lang.isUndefined(cookies[name])) {
            (_yuitest_coverline("tests/cookie.js", 219)); return null;
        }
        
        (_yuitest_coverline("tests/cookie.js", 222)); if (!lang.isFunction(converter)){
            (_yuitest_coverline("tests/cookie.js", 223)); return cookies[name];
        } else {
            (_yuitest_coverline("tests/cookie.js", 225)); return converter(cookies[name]);
        }
    },
    
    /**
     * Returns the value of a subcookie.
     * @param {String} name The name of the cookie to retrieve.
     * @param {String} subName The name of the subcookie to retrieve.
     * @param {Function} converter (Optional) A function to run on the value before returning
     *      it. The function is not used if the cookie doesn't exist.
     * @return {Variant} If the cookie doesn't exist, null is returned. If the subcookie
     *      doesn't exist, null if also returned. If no converter is specified and the
     *      subcookie exists, a string is returned. If a converter is specified and the
     *      subcookie exists, the value returned from the converter is returned.
     * @method getSub
     * @static
     */
    getSub : function (name, subName, converter) {
        
        (_yuitest_coverfunc("tests/cookie.js", "getSub", 242));
(_yuitest_coverline("tests/cookie.js", 244)); var lang = YAHOO.lang,
            hash = this.getSubs(name);
        
        (_yuitest_coverline("tests/cookie.js", 247)); if (hash !== null) {
            
            (_yuitest_coverline("tests/cookie.js", 249)); if (!lang.isString(subName) || subName === ""){
                (_yuitest_coverline("tests/cookie.js", 250)); throw new TypeError("Cookie.getSub(): Subcookie name must be a non-empty string.");
            }
            
            (_yuitest_coverline("tests/cookie.js", 253)); if (lang.isUndefined(hash[subName])){
                (_yuitest_coverline("tests/cookie.js", 254)); return null;
            }
            
            (_yuitest_coverline("tests/cookie.js", 257)); if (!lang.isFunction(converter)){
                (_yuitest_coverline("tests/cookie.js", 258)); return hash[subName];
            } else {
                (_yuitest_coverline("tests/cookie.js", 260)); return converter(hash[subName]);
            }
        } else {
            (_yuitest_coverline("tests/cookie.js", 263)); return null;
        }
    
    },
    
    /**
     * Returns an object containing name-value pairs stored in the cookie with the given name.
     * @param {String} name The name of the cookie to retrieve.
     * @return {Object} An object of name-value pairs if the cookie with the given name
     *      exists, null if it does not.
     * @method getSubs
     * @static
     */
    getSubs : function (name /*:String*/) /*:Object*/ {
    
        (_yuitest_coverfunc("tests/cookie.js", "getSubs", 276));
(_yuitest_coverline("tests/cookie.js", 278)); var isString = YAHOO.lang.isString;
        
        //check cookie name
        (_yuitest_coverline("tests/cookie.js", 281)); if (!isString(name) || name === ""){
            (_yuitest_coverline("tests/cookie.js", 282)); throw new TypeError("Cookie.getSubs(): Cookie name must be a non-empty string.");
        }
        
        (_yuitest_coverline("tests/cookie.js", 285)); var cookies = this._parseCookieString(document.cookie, false);
        (_yuitest_coverline("tests/cookie.js", 286)); if (isString(cookies[name])){
            (_yuitest_coverline("tests/cookie.js", 287)); return this._parseCookieHash(cookies[name]);
        }
        (_yuitest_coverline("tests/cookie.js", 289)); return null;
    },
    
    /**
     * Removes a cookie from the machine by setting its expiration date to
     * sometime in the past.
     * @param {String} name The name of the cookie to remove.
     * @param {Object} options (Optional) An object containing one or more
     *      cookie options: path (a string), domain (a string),
     *      and secure (true/false). The expires option will be overwritten
     *      by the method.
     * @return {String} The created cookie string.
     * @method remove
     * @static
     */
    remove : function (name /*:String*/, options /*:Object*/) /*:String*/ {
        
        //check cookie name
        (_yuitest_coverfunc("tests/cookie.js", "remove", 304));
(_yuitest_coverline("tests/cookie.js", 307)); if (!YAHOO.lang.isString(name) || name === ""){
            (_yuitest_coverline("tests/cookie.js", 308)); throw new TypeError("Cookie.remove(): Cookie name must be a non-empty string.");
        }
        
        //set options - clone options so the original isn't affected
        (_yuitest_coverline("tests/cookie.js", 312)); options = YAHOO.lang.merge(options || {}, {
            expires: new Date(0)
        });
        
        //set cookie
        (_yuitest_coverline("tests/cookie.js", 317)); return this.set(name, "", options);
    },
    
    /**
     * Removes a subcookie with a given name. Removing the last subcookie
     *      won't remove the entire cookie unless options.removeIfEmpty is true.
     * @param {String} name The name of the cookie in which the subcookie exists.
     * @param {String} subName The name of the subcookie to remove.
     * @param {Object} options (Optional) An object containing one or more
     *      cookie options: path (a string), domain (a string), expires (a Date object),
     *      removeIfEmpty (true/false), and secure (true/false). This must be the same
     *      settings as the original subcookie.
     * @return {String} The created cookie string.
     * @method removeSub
     * @static
     */
    removeSub : function(name /*:String*/, subName /*:String*/, options /*:Object*/) /*:String*/ {
        
        (_yuitest_coverfunc("tests/cookie.js", "removeSub", 333));
(_yuitest_coverline("tests/cookie.js", 335)); var lang = YAHOO.lang;
        
        (_yuitest_coverline("tests/cookie.js", 337)); options = options || {};
        
        //check cookie name
        (_yuitest_coverline("tests/cookie.js", 340)); if (!lang.isString(name) || name === ""){
            (_yuitest_coverline("tests/cookie.js", 341)); throw new TypeError("Cookie.removeSub(): Cookie name must be a non-empty string.");
        }
        
        //check subcookie name
        (_yuitest_coverline("tests/cookie.js", 345)); if (!lang.isString(subName) || subName === ""){
            (_yuitest_coverline("tests/cookie.js", 346)); throw new TypeError("Cookie.removeSub(): Subcookie name must be a non-empty string.");
        }
        
        //get all subcookies for this cookie
        (_yuitest_coverline("tests/cookie.js", 350)); var subs = this.getSubs(name);
        
        //delete the indicated subcookie
        (_yuitest_coverline("tests/cookie.js", 353)); if (lang.isObject(subs) && lang.hasOwnProperty(subs, subName)){
            (_yuitest_coverline("tests/cookie.js", 354)); delete subs[subName];

            (_yuitest_coverline("tests/cookie.js", 356)); if (!options.removeIfEmpty) {
                //reset the cookie

                (_yuitest_coverline("tests/cookie.js", 359)); return this.setSubs(name, subs, options);
            } else {
                //reset the cookie if there are subcookies left, else remove
                (_yuitest_coverline("tests/cookie.js", 362)); for (var key in subs){
                    (_yuitest_coverline("tests/cookie.js", 363)); if (lang.hasOwnProperty(subs, key) && !lang.isFunction(subs[key]) && !lang.isUndefined(subs[key])){
                        (_yuitest_coverline("tests/cookie.js", 364)); return this.setSubs(name, subs, options);
                    }
                }
                
                (_yuitest_coverline("tests/cookie.js", 368)); return this.remove(name, options);
            }
        } else {
            (_yuitest_coverline("tests/cookie.js", 371)); return "";
        }
        
    },
    
    /**
     * Sets a cookie with a given name and value.
     * @param {String} name The name of the cookie to set.
     * @param {Variant} value The value to set for the cookie.
     * @param {Object} options (Optional) An object containing one or more
     *      cookie options: path (a string), domain (a string), expires (a Date object),
     *      raw (true/false), and secure (true/false).
     * @return {String} The created cookie string.
     * @method set
     * @static
     */
    set : function (name /*:String*/, value /*:Variant*/, options /*:Object*/) /*:String*/ {
        
        (_yuitest_coverfunc("tests/cookie.js", "set", 387));
(_yuitest_coverline("tests/cookie.js", 389)); var lang = YAHOO.lang;
        
        (_yuitest_coverline("tests/cookie.js", 391)); options = options || {};
        
        (_yuitest_coverline("tests/cookie.js", 393)); if (!lang.isString(name)){
            (_yuitest_coverline("tests/cookie.js", 394)); throw new TypeError("Cookie.set(): Cookie name must be a string.");
        }
        
        (_yuitest_coverline("tests/cookie.js", 397)); if (lang.isUndefined(value)){
            (_yuitest_coverline("tests/cookie.js", 398)); throw new TypeError("Cookie.set(): Value cannot be undefined.");
        }
        
        (_yuitest_coverline("tests/cookie.js", 401)); var text /*:String*/ = this._createCookieString(name, value, !options.raw, options);
        (_yuitest_coverline("tests/cookie.js", 402)); document.cookie = text;
        (_yuitest_coverline("tests/cookie.js", 403)); return text;
    },
    
    /**
     * Sets a sub cookie with a given name to a particular value.
     * @param {String} name The name of the cookie to set.
     * @param {String} subName The name of the subcookie to set.
     * @param {Variant} value The value to set.
     * @param {Object} options (Optional) An object containing one or more
     *      cookie options: path (a string), domain (a string), expires (a Date object),
     *      and secure (true/false).
     * @return {String} The created cookie string.
     * @method setSub
     * @static
     */
    setSub : function (name /*:String*/, subName /*:String*/, value /*:Variant*/, options /*:Object*/) /*:String*/ {
        
        (_yuitest_coverfunc("tests/cookie.js", "setSub", 418));
(_yuitest_coverline("tests/cookie.js", 420)); var lang = YAHOO.lang;
        
        (_yuitest_coverline("tests/cookie.js", 422)); if (!lang.isString(name) || name === ""){
            (_yuitest_coverline("tests/cookie.js", 423)); throw new TypeError("Cookie.setSub(): Cookie name must be a non-empty string.");
        }
        
        (_yuitest_coverline("tests/cookie.js", 426)); if (!lang.isString(subName) || subName === ""){
            (_yuitest_coverline("tests/cookie.js", 427)); throw new TypeError("Cookie.setSub(): Subcookie name must be a non-empty string.");
        }
        
        (_yuitest_coverline("tests/cookie.js", 430)); if (lang.isUndefined(value)){
            (_yuitest_coverline("tests/cookie.js", 431)); throw new TypeError("Cookie.setSub(): Subcookie value cannot be undefined.");
        }
        
        (_yuitest_coverline("tests/cookie.js", 434)); var hash /*:Object*/ = this.getSubs(name);
        
        (_yuitest_coverline("tests/cookie.js", 436)); if (!lang.isObject(hash)){
            (_yuitest_coverline("tests/cookie.js", 437)); hash = {};
        }
        
        (_yuitest_coverline("tests/cookie.js", 440)); hash[subName] = value;
        
        (_yuitest_coverline("tests/cookie.js", 442)); return this.setSubs(name, hash, options);
        
    },
    
    /**
     * Sets a cookie with a given name to contain a hash of name-value pairs.
     * @param {String} name The name of the cookie to set.
     * @param {Object} value An object containing name-value pairs.
     * @param {Object} options (Optional) An object containing one or more
     *      cookie options: path (a string), domain (a string), expires (a Date object),
     *      and secure (true/false).
     * @return {String} The created cookie string.
     * @method setSubs
     * @static
     */
    setSubs : function (name /*:String*/, value /*:Object*/, options /*:Object*/) /*:String*/ {
        
        (_yuitest_coverfunc("tests/cookie.js", "setSubs", 457));
(_yuitest_coverline("tests/cookie.js", 459)); var lang = YAHOO.lang;
        
        (_yuitest_coverline("tests/cookie.js", 461)); if (!lang.isString(name)){
            (_yuitest_coverline("tests/cookie.js", 462)); throw new TypeError("Cookie.setSubs(): Cookie name must be a string.");
        }
        
        (_yuitest_coverline("tests/cookie.js", 465)); if (!lang.isObject(value)){
            (_yuitest_coverline("tests/cookie.js", 466)); throw new TypeError("Cookie.setSubs(): Cookie value must be an object.");
        }
        
        (_yuitest_coverline("tests/cookie.js", 469)); var text /*:String*/ = this._createCookieString(name, this._createCookieHashString(value), false, options);
        (_yuitest_coverline("tests/cookie.js", 470)); document.cookie = text;
        (_yuitest_coverline("tests/cookie.js", 471)); return text;
    }

};

(_yuitest_coverline("tests/cookie.js", 476)); YAHOO.register("cookie", YAHOO.util.Cookie, {version: "@VERSION@", build: "@BUILD@"});
_yuitest_coverage["tests/cookie.js"].code=["/**"," * Utilities for cookie management"," * @namespace YAHOO.util"," * @module cookie"," */","YAHOO.namespace(\"util\");","","/**"," * Cookie utility."," * @class Cookie"," * @static"," */","YAHOO.util.Cookie = {","    ","    //-------------------------------------------------------------------------","    // Private Methods","    //-------------------------------------------------------------------------","    ","    /**","     * Creates a cookie string that can be assigned into document.cookie.","     * @param {String} name The name of the cookie.","     * @param {String} value The value of the cookie.","     * @param {Boolean} encodeValue True to encode the value, false to leave as-is.","     * @param {Object} options (Optional) Options for the cookie.","     * @return {String} The formatted cookie string.","     * @method _createCookieString","     * @private","     * @static","     */","    _createCookieString : function (name /*:String*/, value /*:Variant*/, encodeValue /*:Boolean*/, options /*:Object*/) /*:String*/ {","        ","        //shortcut","        var lang = YAHOO.lang,","            text = encodeURIComponent(name) + \"=\" + (encodeValue ? encodeURIComponent(value) : value);","        ","        ","        if (lang.isObject(options)){","            //expiration date","            if (options.expires instanceof Date){","                text += \"; expires=\" + options.expires.toUTCString();","            }","            ","            //path","            if (lang.isString(options.path) && options.path !== \"\"){","                text += \"; path=\" + options.path;","            }","            ","            //domain","            if (lang.isString(options.domain) && options.domain !== \"\"){","                text += \"; domain=\" + options.domain;","            }","            ","            //secure","            if (options.secure === true){","                text += \"; secure\";","            }","        }","        ","        return text;","    },","    ","    /**","     * Formats a cookie value for an object containing multiple values.","     * @param {Object} hash An object of key-value pairs to create a string for.","     * @return {String} A string suitable for use as a cookie value.","     * @method _createCookieHashString","     * @private","     * @static","     */","    _createCookieHashString : function (hash /*:Object*/) /*:String*/ {","        ","        //shortcuts","        var lang = YAHOO.lang;","        ","        if (!lang.isObject(hash)){","            throw new TypeError(\"Cookie._createCookieHashString(): Argument must be an object.\");","        }","        ","        var text /*:Array*/ = [];","        ","        for (var key in hash){","            if (lang.hasOwnProperty(hash, key) && !lang.isFunction(hash[key]) && !lang.isUndefined(hash[key])){","                text.push(encodeURIComponent(key) + \"=\" + encodeURIComponent(String(hash[key])));","            }","        }","        ","        return text.join(\"&\");","    },","    ","    /**","     * Parses a cookie hash string into an object.","     * @param {String} text The cookie hash string to parse. The string should already be URL-decoded.","     * @return {Object} An object containing entries for each cookie value.","     * @method _parseCookieHash","     * @private","     * @static","     */","    _parseCookieHash : function (text /*:String*/) /*:Object*/ {","        ","        var hashParts /*:Array*/ = text.split(\"&\"),","            hashPart /*:Array*/ = null,","            hash /*:Object*/ = {};","        ","        if (text.length > 0){","            for (var i=0, len=hashParts.length; i < len; i++){","                hashPart = hashParts[i].split(\"=\");","                hash[decodeURIComponent(hashPart[0])] = decodeURIComponent(hashPart[1]);","            }","        }","        ","        return hash;","    },","    ","    /**","     * Parses a cookie string into an object representing all accessible cookies.","     * @param {String} text The cookie string to parse.","     * @param {Boolean} decode (Optional) Indicates if the cookie values should be decoded or not. Default is true.","     * @return {Object} An object containing entries for each accessible cookie.","     * @method _parseCookieString","     * @private","     * @static","     */","    _parseCookieString : function (text /*:String*/, decode /*:Boolean*/) /*:Object*/ {","        ","        var cookies /*:Object*/ = {};","        ","        if (YAHOO.lang.isString(text) && text.length > 0) {","            ","            var decodeValue = (decode === false ? function(s){return s;} : decodeURIComponent);","            ","            //if (/[^=]+=[^=;]?(?:; [^=]+=[^=]?)?/.test(text)){","                var cookieParts /*:Array*/ = text.split(/;\\s/g),","                    cookieName /*:String*/ = null,","                    cookieValue /*:String*/ = null,","                    cookieNameValue /*:Array*/ = null;","                ","                for (var i=0, len=cookieParts.length; i < len; i++){","                    ","                    //check for normally-formatted cookie (name-value)","                    cookieNameValue = cookieParts[i].match(/([^=]+)=/i);","                    if (cookieNameValue instanceof Array){","                        try {","                            cookieName = decodeURIComponent(cookieNameValue[1]);","                            cookieValue = decodeValue(cookieParts[i].substring(cookieNameValue[1].length+1));","                        } catch (ex){","                            //ignore the entire cookie - encoding is likely invalid","                        }","                    } else {","                        //means the cookie does not have an \"=\", so treat it as a boolean flag","                        cookieName = decodeURIComponent(cookieParts[i]);","                        cookieValue = \"\";","                    }","                    cookies[cookieName] = cookieValue;","                }","            //}","        }","        ","        return cookies;","    },","    ","    //-------------------------------------------------------------------------","    // Public Methods","    //-------------------------------------------------------------------------","    ","    /**","     * Determines if the cookie with the given name exists. This is useful for","     * Boolean cookies (those that do not follow the name=value convention).","     * @param {String} name The name of the cookie to check.","     * @return {Boolean} True if the cookie exists, false if not.","     * @method exists","     * @static","     */","    exists: function(name) {","","        if (!YAHOO.lang.isString(name) || name === \"\"){","            throw new TypeError(\"Cookie.exists(): Cookie name must be a non-empty string.\");","        }","","        var cookies /*:Object*/ = this._parseCookieString(document.cookie, true);","        ","        return cookies.hasOwnProperty(name);","    },","    ","    /**","     * Returns the cookie value for the given name.","     * @param {String} name The name of the cookie to retrieve.","     * @param {Object|Function} options (Optional) An object containing one or more","     *      cookie options: raw (true/false) and converter (a function).","     *      The converter function is run on the value before returning it. The","     *      function is not used if the cookie doesn't exist. The function can be","     *      passed instead of the options object for backwards compatibility.","     * @return {Variant} If no converter is specified, returns a string or null if","     *      the cookie doesn't exist. If the converter is specified, returns the value","     *      returned from the converter or null if the cookie doesn't exist.","     * @method get","     * @static","     */","    get : function (name /*:String*/, options /*:Variant*/) /*:Variant*/{","        ","        var lang = YAHOO.lang,","            converter;","        ","        if (lang.isFunction(options)) {","            converter = options;","            options = {};","        } else if (lang.isObject(options)) {","            converter = options.converter;","        } else {","            options = {};","        }","        ","        var cookies /*:Object*/ = this._parseCookieString(document.cookie, !options.raw);","        ","        if (!lang.isString(name) || name === \"\"){","            throw new TypeError(\"Cookie.get(): Cookie name must be a non-empty string.\");","        }","        ","        if (lang.isUndefined(cookies[name])) {","            return null;","        }","        ","        if (!lang.isFunction(converter)){","            return cookies[name];","        } else {","            return converter(cookies[name]);","        }","    },","    ","    /**","     * Returns the value of a subcookie.","     * @param {String} name The name of the cookie to retrieve.","     * @param {String} subName The name of the subcookie to retrieve.","     * @param {Function} converter (Optional) A function to run on the value before returning","     *      it. The function is not used if the cookie doesn't exist.","     * @return {Variant} If the cookie doesn't exist, null is returned. If the subcookie","     *      doesn't exist, null if also returned. If no converter is specified and the","     *      subcookie exists, a string is returned. If a converter is specified and the","     *      subcookie exists, the value returned from the converter is returned.","     * @method getSub","     * @static","     */","    getSub : function (name, subName, converter) {","        ","        var lang = YAHOO.lang,","            hash = this.getSubs(name);","        ","        if (hash !== null) {","            ","            if (!lang.isString(subName) || subName === \"\"){","                throw new TypeError(\"Cookie.getSub(): Subcookie name must be a non-empty string.\");","            }","            ","            if (lang.isUndefined(hash[subName])){","                return null;","            }","            ","            if (!lang.isFunction(converter)){","                return hash[subName];","            } else {","                return converter(hash[subName]);","            }","        } else {","            return null;","        }","    ","    },","    ","    /**","     * Returns an object containing name-value pairs stored in the cookie with the given name.","     * @param {String} name The name of the cookie to retrieve.","     * @return {Object} An object of name-value pairs if the cookie with the given name","     *      exists, null if it does not.","     * @method getSubs","     * @static","     */","    getSubs : function (name /*:String*/) /*:Object*/ {","    ","        var isString = YAHOO.lang.isString;","        ","        //check cookie name","        if (!isString(name) || name === \"\"){","            throw new TypeError(\"Cookie.getSubs(): Cookie name must be a non-empty string.\");","        }","        ","        var cookies = this._parseCookieString(document.cookie, false);","        if (isString(cookies[name])){","            return this._parseCookieHash(cookies[name]);","        }","        return null;","    },","    ","    /**","     * Removes a cookie from the machine by setting its expiration date to","     * sometime in the past.","     * @param {String} name The name of the cookie to remove.","     * @param {Object} options (Optional) An object containing one or more","     *      cookie options: path (a string), domain (a string),","     *      and secure (true/false). The expires option will be overwritten","     *      by the method.","     * @return {String} The created cookie string.","     * @method remove","     * @static","     */","    remove : function (name /*:String*/, options /*:Object*/) /*:String*/ {","        ","        //check cookie name","        if (!YAHOO.lang.isString(name) || name === \"\"){","            throw new TypeError(\"Cookie.remove(): Cookie name must be a non-empty string.\");","        }","        ","        //set options - clone options so the original isn't affected","        options = YAHOO.lang.merge(options || {}, {","            expires: new Date(0)","        });","        ","        //set cookie","        return this.set(name, \"\", options);","    },","    ","    /**","     * Removes a subcookie with a given name. Removing the last subcookie","     *      won't remove the entire cookie unless options.removeIfEmpty is true.","     * @param {String} name The name of the cookie in which the subcookie exists.","     * @param {String} subName The name of the subcookie to remove.","     * @param {Object} options (Optional) An object containing one or more","     *      cookie options: path (a string), domain (a string), expires (a Date object),","     *      removeIfEmpty (true/false), and secure (true/false). This must be the same","     *      settings as the original subcookie.","     * @return {String} The created cookie string.","     * @method removeSub","     * @static","     */","    removeSub : function(name /*:String*/, subName /*:String*/, options /*:Object*/) /*:String*/ {","        ","        var lang = YAHOO.lang;","        ","        options = options || {};","        ","        //check cookie name","        if (!lang.isString(name) || name === \"\"){","            throw new TypeError(\"Cookie.removeSub(): Cookie name must be a non-empty string.\");","        }","        ","        //check subcookie name","        if (!lang.isString(subName) || subName === \"\"){","            throw new TypeError(\"Cookie.removeSub(): Subcookie name must be a non-empty string.\");","        }","        ","        //get all subcookies for this cookie","        var subs = this.getSubs(name);","        ","        //delete the indicated subcookie","        if (lang.isObject(subs) && lang.hasOwnProperty(subs, subName)){","            delete subs[subName];","","            if (!options.removeIfEmpty) {","                //reset the cookie","","                return this.setSubs(name, subs, options);","            } else {","                //reset the cookie if there are subcookies left, else remove","                for (var key in subs){","                    if (lang.hasOwnProperty(subs, key) && !lang.isFunction(subs[key]) && !lang.isUndefined(subs[key])){","                        return this.setSubs(name, subs, options);","                    }","                }","                ","                return this.remove(name, options);","            }","        } else {","            return \"\";","        }","        ","    },","    ","    /**","     * Sets a cookie with a given name and value.","     * @param {String} name The name of the cookie to set.","     * @param {Variant} value The value to set for the cookie.","     * @param {Object} options (Optional) An object containing one or more","     *      cookie options: path (a string), domain (a string), expires (a Date object),","     *      raw (true/false), and secure (true/false).","     * @return {String} The created cookie string.","     * @method set","     * @static","     */","    set : function (name /*:String*/, value /*:Variant*/, options /*:Object*/) /*:String*/ {","        ","        var lang = YAHOO.lang;","        ","        options = options || {};","        ","        if (!lang.isString(name)){","            throw new TypeError(\"Cookie.set(): Cookie name must be a string.\");","        }","        ","        if (lang.isUndefined(value)){","            throw new TypeError(\"Cookie.set(): Value cannot be undefined.\");","        }","        ","        var text /*:String*/ = this._createCookieString(name, value, !options.raw, options);","        document.cookie = text;","        return text;","    },","    ","    /**","     * Sets a sub cookie with a given name to a particular value.","     * @param {String} name The name of the cookie to set.","     * @param {String} subName The name of the subcookie to set.","     * @param {Variant} value The value to set.","     * @param {Object} options (Optional) An object containing one or more","     *      cookie options: path (a string), domain (a string), expires (a Date object),","     *      and secure (true/false).","     * @return {String} The created cookie string.","     * @method setSub","     * @static","     */","    setSub : function (name /*:String*/, subName /*:String*/, value /*:Variant*/, options /*:Object*/) /*:String*/ {","        ","        var lang = YAHOO.lang;","        ","        if (!lang.isString(name) || name === \"\"){","            throw new TypeError(\"Cookie.setSub(): Cookie name must be a non-empty string.\");","        }","        ","        if (!lang.isString(subName) || subName === \"\"){","            throw new TypeError(\"Cookie.setSub(): Subcookie name must be a non-empty string.\");","        }","        ","        if (lang.isUndefined(value)){","            throw new TypeError(\"Cookie.setSub(): Subcookie value cannot be undefined.\");","        }","        ","        var hash /*:Object*/ = this.getSubs(name);","        ","        if (!lang.isObject(hash)){","            hash = {};","        }","        ","        hash[subName] = value;","        ","        return this.setSubs(name, hash, options);","        ","    },","    ","    /**","     * Sets a cookie with a given name to contain a hash of name-value pairs.","     * @param {String} name The name of the cookie to set.","     * @param {Object} value An object containing name-value pairs.","     * @param {Object} options (Optional) An object containing one or more","     *      cookie options: path (a string), domain (a string), expires (a Date object),","     *      and secure (true/false).","     * @return {String} The created cookie string.","     * @method setSubs","     * @static","     */","    setSubs : function (name /*:String*/, value /*:Object*/, options /*:Object*/) /*:String*/ {","        ","        var lang = YAHOO.lang;","        ","        if (!lang.isString(name)){","            throw new TypeError(\"Cookie.setSubs(): Cookie name must be a string.\");","        }","        ","        if (!lang.isObject(value)){","            throw new TypeError(\"Cookie.setSubs(): Cookie value must be an object.\");","        }","        ","        var text /*:String*/ = this._createCookieString(name, this._createCookieHashString(value), false, options);","        document.cookie = text;","        return text;","    }","","};","","YAHOO.register(\"cookie\", YAHOO.util.Cookie, {version: \"@VERSION@\", build: \"@BUILD@\"});"];
_yuitest_coverage["tests/cookie.js"].path = "C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\tests\\cookie.js";