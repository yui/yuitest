

/**
 * Console output that uses TestFormat formats.
 * @namespace YUITest.Node.CLI
 * @class Format
 * @constructor
 */
YUITest.CLI.Format = function(format){

    var testRunner  = YUITest.TestRunner,
        cli         = YUITest.CLI;

    //handles test runner events
    function handleEvent(event){
    
        var results = event.results;

        cli.print(format(results));
    }

    testRunner.subscribe(testRunner.COMPLETE_EVENT, handleEvent); 

};