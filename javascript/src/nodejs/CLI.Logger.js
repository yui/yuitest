

/**
 * Console output that mimics logger output from YUI Test for YUI 2/3.
 * @namespace YUITest.Node.CLI
 * @class Logger
 * @constructor
 */
YUITest.Node.CLI.Logger = function(){

    var testRunner = YUITest.TestRunner;

    //handles test runner events
    function handleEvent(event){
    
        var message = "";
        switch(event.type){
            case testRunner.BEGIN_EVENT:
                message = "Testing began at " + (new Date()).toString() + ".";
                messageType = "info";
                break;
                
            case testRunner.COMPLETE_EVENT:
                message = "Testing completed at " +
                    (new Date()).toString() + ".\n" +
                    "Passed:" + event.results.passed + " Failed:" + event.results.failed +
                    " Total:" + event.results.total + "(" + event.results.ignored + " ignored)"; 
                messageType = "info";
                break;
                
            case testRunner.TEST_FAIL_EVENT:
                message = event.testName + ": failed.\n" + event.error.getMessage();
                messageType = "fail";
                break;
                
            case testRunner.TEST_IGNORE_EVENT:
                message = event.testName + ": ignored.";
                messageType = "ignore";
                break;
                
            case testRunner.TEST_PASS_EVENT:
                message = event.testName + ": passed.";
                messageType = "pass";
                break;
                
            case testRunner.TEST_SUITE_BEGIN_EVENT:
                message = "Test suite \"" + event.testSuite.name + "\" started.";
                messageType = "info";
                break;
                
            case testRunner.TEST_SUITE_COMPLETE_EVENT:
                message = "Testing completed at " +
                    (new Date()).toString() + ".\n" +
                    "Passed:" + event.results.passed + " Failed:" + event.results.failed +
                    " Total:" + event.results.total + "(" + event.results.ignored + " ignored)";
                messageType = "info";
                break;
                
            case testRunner.TEST_CASE_BEGIN_EVENT:
                message = "Test case \"" + event.testCase.name + "\" started.";
                messageType = "info";
                break;
                
            case testRunner.TEST_CASE_COMPLETE_EVENT:
                message = "Testing completed at " +
                    (new Date()).toString() + ".\n" +
                    "Passed:" + event.results.passed + " Failed:" + event.results.failed +
                    " Total:" + event.results.total + "(" + event.results.ignored + " ignored)";
                messageType = "info";
                break;
            default:
                message = "Unexpected event " + event.type;
                messageType = "info";
        }    
        
        process.stdout.write(message + "\n");
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