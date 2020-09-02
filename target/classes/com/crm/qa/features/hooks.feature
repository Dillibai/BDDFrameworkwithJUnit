Feature: Free CRM app test

Scenario: Free CRM create a new deal Scenario
Given User is already on Login Page
When Title of Login Page is Free CRM
Then User enters username and password

Scenario: Free CRM create a contact
Given this is a contact test case
When user fills the contact form

Scenario Outline: Free Crm create a mail
Given user is on email page	
When user fills email form

Examples:
| mail1 |
| mail2 |