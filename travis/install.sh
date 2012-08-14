#!/bin/bash

cd "$(dirname "$0")"

startDir=`pwd`


#if [ ! -d "../../builder" ]; then
#    echo "Builder is not here, cloning"
#    cd ../../
#    wait
#    git --depth=100 --quiet clone git://github.com/yui/builder.git
#    wait
#
#    cd ${startDir}
#
#fi
#
#echo "Building with ant"
#cd ../javascript
#wait
#ant -q -Dlint.skip=true -Dcoverage.skip=true
#wait
