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
 
  Feature: TestMeApp Registration
  this is Template 
  @smoke
  Scenario: Registration
   Given User enters in Homepage
    When User clicks the SignUp button
   Given User enters Username "Nisitharowewoweoo" in field
   Given User enters firstname "Nishiwer" in field
   Given User enters lastname "Nishieeer" in field
   Given User enters password "Nishi" in field
   Given User enters confirmpassword "Nishi" in field
   Given User enters gender "Male" in field
   Given User enters email "Nishi@mail.com" in field
   Given User enters mobilenumber "8775454878" in field
   Given User enters dob "10/12/1785" in field
   Given User enters address "Nishi in andra" in field
   Given User enters security question "What is your birth place?" in field
   Given User enters answer "Nishi" in field  
   Then user clicks Register button
   Then Login page is diplayed   
   
