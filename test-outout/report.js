$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ddillibai/OneDrive - DXC Production/Documents/JAVA/BDD/BDDFramework/src/main/java/com/crm/qa/features/login.feature");
formatter.feature({
  "line": 2,
  "name": "Free CRM Login Feature",
  "description": "Description: To Test the Login Functionality of CRM Application",
  "id": "free-crm-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CRMLoginTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of Login Page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters Username and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User is on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 20844423000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Title_of_login_page_is_free_crm()"
});
formatter.result({
  "duration": 260020100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 609079600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 21567045500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 16952800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 211506400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "user is able to create a new contact",
  "description": "",
  "id": "free-crm-login-feature;user-is-able-to-create-a-new-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user is already on home page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});