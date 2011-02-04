(function(){

    var Assert          = YUITest.Assert;
    
    //-------------------------------------------------------------------------
    // Base Test Suite
    //-------------------------------------------------------------------------
    
    var suite = new YUITest.TestSuite("TestCase Tests");
    
    //-------------------------------------------------------------------------
    // Test Case for wait/resume()
    //-------------------------------------------------------------------------
    
    suite.add(new YUITest.TestCase({
    
        name: "wait()/resume() Tests",
        
        _should: {
            fail: {
                "wait() without resume() should fail": true
            }
        },        
        
        "wait() with a function to execute should work": function(){
            this.wait(function(){
                Assert.isTrue(true);  //FIXME
            }, 500);
        },
        
        "wait() without a function to execute followed by resume() should work": function(){
            var that = this;
            setTimeout(function(){
                that.resume(function(){
                    Assert.isTrue(true);  //FIXME
                });
            });
            
            this.wait(500);
        },
        
        "wait() without resume() should fail": function () {
            Assert.isTrue(true);
            this.wait(500);
        },
        
        "resume() without wait() should throw an error": function () {
            var that = this;
            Assert.throwsError("resume() called without wait().", function(){
                that.resume(function(){});
            });
        }
    }));        
    
    //-------------------------------------------------------------------------
    // Test Case for asserts
    //-------------------------------------------------------------------------
    
    suite.add(new YUITest.TestCase({
    
        name: "Assertion Tests",
        
        _should: {
            fail: {
                "Test should fail when there are no asserts": true
            }
        },        
        
        "Test should fail when there are no asserts": function(){
            //noop
        }
    }));        

    //-------------------------------------------------------------------------
    // Test Case for init()
    //-------------------------------------------------------------------------
    
    var initValue = 0;
    suite.add(new YUITest.TestCase({
    
        name: "Init Tests",
        
        init: function(){
            initValue++;
        },     
        
        "Verify that initValue is 1": function(){
            Assert.areEqual(1, initValue);
        },
        
        "Verify that initValue is still 1": function(){
            Assert.areEqual(1, initValue);
        }        
        
    }));        

    //-------------------------------------------------------------------------
    // Test Case for init()
    //-------------------------------------------------------------------------
    
    var destroyValue = 0;
    suite.add(new YUITest.TestCase({
    
        name: "Destroy Tests",
        
        
        tearDown: function(){
            destroyValue++;
        },
        
        destroy: function(){
            destroyValue--;
        },  
         
        "Verify that destroyValue is 0": function(){
            Assert.areEqual(0, destroyValue);
        },
        
        "Verify that initValue is 1": function(){
            Assert.areEqual(1, destroyValue);
        }        
        
    }));        

    //this case verifies the result of the last case
    suite.add(new YUITest.TestCase({
    
        name: "Destroy Verification Tests",
         
        "Verify that destroyValue is 1": function(){
            Assert.areEqual(1, destroyValue);
        }    
        
    }));        

    //add it to be run
    YUITest.TestRunner.add(suite);

})();