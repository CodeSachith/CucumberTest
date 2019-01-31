Feature: Application Login

Scenario: Home page default login
Given Suer is on Netbanking landing page
When User login into the application with "username" and "passowrd"
Then Home page is populated
And Cards are displayed "true"

Scenario: Home page default login
Given Suer is on Netbanking landing page
When User login into the application with "username1" and "passowrd1"
Then Home page is populated
And Cards are displayed "false"