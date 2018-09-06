# serenity-bdd-screenplay-cucumber framework

This is a test automation tutorial with serenity-bdd-screenplay & cucumber that run tests on
 Prestashop demo website hosted [serenitybddpractice.com](http://serenitybddpractice.com)
 
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

If you want to run the tests using Android , make sure Appium installed and run on http://localhost:4723 and provide the exact expected chromedriver as part of it. 

Open a command window and run

    mvn clean verify -Dwebdriver.base.url="http://serenitybddpractice.com" -Dappium.hub="http://localhost:4723/
    wd/hub" -Dwebdriver.driver=appium -Dappium.platform=ANDROID -Dappium.platformName=Android -Dappium.automation
    Name=uiautomator2 -Dappium.browserName=chrome -Dappium.deviceName="emulator_5554" -Dappium.nativeWebScreensho
    t=true -Dappium.androidScreenshotPath='target/screenshots'; 

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

## Running the Project Using Gradle
This requires webdriver setup. By default the tests run on Chrome, you need to set the latest chromedriver instance on your system path.

Open a command window and run:

    ./gradle.bat test (For Windows Machines)
    ./gradlew test  (For Linux based and Mac)

If you want to run the tests using firefox, make sure latest geckodriver is available on your system path. 

Open a command window and run:

     ./gradlew test -Dwebdriver.driver=firefox
    
If you want to run the tests using internet explorer, make sure latest internetexplorerdriver is available on your system path. 

Open a command window and run:

    ./gradlew test -Dwebdriver.driver=iexplorer

If you want to run the tests using Android , make sure Appium installed and run on http://localhost:4723 and provide the exact expected chromedriver as part of it. 

Open a command window and run

    ./gradlew test -Dwebdriver.base.url="http://serenitybddpractice.com" -Dappium.hub="http://localhost:4723/
    wd/hub" -Dwebdriver.driver=appium -Dappium.platform=ANDROID -Dappium.platformName=Android -Dappium.automation
    Name=uiautomator2 -Dappium.browserName=chrome -Dappium.deviceName="emulator_5554" -Dappium.nativeWebScreensho
    t=true -Dappium.androidScreenshotPath='target/screenshots';     

These commands run Cucumber features using Cucumber's JUnit runner. The `@RunWith(CucumberWithSerenity.class)` annotation on the `CucumberSerenityBDDSimpleRunner`
class tells JUnit to kick off Cucumber.

## Running the Project Using Docker

Open a command window and run:

    cd .docker
    docker-compose up --build

The above will run the tests against selenium-standalone-chrome docker container.

### If you prefer to run the tests against chrome driver docker

Open a command window and run:

    cd .docker
    docker-compose -f chrome_tests.yml up --build
   
Currently each commit on every branch that is pushed to github will be tested with the above image for all tests 
in circle ci. The status of latest build on master is available on beginning of this doc.

   
## Licensing

This distribution, as a whole, is licensed under the terms of the Apache License, Version 2.0
