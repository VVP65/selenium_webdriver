MODULE 10: BDD FRAMEWORK OVERVIEW (JAVA)

HOME TASK
Adopt the previous home task (WebDriver project with patterns implemented) to make possible test execution with Cucumber-JVM. Follow relevant configuration steps for jUnit/TestNg depending on the existing project architecture.

ACCEPTANCE CRITERIA
1.	At least one test should use "Scenario Outline" keyword and “Examples:” section.
2.	Apply “Background” keyword for preconditions/recurrent steps.
3.	Use filtering/regular expressions in Gherkin step definitions for parametrization and flexibility.

Cucumber tests via terminal run command:
mvn clean test

Cucumber tests can also be launched manually from the "Run" command in the "CucumberTestRunner.class" at line 15.