#!/bin/bash

cd "$(dirname "$0")"

echo "Building with ant"
cd ../javascript
wait
ant -q -Dlint.skip=true -Dcoverage.skip=true
wait
