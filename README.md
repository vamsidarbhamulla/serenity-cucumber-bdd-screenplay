# serenity-cucumber-bdd-screenplay
This is a test automation tutorial with serenity-cucumber-bdd-screenplay stack on one of the freely available test automation practice 
website "http://automationpractice.com/index.php"

[![CircleCI](https://circleci.com/gh/vamsidarbhamulla/serenity-cucumber-bdd-screenplay.svg?style=svg)](https://circleci.com/gh/vamsidarbhamulla/serenity-cucumber-bdd-screenplay)

By default the tests run on Chrome, you need to set the latest chromedriver instance on your system path.

## Screenplay implementation

These tests use tasks, actions, abilities, questions and page elements defined in `src/main/java/screenplay`.

The overall project structure is shown below:
````
+ model
    Domain model classes
+ abilities
    Actor/User can do abilities
+ tasks
    Business-level tasks
+ actions
    UI interactions
+ user_interfaces
    Page Objects and Page Elements
+ questions
    Objects used to query the application
````

## Get the code

Git:

    git clone https://github.com/vamsidarbhamulla/serenity-cucumber-bdd-screenplay.git
    cd serenity-cucumber-bdd-screenplay

## Running the Project Using Maven

Open a command window and run:

    mvn clean verify

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(CucumberWithSerenity.class)` annotation on the `CucumberSerenityBDDRunner`
class tells JUnit to kick off Cucumber.

## Viewing the reports

Maven command provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

or 

Open a command window and run:

    mvn jetty:run
    
This will bring a new server up with the test results report. You can access it from [http://localhost:9999]
The server will start up after first few requests , so expect a 404 for the initial 4-5 requests.



## Licensing

This distribution, as a whole, is licensed under the terms of the Apache License, Version 2.0
