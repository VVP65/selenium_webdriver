AUTOMATED TESTING OF WEB SERVICES BEST PRACTICES
HOME TASK
if mentee's project has something to do with REST web-services, the tasks that are described below should be done using a mentee's REST web-service. Mentor is allowed to tailor given tasks to mentee’s REST web-service without losing a sense of the given tasks. Otherwise, it should be done using the provided REST web-service. 
1.	Create a test to verify a http status code:
o	Send the http request by using the GET method.
o	The URL is https://jsonplaceholder.typicode.com/users
o	Validation: status code of the obtained response is 200 OK
2.	Create a test to verify a http response header:
o	Send the http request by using the GET method. 
o	The URL is https://jsonplaceholder.typicode.com/users
o	Validation: - the content-type header exists in the obtained response
                                    - the value of the content-type header is application/json; charset=utf-8
3.	Create a test to verify a http response body:
o	Send the http request by using the GET method:
o	The URL is https://jsonplaceholder.typicode.com/users
o	Validation: the content of the response body is the array of 10 users

ACCEPTANCE CRITERIA
1.	Tests should be created using either Rest Assured or/and Spring Rest Template.
2.	Tests have to include validations that are given.
3.	Implemented tests should be readable.
4.	Tests must be implemented so that they could be launched in parallel.
5.	Naming and Code Conventions should be followed.
6.	As for tests of the bonus task, they should be created to test CRUD operations of the given resource.

Default test via terminal run command:
mvn clean test

General tests via terminal run command:
mvn clean test -Dsuit=<test-suite name without ".xml" extension>

General tests manual run can also be done via "Run" menu button in every test file.