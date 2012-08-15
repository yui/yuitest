#!/bin/bash

cd "$(dirname "$0")"
cd ../

echo "Installing grover"
npm install grover
wait
echo "Installing npm module"
wait
npm install ./javascript/build/yuitest/npm/
