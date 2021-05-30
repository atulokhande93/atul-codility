## Project Brief

**Web Automation Exercise**

Develop a Web test solution that automates a few simple tests, composed as BDD scenarios.
The target for the test is the dummy web site: http://automationpractice.com
NOTE: you can use these credentials: someone@example.com\Password123

- **Scenario 1**: Order T-Shirt (and Verify in Order History)
- **Scenario 2**: Update Personal Information (First Name) in My Account

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Install the following

- [JAVA SE 8](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html) (Java 9 is not yet supported by Cucumber) 
- [Maven](https://maven.apache.org/index.html) - version 3.3.1 or higher
- [Eclise IDE](https://www.eclipse.org/downloads/)
 -[Eclipse Cucumber for Java plugin](http://cucumber.github.com/cucumber-eclipse/update-site) Steps to install : https://www.toolsqa.com/cucumber/install-cucumber-eclipse-plugin/
- [Chrome](https://www.google.co.uk/chrome/?brand=CHBD&gclid=Cj0KCQjw78yFBhCZARIsAOxgSx3MpgQhrkRmZMauck1S0xIxKF-23C0KrIhrb2dkkolhHoWyO7dGKA4aAqBjEALw_wcB&gclsrc=aw.ds)

## Running the tests

There are 3 way to run the tests:
1. Open the project in Eclipse navigate to src > test > resources > features to find the feature files, right click feature file, select Run As Cucumber feature to run all tests.
    To Run individuval scenario open feature file and right click on scenario line and select Run as Cucumber feature

2. Right click on the TestRunner class in the src/test/java under com.test.atul.testruuner package and go to Run As - > Junit Test
3. Open a command/terminal window, CD to the directory where the project is located and run the following:

```
mvn test
```

## Improvements

- Data can be parameterised using examples.
- Properties file can e used to parameterise the tests
- Multiple browser support can be enabled
- Faker Utility (https://github.com/DiUS/java-faker) can be used to generate coomoon data at runtime.
- External reporting liabraries Extent Report(https://www.extentreports.com/) can be used for better reporting.
- Multiple utilities can be created to reuse like parallel execution, Email Functionality, Jira connectivity, external testData reader etc.
- Tests can be executed parallel and on cross browser by integrating wih Selenium GRID, Saucelab,BrwoserStack.
- Tests can be integrated with devops tools like jenkins, Azure Devops to run parallel
