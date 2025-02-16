Feature: To Validate the login functionality of the Facebook Application

Background:
Given To Launch the chrome browser and maximize the window

Scenario: To Validate the login functionality with valid username and invalid password

When To launch the facebook Url
And To pass the vallid username in the email field
And To pass the invalid password in the password field
And To pass click the login button
And To check whether navigate to the home page or not
Then To close the browser

Scenario Outline: To Validate the positive and negative combination of login functionality
When user has to hit the facebook Url
And User has to pass the data "<mailid>" in email field
And user has to pass the data "<password>" in password field
And User has to click the Login button
Then User has to close the browser

Examples:
|mailid	             |password  |
|testmail@gmail.com  |password1 |
|testmail@yahoo.com  |password2 |
|testmail@rediff.com |password3 |
|testmail@outlook.com|password4 |