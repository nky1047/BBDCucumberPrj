Feature: Sign in
 
Scenario: Test demowebsop with valid credentials
 Given User has opened login page
 When user provides username and password
 Then user signs in successfully
 
Scenario: Test demowebshop with invalid data
 Given Application is opened 
 When I provide valid username and invalid password
 Then I should view a error message