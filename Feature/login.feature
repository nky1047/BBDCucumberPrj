Feature: Login Test
 
 @validlogin
  Scenario: Successful Login with valid credentials
    Given User is on the login page
    And some other precondition
    When user enters username and password
    Then message displayed login successfully
    
	@invalidlogin
	Scenario: Test demowebshop with invalid credintials
	Given User is on home page
	When user enters valid username and invalid password
	Then user should see a error message