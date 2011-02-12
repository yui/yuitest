

/**
 * Console output that mimics XUnit output.
 * @namespace YUITest.Node.CLI
 * @class XUnit
 * @constructor
 */
YUITest.Node.CLI.XUnit = function(){

    var testRunner  = YUITest.TestRunner,
        stdout      = process.stdout,
        failures    = [],
        stack       = [];

    //handles test runner events
    function handleEvent(event){
    
        var message = "",
            results = event.results,
            sys     = require('sys'),
            i, len;
            
        switch(event.type){
            case testRunner.BEGIN_EVENT:
                message = "YUITest for Node.js\n";
                break;
                
            case testRunner.COMPLETE_EVENT:
                message = "\nTotal tests: " + results.total + ", Failures: " + 
                    results.failed + ", Skipped: " + results.ignored +
                    ", Time: " + (results.duration/1000) + " seconds\n";
                    
                if (failures.length){
                    message += "\nTests failed:\n";
                    
                    for (i=0,len=failures.length; i < len; i++){
                        message += "\n" + (i+1) + ") " + failures[i].name + " : " + failures[i].error.getMessage() + "\n";
                        //message += "Stack trace:\n" + failures[i].error.stack + "\n";
                    }
                
                    message += "\n";
                }
                
                message += "\n";
                break;
                
            case testRunner.TEST_FAIL_EVENT:
                message = "F";
                failures.push({
                    name: stack.concat([event.testName]).join(" > "),
                    error: event.error
                });

                break;
                
            case testRunner.TEST_IGNORE_EVENT:
                message = "S";
                break;
                
            case testRunner.TEST_PASS_EVENT:
                message = ".";
                break;
                
            case testRunner.TEST_SUITE_BEGIN_EVENT:
                stack.push(event.testSuite.name);
                break;
                
            case testRunner.TEST_CASE_COMPLETE_EVENT:
            case testRunner.TEST_SUITE_COMPLETE_EVENT:
                stack.pop();
                break;
                
            case testRunner.TEST_CASE_BEGIN_EVENT:
                stack.push(event.testCase.name);
                break;
                
            //no default
        }    
        
        sys.print(message);
    }

    testRunner.subscribe(testRunner.BEGIN_EVENT, handleEvent)
    testRunner.subscribe(testRunner.TEST_FAIL_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_PASS_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_IGNORE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_CASE_BEGIN_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_CASE_COMPLETE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_SUITE_BEGIN_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_SUITE_COMPLETE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.COMPLETE_EVENT, handleEvent); 

};