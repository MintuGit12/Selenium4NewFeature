
Feature: Login
@smokeTest
  Scenario Outline:: Successful login with valid credentials
    Given user launch Chrome browser
    When user open url "https://www.nopcommerce.com/en/login"
    And user enters <email> and <password>
    And click on Login
    Then Page title should bee"free and Open-Source ecommeroce platform"
When user click on Logout link
Then page title should be "Get Started"
Then close browser

Examples:
|email|password|
|Admin|Admin@123|
|Admin@12311|Adminn@13|
|Admin@12311|Adminn@123|

@regressionTest
  Scenario:Successful login with valid credentials
    Given :
    When 
    And 
    And 
