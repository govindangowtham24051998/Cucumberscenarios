$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:search/search.feature");
formatter.feature({
  "name": "Product search",
  "description": "  I want to use this template",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Searching the product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User opens testme app",
  "keyword": "Given "
});
formatter.match({
  "location": "search.user_opens_testme_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks SignIn button",
  "keyword": "When "
});
formatter.match({
  "location": "search.user_clicks_SignIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username \"lalitha\" in the field",
  "keyword": "Then "
});
formatter.match({
  "location": "search.user_enters_username_in_the_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password \"Password123\" in the field",
  "keyword": "Then "
});
formatter.match({
  "location": "search.user_enters_password_in_the_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Searches the product",
  "keyword": "Then "
});
formatter.match({
  "location": "search.user_Searches_the_product()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Sign Ou]t\u003e but was:\u003c[View Car]t\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat search.search.user_Searches_the_product(search.java:51)\r\n\tat ✽.User Searches the product(classpath:search/search.feature:29)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User proceeds to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "search.user_proceeds_to_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User buys the product",
  "keyword": "Then "
});
formatter.match({
  "location": "search.user_buys_the_product()"
});
formatter.result({
  "status": "skipped"
});
});