#!/bin/bash

cd "$(dirname "$0")"

cd ../javascript
grover=../node_modules/.bin/grover
echo "Grover: ${grover}"

${grover} --server ./tests/TestRunner.html -S "?autorun=true"
