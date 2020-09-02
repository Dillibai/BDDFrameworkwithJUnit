Feature: Deal data creation

Scenario: Free CRM create a new deal Scenario

Given User is already on Login Page
When Title of Login Page is Free CRM
Then User enters username and password
| username | password |
| ***** | **** |
Then User clicks on login button
Then User is on Home Page
Then User moves to new deal page
Then User enters deal details 
| title | amount | probability | commission |
| test deal 1| 1000 | 50 | 10 |
| test deal 2 | 2000 | 60 | 20 |

Then close the browser 