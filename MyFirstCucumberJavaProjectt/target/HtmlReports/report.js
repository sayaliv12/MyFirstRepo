$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/practice.feature");
formatter.feature({
  "name": "Feature is to test practice Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate practice home page functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepsDefiniton.PracticePage.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on Practice page",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefiniton.PracticePage.user_is_on_Practice_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on radio2 butoon",
  "keyword": "When "
});
formatter.match({
  "location": "stepsDefiniton.PracticePage.user_clicks_on_radio2_butoon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks On both Alert and Confirm button",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefiniton.PracticePage.user_clicks_On_both_Alert_and_Confirm_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks On both Hide and Show button",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefiniton.PracticePage.user_clicks_On_both_Hide_and_Show_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks On Mousehover button",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefiniton.PracticePage.user_clicks_On_Mousehover_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selected iframe",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefiniton.PracticePage.user_selected_iframe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on OpenWindow button",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefiniton.PracticePage.user_clicks_on_OpenWindow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on OpenTab button",
  "keyword": "And "
});
formatter.match({
  "location": "stepsDefiniton.PracticePage.user_clicks_on_OpenTab_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "radio button is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsDefiniton.PracticePage.radio_button_is_selected()"
});
formatter.result({
  "status": "passed"
});
});