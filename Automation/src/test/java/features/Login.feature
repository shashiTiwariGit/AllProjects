Feature: Application Login

Scenario: Home page default login
Given User is in NetBanking landing page
When User login into applicattion with username"xyz" and password "1234"
Then Home page should be displayed
And Cards are displayed

Scenario: Home page default login
Given User is in NetBanking landing page
When User login into applicattion with username"abc" and password "7894"
Then Home page should be displayed
And Cards are displayed