#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Product search
  I want to use this template

  @smoke
  Scenario: Searching the product
    Given User opens testme app
    When User clicks SignIn button
    Then User enters username "lalitha" in the field
    Then User enters password "Password123" in the field
    Then User Searches the product
    Then User proceeds to checkout
    Then User buys the product
