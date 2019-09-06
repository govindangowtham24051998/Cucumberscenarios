   Feature: TestMeApp Login
  this is Template for login
   @sanity
     Scenario Outline: Login Check
     	Given User enters in Homepage for work 
    When User enters SignIn button
  Then User enter username "<name>"
  Then User enter password "<password>" 
 Then User clicks Login button
  
 Examples:
        |name    |password    |
        |AlexUser|Alex@123    |   
