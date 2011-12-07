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
_yuitest_coverage["nobraces.js"] = {
    lines: {},
    functions: {},
    coveredLines: 0,
    calledLines: 0,
    coveredFunctions: 0,
    calledFunctions: 0,
    path: "nobraces.js",
    code: []
};
_yuitest_coverage["nobraces.js"].code=["function test(){","","    if(o)","        for(var prop in o)","            doSomething();","","","    for(var x=initX;x<str_arr.length;x++)","         str_arr[x]=str_arr[x].charAt(0).toUpperCase()+str_arr[x].substring(1);","","","}"];
_yuitest_coverage["nobraces.js"].lines = {"1":0,"3":0,"4":0,"5":0,"8":0,"9":0};
_yuitest_coverage["nobraces.js"].functions = {"test:1":0};
_yuitest_coverage["nobraces.js"].coveredLines = 6;
_yuitest_coverage["nobraces.js"].coveredFunctions = 1;
_yuitest_coverline("nobraces.js", 1);
function test(){

    _yuitest_coverfunc("nobraces.js", "test", 1);
_yuitest_coverline("nobraces.js", 3);
if(o)
        {_yuitest_coverline("nobraces.js", 4);
for(var prop in o)
            {_yuitest_coverline("nobraces.js", 5);
doSomething();}}


    _yuitest_coverline("nobraces.js", 8);
for(var x=initX;x<str_arr.length;x++)
         {_yuitest_coverline("nobraces.js", 9);
str_arr[x]=str_arr[x].charAt(0).toUpperCase()+str_arr[x].substring(1);}


}
