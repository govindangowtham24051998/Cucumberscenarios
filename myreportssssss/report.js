$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:product/product.feature");
formatter.feature({
  "name": "TestMEapp",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Users moves to the cart without adding any item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "Alex has registerd into TestMEapp",
  "keyword": "Given "
});
formatter.match({
  "location": "product.alex_has_registerd_into_TestMEapp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex search for product Headphones",
  "keyword": "When "
});
formatter.match({
  "location": "product.alex_search_for_product_Headphones()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Try to proceed to checkout without adding item in cart",
  "keyword": "And "
});
formatter.match({
  "location": "product.try_to_proceed_to_checkout_without_adding_item_in_cart()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//*[@id\u003d\"quantity_1\"]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CDC2-D-4944N62\u0027, ip: \u002710.237.17.72\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat product.product.try_to_proceed_to_checkout_without_adding_item_in_cart(product.java:51)\r\n\tat ✽.Try to proceed to checkout without adding item in cart(classpath:product/product.feature:27)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "TestMeApp doesnt display the cart icon",
  "keyword": "Then "
});
formatter.match({
  "location": "product.testmeapp_doesnt_display_the_cart_icon()"
});
formatter.result({
  "status": "skipped"
});
});