@crtAct
Feature: To Validate the Account creation of Fb Application

Scenario: To Create new Account 
Given To launch the browser and maximize the windows
When To Launch Url of the Fb Application
And To click Create new Account button
And To pass the first name in the Firstname field
And To pass the second name in the Secondname field
And To pass the MobileNo or Email in the Email/Mobileno field
And To create new password using the new password field
Then To close the chrome browser
