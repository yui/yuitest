

/**
 * Console output that mimics XUnit output.
 * @namespace YUITest.CLI
 * @class XUnit
 * @constructor
 */
YUITest.CLI.XUnit = function(){

    var testRunner  = YUITest.TestRunner,
        cli         = YUITest.CLI,
        errors      = [],
        failures    = [],
        stack       = [];
        
    function filterStackTrace(stackTrace){
        if (stackTrace){
            var lines = stackTrace.split("\n"),
                result = [],
                i, len;
                
            //skip first line, it's the error
            for (i=1, len=lines.length; i < len; i++){
                if (lines[i].indexOf("yuitest-node") > -1){
                    break;
                } else {
                    result.push(lines[i]);
                }
            }
            
            return result.join("\n");    
        } else {
            return "Unavailable."
        }
    }

    //handles test runner events
    function handleEvent(event){
    
        var message = "",
            results = event.results,
            i, len;
            
        switch(event.type){
            case testRunner.BEGIN_EVENT:
                message = "YUITest\n";
                
                if (testRunner._groups){
                    message += "Filtering on groups '" + testRunner._groups.slice(1,-1) + "'\n";
                }
                break;
                
            case testRunner.COMPLETE_EVENT:
                message = "\nTotal tests: " + results.total + ", Failures: " + 
                    results.failed + ", Skipped: " + results.ignored +
                    ", Time: " + (results.duration/1000) + " seconds\n";
                    
                if (failures.length){
                    message += "\nTests failed:\n";
                    
                    for (i=0,len=failures.length; i < len; i++){
                        message += "\n" + (i+1) + ") " + failures[i].name + " : " + failures[i].error.getMessage() + "\n";
                        message += "Stack trace:\n" + filterStackTrace(failures[i].error.stack) + "\n";
                    }
                
                    message += "\n";
                }
                
                if (errors.length){
                    message += "\nErrors:\n";
                    
                    for (i=0,len=errors.length; i < len; i++){
                        message += "\n" + (i+1) + ") " + errors[i].name + " : " + errors[i].error.message + "\n";
                        message += "Stack trace:\n" + filterStackTrace(errors[i].error.stack) + "\n";
                    }
                
                    message += "\n";
                }
                
                message += "\n\n";
                break;
                
            case testRunner.TEST_FAIL_EVENT:
                message = "F";
                failures.push({
                    name: stack.concat([event.testName]).join(" > "),
                    error: event.error
                });

                break;
                
            case testRunner.ERROR_EVENT:
                errors.push({
                    name: stack.concat([event.methodName]).join(" > "),
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
        
        cli.print(message);
    }

    testRunner.subscribe(testRunner.BEGIN_EVENT, handleEvent)
    testRunner.subscribe(testRunner.TEST_FAIL_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_PASS_EVENT, handleEvent);
    testRunner.subscribe(testRunner.ERROR_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_IGNORE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_CASE_BEGIN_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_CASE_COMPLETE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_SUITE_BEGIN_EVENT, handleEvent);
    testRunner.subscribe(testRunner.TEST_SUITE_COMPLETE_EVENT, handleEvent);
    testRunner.subscribe(testRunner.COMPLETE_EVENT, handleEvent); 

};