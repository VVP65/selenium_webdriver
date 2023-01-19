SELENIUM WD ADVANCED WITH JAVA: ACTIONS, 8JAVASCRIPT EXECUTOR, SELENIUM SERVER + SELENIUM GRID.

hOME TASK
1.	Convert your project from previous home tasks (Selenium WebDriver) – add at least 2 new Actions implementations 
(for example: 1 for mouse actions and 1 for keyboard).
•	If current SUT does not allow to implement any Actions – add some pages for Yandex Disk and implement some Actions on it (such as drag-n-drop (delete a file dragging to the trash bin), context menu actions, multi-selecting files, etc)
2.	Add at least 2 implementation of JavaScript Executor usage (for example: implement element highlighter, JS Executor based clicker or element finder);
3.	Set up Selenium Grid with at least two nodes and run all your test suites on the grid.

ACCEPTANCE CRITERIA
1.	2 or more actions are added to the project. (Have a complex structure – a sequence of several operations).
2.	2 or more implementation of JavaScript Executor usage are added to the project. 
3.	There is a rational explanation to use exactly this JavaScript Executor methods and usage of these methods 
brings profit to the project.
4.	Selenium Grid is correctly set up. Different capabilities are used during set up.
5.	There is no code duplication at all.
6.	Naming and Code Conventions should be followed.

Grid setup commands via CMD:

Run as hub:
java -jar selenium-server-<version>.jar hub

Run as node:
java -jar selenium-server-<version>.jar node --port ****

Grid tests via terminal run command:
mvn clean test -Denvironment=dev -Dsuit=testng-grid

