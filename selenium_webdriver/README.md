DESIGN PATTERNS IN TA FRAMEWORKS IMPLEMENTATION

HOME TASK
1.	Implement the following design patterns in your solution from previous module*:
a.	Singleton
b.	Factory Method
c.	Decorator

ACCEPTANCE CRITERIA
1.	PATTERNS: All patterns from mandatory part (Singleton, Factory Method, Decorator) should be implemented.
2.	PATTERNS: Classes which were modified/created during pattern implementation should be invoked during the test run. Just storing them in project packages is NOT enough.
3.	S.O.L.I.D.: Code is revised to match S.O.L.I.D. principles. 
4.	S.O.L.I.D.: at least 3 fixes are described within the table per example above and delivered to a mentor.
5.	S.O.L.I.D.: fixes are implemented in code structure. 
6.	BONUS TASK: extra patterns mentioned during the training session are implemented considering criteria from point #2 above.



Default test via terminal run command:
Before test run browser value should be changed to "chrome" at "test.properties" file
mvn clean test

Default decorated test via terminal run command:
Before test run browser value should be changed to "chrome_decorator" at "test.properties" file
mvn clean test

General decorated test via terminal run command:
Before test run browser value should be changed to "chrome_decorator" at "test.properties" file
mvn clean test -Dsuit=<test-suite name without ".xml" extension>

General tests via terminal run command:
Before test run browser value should be changed to "chrome" at "test.properties" file
mvn clean test -Dsuit=<test-suite name without ".xml" extension>

Grid tests via terminal run command:
Before test run browser value should be changed to "chrome_remote" at "test.properties" file
mvn clean test -Dsuit=testng-grid

All tests also can be launched manually from the test "Run" menu

Test run in "Debud mode" is applicable

Test logs can be observed in the "target/logs" folder

Screenshots of failed tests can be observed in the "target/screenshots" folder

"test.properties" file contains of common test resources like:
*browser value
*environment value
*wait value

"qa.properties" and "dev.properties" files contains of individual test resources like:
*source login page url
*users credentials
*grid host url