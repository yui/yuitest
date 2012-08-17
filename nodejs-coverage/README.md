YUI Test Coverage Node.js Module
================================


This module is a wrapper around the YUITest Coverage Java module that you
can call from a Node.js process.

Example
-------


```javascript

var coverage = require('yuitest-coverage');

coverage.cover('/path/to/file', function(err, data) {
    //err will be populated with the stderr from the java process
    //data will be a string of the covered contents, you write the file out
});

coverage.cover('<string from a file>', callback); // also works

```
