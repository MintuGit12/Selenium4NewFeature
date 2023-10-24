
Feature: Title of your feature
  I want to use this template for my feature file

Background:
When launch the browser from config variables
And hit the homepage url of banking site

  @SmokeTest @netBankingSetup
  Scenario: Admin page default login
    Given User is on netbanking landing page
    When User login into application with "admin" and password "Password"
    Then Home page is displayed
    And Cards are displayed
    
    @RegressionTest @mortgageSetup
      Scenario: Admin page default login
    Given User is on netbanking landing page
    When User login into application with admin12 and password 8736
    Then Home page is displayed
    And Cards are displayed
    
     @RegressionTest @netBankingSetup
      Scenario Outline: Admin page default login
    Given User is on netbanking landing page
    When User login into application with "<Username>" and password "<Password>"
    Then Home page is displayed
    And Cards are displayed
    
    Examples:
	|Username|Password|
	|admin1  |Pass1|
	|contract1|Pass2|
  |1234     |83738|
  
  @SmokeTest @RegressionTest @netBankingSetup @mortgageSetup
  Scenario: User Page default sign up
  Given User is on practice landing page
  When User signup into application
  |rahul|
  |shetty|
  |contect@email.com|
  |54343646463|
  Then Home page is displayed
  And Cards are displayed
  
  @SanityTest @LoanSetup
  Scenario Outline:User goes for loan setup
  Given User is on practice landing page
  When User sign in to application using "<username>" and password "<password>"
  Then again fill form 1234 using "credential"
  Then Home page is displayed
  And cards are displayed using details
   |rahul|
  |shetty|
  |contect@email.com|
  |54343646463|
  
  Examples:
  |Username|Password|
	|admin1  |Pass1|
	|contract1|Pass2|
  |1234     |83738|
  

  


