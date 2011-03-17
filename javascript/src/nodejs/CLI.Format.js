

/**
 * Console output that uses TestFormat formats.
 * @namespace YUITest.Node.CLI
 * @class Format
 * @constructor
 */
YUITest.Node.CLI.Format = function(format){

    var testRunner  = YUITest.TestRunner;
        

    //handles test runner events
    function handleEvent(event){
    
        var results = event.results,
            sys     = require('sys');

        sys.print(format(results));
    }

    testRunner.subscribe(testRunner.COMPLETE_EVENT, handleEvent); 

};