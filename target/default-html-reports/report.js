$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/main.feature");
formatter.feature({
  "name": "User should be able to a monkey test on UI",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@task"
    }
  ]
});
formatter.scenario({
  "name": "Go several locations and confirm that everything is up and running",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@task"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the valid credentials to login into DVNGL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_definitions.MainPage_StepDefinition.enter_the_valid_credentials_to_login_into_DVNGL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Marketplace on the Dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_definitions.MainPage_StepDefinition.click_on_Marketplace_on_the_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the CyberSecurity checkbox print the number of results",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_definitions.MainPage_StepDefinition.select_the_CyberSecurity_checkbox_print_the_number_of_results()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the Network Storm and click on see prices and buy",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_definitions.MainPage_StepDefinition.select_the_Network_Storm_and_click_on_see_prices_and_buy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "From the Single user section see the price and click on buy now then click I accept",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_definitions.MainPage_StepDefinition.from_the_Single_user_section_see_the_price_and_click_on_buy_now_then_click_I_accept()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that the price has seen on the screen and email address has a warning message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definitions.MainPage_StepDefinition.verify_that_the_price_has_seen_on_the_screen_and_email_address_has_a_warning_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});