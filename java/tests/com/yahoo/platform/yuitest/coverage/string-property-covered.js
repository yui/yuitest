if (typeof _yuitest_coverage == "undefined"){
    _yuitest_coverage = {};
    _yuitest_coverline = function(src, line){
        var coverage = _yuitest_coverage[src];
        if (!coverage.lines[line]){
            coverage.calledLines++;
        }
        coverage.lines[line]++;
    };
    _yuitest_coverfunc = function(src, name, line){
        var coverage = _yuitest_coverage[src],
            funcId = name + ":" + line;
        if (!coverage.functions[funcId]){
            coverage.calledFunctions++;
        }
        coverage.functions[funcId]++;
    };
}
_yuitest_coverage["string-property.js"] = {
    lines: {},
    functions: {},
    coveredLines: 0,
    calledLines: 0,
    coveredFunctions: 0,
    calledFunctions: 0,
    path: "string-property.js",
    code: []
};
_yuitest_coverage["string-property.js"].code=["var foo = {","    ","    \"test\": function(){","        alert(\"hello\");","    },","    ","    foo: function(){","        alert(\"goodbye\");","    },","    ","    'bar': function(){","        alert(\"Woohoo\");","    }","","};"];
_yuitest_coverage["string-property.js"].lines = {"1":0,"4":0,"8":0,"12":0};
_yuitest_coverage["string-property.js"].functions = {"\"test\":3":0,"foo:7":0,"\'bar\':11":0};
_yuitest_coverage["string-property.js"].coveredLines = 4;
_yuitest_coverage["string-property.js"].coveredFunctions = 3;
_yuitest_coverline("string-property.js", 1); var foo = {
    
    "test": function(){
        _yuitest_coverfunc("string-property.js", "\"test\"", 3);
_yuitest_coverline("string-property.js", 4); alert("hello");
    },
    
    foo: function(){
        _yuitest_coverfunc("string-property.js", "foo", 7);
_yuitest_coverline("string-property.js", 8); alert("goodbye");
    },
    
    'bar': function(){
        _yuitest_coverfunc("string-property.js", "\'bar\'", 11);
_yuitest_coverline("string-property.js", 12); alert("Woohoo");
    }

};
