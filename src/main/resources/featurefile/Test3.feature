Feature: My login feature


  Background: Open browser and enter url
    Given open browser
    When enter the url"https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com"

  Scenario: login with username and password
#    Given open browser
#    When enter the url"https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com"
    And click on my account
    And enter user "skmounikuruba73@gmail.com" name and password "maneesha"
    And click on login button


 # Scenario Outline: login with username and password
#    Given open browser
#    When enter the url"https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com"
 #   And click on my account
 #   And enter user "<Username>" name and password "<Password>"
 #   And click on login button

   # Examples:
    #  | Username                  | Password      |
     # | skmounikuruba73@gmail.com | maneesha      |
     # | sthydula0423@gmail.com    | sreddy@123    |
     # | nagasesha.cr@gmail.com    | nagasesha@123 |
     # | skmounikuruba73@gmail.com | maneesha      |
    Scenario Outline: login with username and password
      Given open browser
      When enter the url""https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com"
      And enter user "<Username>" name and password"<password>"
      And click on login button
      Examples:
     |username            |password            |
     |mouni1020@123gmail.com|   57895678       |
      |haritha7864@gmail.com |hgsjutfh          |
