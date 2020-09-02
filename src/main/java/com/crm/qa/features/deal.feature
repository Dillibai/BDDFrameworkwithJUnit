Feature: Deal data creation

Scenario: Free CRM create a new deal Scenario

Given User is already on Login Page
When Title of Login Page is Free CRM
Then User enters username and password
| *** | *** |
Then User clicks on login button
Then User is on Home Page
Then User moves to new deal page
Then User enters deal details 
| test deal | 1000 | 50 | 10 |
Then close the browser 