@CRMLoginTest
Feature: Free CRM Login Feature
Description: To Test the Login Functionality of CRM Application

#Without Example keyword
#Scenario: Free CRM Login Test Scenario
#Given User is already on Login Page
#When Title of Login Page is Free CRM
#Then User enters "***" and "***"
#Then User clicks on login button
#Then User is on Home Page
#Then close the browser

#With Example Keyword
Scenario Outline: Free CRM Login Test Scenario
Given User is already on Login Page
When Title of Login Page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then User is on Home Page
Then close the browser

Examples:
		| username | password |
		| ***** | ***** |
		| ****** | ***** |

#Scenario: user is able to create a new contact
#Given user is already on home page





