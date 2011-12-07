(function(){

    var YUITest         = this.YUITest || require("yuitest"),
        Assert          = YUITest.Assert,
        ObjectAssert    = YUITest.ObjectAssert;
        
    function objectCreate(proto){
        function F(){}
        F.prototype = proto;
        return new F();
    }
    
    //-------------------------------------------------------------------------
    // Base Test Suite
    //-------------------------------------------------------------------------
    
    var suite = new YUITest.TestSuite("Object Assert Tests");
    
    //-------------------------------------------------------------------------
    // Test Case for ownsOrInheritsKey()
    //-------------------------------------------------------------------------
    
    suite.add(new YUITest.TestCase({
    
        name : "ownsOrInheritsKey() Tests",
        groups: ["asserts", "common"],
        
        _should: {
            fail: {
                "ownsOrInheritsKey() should fail for missing key": "Property 'yui' not found on object."
            }
        },
        
        /*
         * Tests that ownsOrInheritsKey() passes when a property with the given
         * name exists on the object instance.
         */
        "ownsOrInheritsKey() should pass for existing key on instance": function(){            
            var object = { msg: "hi" };
            ObjectAssert.ownsOrInheritsKey("msg", object);
        },
        
        /*
         * Tests that ownsOrInheritsKey() passes when a property with the given
         * name exists on the object prototype.
         */
        "ownsOrInheritsKey() should pass for existing key on prototype": function(){            
            var proto = { msg: "hi" };
            var object = objectCreate(proto);
            ObjectAssert.ownsOrInheritsKey("msg", object);
        },
        
        /*
         * Tests that ownsOrInheritsKey() fails when a property with the given
         * name doesn't exist on the object or its prototype.
         */
        "ownsOrInheritsKey() should fail for missing key": function(){            
            ObjectAssert.ownsOrInheritsKey("yui", {});
        }
        

    }));
    
    //-------------------------------------------------------------------------
    // Test Case for ownsOrInheritsKeys()
    //-------------------------------------------------------------------------
    
    suite.add(new YUITest.TestCase({
    
        name : "ownsOrInheritsKeys() Tests",
        groups: ["asserts", "common"],
        
        _should: {
            fail: {
                "ownsOrInheritsKeys() should fail for missing key on object": "Property 'yui' not found on object.",
                "ownsOrInheritsKeys() should fail for missing key on prototype": "Property 'yui' not found on object."
            }
        },
        
        /*
         * Tests that ownsOrInheritsKeys() passes when properties with the given
         * names exist on the object instance.
         */
        "ownsOrInheritsKeys() should pass for existing key on instance": function(){            
            var object = { msg: "hi", yui: true };
            ObjectAssert.ownsOrInheritsKeys(["msg", "yui"], object);
        },
        
        /*
         * Tests that ownsOrInheritsKeys() passes when properties with the given
         * names exists on the object prototype.
         */
        "ownsOrInheritsKeys() should pass for existing key on prototype": function(){            
            var proto = { msg: "hi", yui: true };
            var object = objectCreate(proto);
            ObjectAssert.ownsOrInheritsKeys(["msg", "yui"], object);
        },
        
        /*
         * Tests that ownsOrInheritsKeys() fails when a property with the given
         * name doesn't exist on the object instance.
         */
        "ownsOrInheritsKeys() should fail for missing key on object": function(){            
            var object = { msg: "hi" };
            ObjectAssert.ownsOrInheritsKeys(["msg", "yui"], object);
        },
        
        /*
         * Tests that ownsOrInheritsKeys() fails when a property with the given
         * name doesn't exist on the object prototype.
         */
        "ownsOrInheritsKeys() should fail for missing key on prototype": function(){            
            var proto = { msg: "hi" };
            var object = objectCreate(proto);
            ObjectAssert.ownsOrInheritsKeys(["msg", "yui"], object);
        }
        

    }));        
    
    //-------------------------------------------------------------------------
    // Test Case for ownsKey()
    //-------------------------------------------------------------------------
    
    suite.add(new YUITest.TestCase({
    
        name : "ownsKey() Tests",
        groups: ["asserts", "common"],
        
        _should: {
            fail: {
                "ownsKey() should fail for existing key on prototype": "Property 'msg' not found on object instance.",
                "ownsKey() should fail for missing key": "Property 'yui' not found on object instance."
            }
        
        },
        
        /*
         * Tests that ownsKey() passes when a property with the given
         * name exists on the object instance.
         */
        "ownsKey() should pass for existing key on instance": function(){            
            var object = { msg: "hi" };
            ObjectAssert.ownsKey("msg", object);
        },
        
        /*
         * Tests that ownsKey() fails when a property with the given
         * name exists on the object prototype.
         */
        "ownsKey() should fail for existing key on prototype": function(){            
            var proto = { msg: "hi" };
            var object = objectCreate(proto);
            ObjectAssert.ownsKey("msg", object);
        },
        
        /*
         * Tests that ownsKey() fails when a property with the given
         * name doesn't exist on the object.
         */
        "ownsKey() should fail for missing key": function(){            
            ObjectAssert.ownsOrInheritsKey("yui", {});
        }    
    }));
    
    //-------------------------------------------------------------------------
    // Test Case for ownsKeys()
    //-------------------------------------------------------------------------
    
    suite.add(new YUITest.TestCase({
    
        name : "ownsKeys() Tests",
        groups: ["asserts", "common"],
        
        _should: {
            fail: {
                "ownsKeys() should fail for existing key on prototype": "Property 'msg' not found on object instance.",
                "ownsKeys() should fail for missing key on prototype": "Property 'msg' not found on object instance.",
                "ownsKeys() should fail for missing key on object": "Property 'yui' not found on object instance.",
                "ownsKeys() should fail for missing key on prototype": "Property 'yui' not found on object instance."
            }
        },
        
        /*
         * Tests that ownsKeys() passes when properties with the given
         * names exist on the object instance.
         */
        "ownsKeys() should pass for existing key on instance": function(){            
            var object = { msg: "hi", yui: true };
            ObjectAssert.ownsKeys(["msg", "yui"], object);
        },
        
        /*
         * Tests that ownsKeys() fails when properties with the given
         * names exists on the object prototype.
         */
        "ownsKeys() should fail for existing key on prototype": function(){            
            var proto = { msg: "hi", yui: true };
            var object = objectCreate(proto);
            ObjectAssert.ownsKeys(["msg", "yui"], object);
        },
        
        /*
         * Tests that ownsKeys() fails when a property with the given
         * name doesn't exist on the object instance.
         */
        "ownsKeys() should fail for missing key on object": function(){            
            var object = { msg: "hi" };
            ObjectAssert.ownsKeys(["msg", "yui"], object);
        },
        
        /*
         * Tests that ownsKeys() fails when a property with the given
         * name exists only on the object prototype.
         */
        "ownsKeys() should fail for missing key on prototype": function(){            
            var proto = { msg: "hi" };
            var object = objectCreate(proto);
            object.yui = true;
            ObjectAssert.ownsKeys(["msg", "yui"], object);
        },
        
        /*
         * Tests that ownsKeys() fails when a property with the given
         * name doesn't exist on the object prototype.
         */
        "ownsKeys() should fail for missing key on prototype": function(){            
            var proto = { msg: "hi" };
            var object = objectCreate(proto);
            ObjectAssert.ownsKeys(["msg", "yui"], object);
        }
        
        

    }));        

    //-------------------------------------------------------------------------
    // Test Case for ownsNoKeys()
    //-------------------------------------------------------------------------
    
    suite.add(new YUITest.TestCase({
    
        name : "ownsNoKeys() Tests",
        groups: ["asserts", "common"],
        
        _should: {
            fail: {
                "ownsNoKeys() should fail for object with one key": "Object owns 1 properties but should own none.",
                "ownsNoKeys() should fail for object with two keys": "Object owns 2 properties but should own none."
            }
        },
        
        /*
         * Tests that ownsNoKeys() fails when the object owns a single property.
         */
        "ownsNoKeys() should fail for object with one key": function(){            
            var object = { msg: "hi" };
            ObjectAssert.ownsNoKeys(object);
        },
        
        /*
         * Tests that ownsNoKeys() fails when the object owns two properties.
         */
        "ownsNoKeys() should fail for object with two keys": function(){            
            var object = { msg: "hi", yui: true };
            ObjectAssert.ownsNoKeys(object);
        },
        
        /*
         * Tests that ownsNoKeys() passes when the object owns no properties.
         */
        "ownsNoKeys() should pass for object with no keys": function(){            
            var object = {};
            ObjectAssert.ownsNoKeys(object);
        }

    }));
    
    //-------------------------------------------------------------------------
    // Test Case for areEqual()
    //-------------------------------------------------------------------------

    suite.add(new YUITest.TestCase({

        name : "areEqual() Tests",

        _should: {
            fail: {
                "areEqual() should fail for objects with differing keys" : 
                    "Values at key msg are not equal.",
                "areEqual() should fail for objects with differing values" : 
                    "Values at key msg are not equal.",
                "areEqual() should fail for objects with differing numbers of keys": 
                    "Object should have 1 keys but has 2"
            }
        },

        /*
         * Tests that areEqual() passes when the objects own equivalent properties.
         */
        "areEqual() should pass for objects with equivalent properties": function(){
            var a = { msg: "hi" },
                b = { msg: "hi" };
            
            ObjectAssert.areEqual(a, b);
        },
        
        /*
         * Tests that areEqual() passes when the objects own no properties.
         */
        "areEqual() should pass for object with no keys": function(){
            var a = {},
                b = {};
            
            ObjectAssert.areEqual(a, b);
        },
        
        /*
         * Tests that areEqual() fails when the objects have different keys
         */
         
        "areEqual() should fail for objects with differing keys": function(){
            var a = { msg: "hi" },
                b = { gsm: "bye"};
                
            ObjectAssert.areEqual(a, b);
        },
        
        /*
         * Tests that areEqual() fails when the objects have different values
         */
         
        "areEqual() should fail for objects with differing values": function(){
            var a = { msg: "hi" },
                b = { msg: "bye"};
                
            ObjectAssert.areEqual(a, b);
        },
        
        /*
         * Tests that areEqual() fails when the objects have different numbers of keys.
         */
        "areEqual() should fail for objects with differing numbers of keys": function(){
            var a = { msg: "hi", yui: true },
                b = { msg: "hi" };
                
            ObjectAssert.areEqual(a, b);
        },

    }));

    YUITest.TestRunner.add(suite);

})();