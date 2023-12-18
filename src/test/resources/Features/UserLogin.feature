Feature: User Login feature

#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#Then Should display success msg  


#"tomsmith"
#"SuperSecretPassword!"

Scenario: Valid Login
Given User is on Login Page
When User enters  "tomsmith"  and "SuperSecretPassword!" 
Then Should display success msg  


