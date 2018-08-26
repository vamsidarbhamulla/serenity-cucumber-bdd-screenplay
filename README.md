# serenity-bdd-screenplay-cucumber framework

This is a test automation tutorial with serenity-bdd-screenplay & cucumber that run tests on
 Prestashop demo website built on your local machine "http:localhost:90". You can find the view of demo website [here](http://demo.prestashop.com/en/?view=front).

[![CircleCI](https://circleci.com/gh/vamsidarbhamulla/serenity-cucumber-bdd-screenplay.svg?style=svg)](https://circleci.com/gh/vamsidarbhamulla/serenity-cucumber-bdd-screenplay)

## Screenplay implementation

These tests use tasks, actions, abilities, questions and page elements defined in src/main/java/screenplay.

The screenplay package structure is shown below:
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

The above package structure is an idea to show how automation tests can be written implementing 
screenplay design pattern and SOLID (Single Responsibility , Open/Closed, Liskov Substitution, 
Interface Segregation, Depedency Injection) principles together using Serenity BDD framework.
 

## Get the code

Git:

    git clone https://github.com/vamsidarbhamulla/serenity-cucumber-bdd-screenplay.git
    cd serenity-cucumber-bdd-screenplay

## Build the webapp using docker

Open a command window and run:

    cd web-app
    docker-compose up
    
Make sure the docker images downloaded and started. Then Open the [web-app-from-here](http:localhost:90)

### Test data required to run the tests 

1. Create three accounts as mentioned in the table.
2. After that sign in with byron account and add an address.

 |username| password | first name| last name|
 |---|:---:|:---:|---:|
 |carla_the_online_customer@getnada.com| password | Carla     | OnlineCustomer|
 | adam_the_web_admin@mailinator.com| password | Adam      | WebAdmin      |
 | byron_the_buyer@cmail.club| password | Byron     | Buyer         |
 
  

## Running the Project Using Maven
This requires webdriver setup. By default the tests run on Chrome, you need to set the latest chromedriver instance on your system path.

Open a command window and run:

    mvn clean verify

If you want to run the tests using firefox, make sure latest geckodriver is available on your system path. 

Open a command window and run:

    mvn clean verify -Dwebdriver.driver=firefox
    
If you want to run the tests using internet explorer, make sure latest internetexplorerdriver is available on your system path. 

Open a command window and run:

    mvn clean verify -Dwebdriver.driver=iexplorer

These commands run Cucumber features using Cucumber's JUnit runner. The `@RunWith(CucumberWithSerenity.class)` annotation on the `CucumberSerenityBDDSimpleRunner`
class tells JUnit to kick off Cucumber.

## Running tests in parallel using Maven

Open a command window and run:

    mvn clean verify -Dserenity.runner=ParallelRunner

## Viewing the reports
Maven commands provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

or 

Open a command window and run:

    mvn jetty:run
    
This will bring a new server up with the test results report. You can access the reports from [Serenity-Reports](http://localhost:9999) link.

General Note : The server will start up after first few requests , so expect a 404 for the initial 4-5 requests.

   
## Licensing

This distribution, as a whole, is licensed under the terms of the Apache License, Version 2.0
