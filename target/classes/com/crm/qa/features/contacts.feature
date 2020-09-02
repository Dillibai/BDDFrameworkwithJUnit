Feature: Create Free CRM Contacts

Scenario Outline: Free CRM create a new contact Scenario

Given User is already on Login Page
When Title of Login Page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then User is on Home Page
Then User moves to new contact page
Then User enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser 

Examples:

		| username | password | firstname | lastname | position |
		| ******** | ******** | Tom | jerry | Manager |
		| ******** | ******** | sss | sd	| Director |