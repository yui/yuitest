#!/bin/bash

cd "$(dirname "$0")"

cd ../
yuitest=./node_modules/.bin/yuitest

echo ""
echo "Starting Tests against Node.js CLI"
echo ""

${yuitest} ./javascript/tests/{asserts,core,mock}/*.js

RETVAL=$?
[ $RETVAL -ne 0 ] && exit 1

echo ""
echo "Starting Coverage JS Wrapper Tests"
echo ""

${yuitest} ./nodejs-coverage-tests/tests.js

RETVAL=$?
[ $RETVAL -ne 0 ] && exit 1

echo ""
echo "Starting Tests in a browser with Grover"
echo ""

cd javascript
grover=../node_modules/.bin/grover
echo "Grover: ${grover}"

${grover} --server ./tests/TestRunner.html -S "?autorun=true"

#RETVAL=$?
#[ $RETVAL -ne 0 ] && exit 1

#if [ -n "$TRAVIS" ]; then
#    cd ../java
#    echo "Java Home: ${JAVA_HOME}"
#    echo "ClassPath: ${CLASSPATH}"
#    echo -n "Java: "
#    java -version
#    echo -n "Javac: "
#    javac -version
#    echo "Running Java Tests in Travis"
#    ant test
#fi
