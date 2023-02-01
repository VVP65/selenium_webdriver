TA FRAMEWORKS: LAYERS, RUNNER, BUSINESS OBJECTS
HOME TASK
To build test automation framework based on the task Hardcore from the WebDriver course.
The framework should have:

1.	WebDriverManager for managing drivers for different browsers;
2.	PageObject / PageFactory for abstract pages;
3.	Necessary business model (business objects for dedicated entities);
4.	Property files with test data for different environments (at least 2);
5.	XML suites for Smoke and Regression tests;
6.	Possibility to make a screenshot in case of test failure; The log should have information about the saved screenshot in this case
7.	Ability of running on Jenkins with parameters for browser, test suite, environment(N/A);
8.	Add logging of every step (with log4j or any similar lib) for your solution implemented based on previous modules.
a.	Configure logs format in informative way
b.	Demonstrate usage of different log levels (debug, action, error, etc)
c.	Configure ability to write logs in console and to save logs in a file (a new file should be created for each day). By default logs are written in console and are stored in file.
9.	Test results should present on job graphics, and screenshots should be archived as artifacts.


Default test via terminal run command:
Before test run browser value should be changed to "chrome" at "test.properties" file
mvn clean test

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