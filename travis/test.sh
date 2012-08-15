#!/bin/bash

cd "$(dirname "$0")"

cd ../
yuitest=./node_modules/.bin/yuitest

${yuitest} ./javascript/tests/{asserts,core,mock}/*.js
wait

RETVAL=$?
[ $RETVAL -ne 0 ] && exit 1

cd javascript
grover=../node_modules/.bin/grover
echo "Grover: ${grover}"

${grover} --server ./tests/TestRunner.html -S "?autorun=true"

RETVAL=$?
[ $RETVAL -ne 0 ] && exit 1

if [ -n "$TRAVIS" ]; then
    cd ../java
    wget https://raw.github.com/michaelklishin/jdk_switcher/master/jdk_switcher.sh -O ./tmp/jdk_switcher.sh
    wait
    chmod a+x ./tmp/*.sh
    wait 
    source ./tmp/jdk_switcher.sh
    wait
    jdk_switcher use openjdk6
    echo "Setting up Java:"
    echo "Java Home: ${JAVA_HOME}"
    echo "ClassPath: ${CLASSPATH}"
    echo -n "Java: "
    java -version
    echo -n "Javac: "
    javac -version
    echo "Running Java Tests in Travis"
    ant test
fi
