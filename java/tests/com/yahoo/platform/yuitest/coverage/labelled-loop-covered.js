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
_yuitest_coverage["labelled-loop.js"] = {
    lines: {},
    functions: {},
    coveredLines: 0,
    calledLines: 0,
    coveredFunctions: 0,
    calledFunctions: 0,
    path: "labelled-loop.js",
    code: []
};
_yuitest_coverage["labelled-loop.js"].code=["testloop:","while (true){","    doSomething();","}"];
_yuitest_coverage["labelled-loop.js"].lines = {"1":0,"2":0,"3":0};
_yuitest_coverage["labelled-loop.js"].functions = {};
_yuitest_coverage["labelled-loop.js"].coveredLines = 3;
_yuitest_coverage["labelled-loop.js"].coveredFunctions = 0;
_yuitest_coverline("labelled-loop.js", 1);
testloop:
_yuitest_coverline("labelled-loop.js", 2);
while (true){
    _yuitest_coverline("labelled-loop.js", 3);
doSomething();
}