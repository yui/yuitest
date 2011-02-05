YUITest.Results = function(){
    this.passed = 0;
    this.failed = 0;
    this.ignored = 0;
    this.total = 0;
    this.duration = 0;
}

YUITest.Results.prototype.include = function(results){
    this.passed += results.passed;
    this.failed += results.failed;
    this.ignored += results.ignored;
    this.total += results.total;
};