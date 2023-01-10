SELENIUM WEBDRIVER FOR JAVA

HOME TASK

1.	WebDriver + Java + TestNG
 
•	Select a system under test (preferable: web application being tested during your project activities);
•	Agree with your mentor and document 3 scenarios to automate. The scenarios should be linear (no need to implement complex logic for now) and contain 8-10 simple steps;
•	Use WebDriver API as much as possible (browser navigation, clicks, switchTo and etc.);
•	Use several locator strategies i.e. different types of locators (and select the most suitable in your case);
•	Experiment with waits (implicit and explicit);
•	Extend your scenario with usage of  Page Object / Page Factory patterns.

2.ACCEPTANCE CRITERIA

1.	The scenarios are linear (no need to implement complex logic for now). 3 scenarios in total.
2.	Different locator strategies are used for a task.
3.	Usage of auto-generated locators is avoided.
4.	WebDriver API is widely used.
5.	Different methods of waits are used.
6.	Test scenarios are clear, stable and good structured.
7.	Each method in test scenario has assertions.
8.	Page Objects have consistent structure (decomposition of PO is right).
9.	Test scenarios are clear, stable and good structured.
10.	There is at least one level of inheritance between pages (Abstract Page exists).
11.	There is no code duplication at all.
12.	Inner implementation of PO is hidden from tests.
13.	Naming and Code Conventions should be followed.

-----------------------------------------------------------------------------------------------------------------------------------
Test Launch under Chrome commands:

1. For all dev.properties tests:
mvn clean -Dbrowser=chrome -Denvironment=environments\dev "-Dsurefire.suiteXmlFiles=src\test\resources\testSuites\testng-all-dev.xml" test

2. For all qa.properties tests:
mvn clean -Dbrowser=chrome -Denvironment=environments\qa "-Dsurefire.suiteXmlFiles=src\test\resources\testSuites\testng-all-qa.xml" test
