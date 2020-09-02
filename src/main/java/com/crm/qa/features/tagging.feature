Feature: Free CRM application testing

@SmokeTest @RegressionTest
Scenario: login with correct username and password
Given this is a valid login test

@RegressionTest
Scenario: login with incorrect username and password
Given this is invalid login test

Scenario: create a contact
Given this is a contact test case

@SmokeTest
Scenario: create a deal
Given this is a deal test case

@SmokeTest
Scenario: create a tasks
Given this is a task test case

@SmokeTest
Scenario: create a case
Given this is a case test case

@SmokeTest @RegressionTest
Scenario: verify left panel links
Given clicking on left panel links

@SmokeTest @RegressionTest
Scenario: search a deal
Given this is a seach deal test case

@SmokeTest
Scenario: search a case
Given this is a search case test case

@SmokeTest
Scenario: search a task
Given this is a search task test case

@End2End
Scenario: search a call
Given this is a search call test case

@End2End
Scenario: search a email
Given this is a search email test case