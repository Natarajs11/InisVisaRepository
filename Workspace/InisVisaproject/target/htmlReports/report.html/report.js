$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/IndianVisa.feature");
formatter.feature({
  "name": "To check Functonality of Indian visa status for Ireland",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User is on the inis website",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has visited inis website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.IndianVisaSteps.user_has_visited_inis_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select nationality from drop down list",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.IndianVisaSteps.user_select_nationality_from_drop_down_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hits select button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.IndianVisaSteps.hits_select_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to visa-required page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.IndianVisaSteps.user_is_navigated_to_visa_required_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user select more than 3 months.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.IndianVisaSteps.when_user_select_more_than_months(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to study page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.IndianVisaSteps.user_is_navigated_to_study_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user clicks on the study link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.IndianVisaSteps.when_user_clicks_on_the_study_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to visa long study page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.IndianVisaSteps.user_is_navigated_to_visa_long_study_page()"
});
formatter.result({
  "status": "passed"
});
});