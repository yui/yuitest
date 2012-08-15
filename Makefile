all: java javascript

java:
	@echo "Making Java"
	cd java && ant -q

js: javascript

javascript:
	@echo "Making Javascript"
	cd javascript && ant -q -Dlint.skip=true -Dcoverage.skip=true

javatest: testjava

testjava:
	@echo "Running Java JUnit tests"
	cd java && ant test

testjavascript: testjs

jstest: testjs
testjs:
	@echo "Testing Javascript"
	./travis/travis.sh

npm:
	@echo "Making NPM Package"
	cd javascript && ant buildnpm

test: testjava testjs

.PHONY: java javascript test testjava testjs js testjavascript
