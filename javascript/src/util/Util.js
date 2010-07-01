
/**
 * Object containing helper methods.
 * @namespace YUITest
 * @class Util
 * @static
 */
YUITest.Util = {

    /**
     * Mixes the own properties from the supplier onto the
     * receiver.
     * @param {Object} receiver The object to receive the properties.
     * @param {Object} supplier The object to supply the properties.
     * @return {Object} The receiver that was passed in.
     * @method mix
     * @static
     */
    mix: function(receiver, supplier){
    
        for (var prop in supplier){
            if (supplier.hasOwnProperty(prop)){
                receiver[prop] = supplier[prop];
            }
        }
        
        return receiver;    
    }

};
    
