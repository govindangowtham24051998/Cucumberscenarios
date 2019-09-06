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
Feature: TestMEapp
  I want to use this template for my feature file

  @sanity
  Scenario: Users moves to the cart without adding any item
    Given Alex has registerd into TestMEapp
    When Alex search for product Headphones
    And Try to proceed to checkout without adding item in cart
    Then TestMeApp doesnt display the cart icon
   