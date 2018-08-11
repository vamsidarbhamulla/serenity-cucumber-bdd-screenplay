# serenity-cucumber-bdd-screenplay
This is a test automation tutorial with serenity-cucumber-bdd-screenplay stack on one of the freely available test automation practice 
website "http://automationpractice.com/index.php"

[![CircleCI](https://circleci.com/gh/vamsidarbhamulla/serenity-cucumber-bdd-screenplay.svg?style=svg)](https://circleci.com/gh/vamsidarbhamulla/serenity-cucumber-bdd-screenplay)

## Get the code

Git:

    git clone https://github.com/vamsidarbhamulla/serenity-cucumber-bdd-screenplay.git
    cd serenity-cucumber-bdd-screenplay

## Use Maven

Open a command window and run:

    mvn clean verify

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(CucumberWithSerenity.class)` annotation on the `CucumberSerenityBDDRunner`
class tells JUnit to kick off Cucumber.

# Viewing the reports

Maven command provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

or 

Open a command window and run:

    mvn jetty:run
    
This will bring a new server up with the test results report. You can access it from [http://localhost:9998]



## Licensing

This distribution, as a whole, is licensed under the terms of the Apache License, Version 2.0
