#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Sam is able to login successfully with valid details
    Given  Sam is on the login page
    When Sam enters "sam@something.com" and "password"
    And Sam clicks on Login
    Then Sam should be able to Login successfully
    And Sam should navigate to "Fly Away - Dashboard"

   @tagTable
  Scenario: Sam is able to login successfully with valid details
    Given Sam is login with user details:
         | sam@something.com     | pwd             | LoginPass            |    FlyAway.home    |
      	 |sam@somewrong.com      | pwd             | LoginFail            |    FlyAway.login   |
    
  
  @tagLogin
  Scenario: Sam is login with various data set
	Given Sam is on the login page
	When Sam enters "<username>" and "<password>"
	And Sam clicks on Login
	Then Sam should be ale to validate "<loginstatus>"
	And Sam should be navigated to "<expPage>"

    Examples: 
  | username              | password | loginstatus     |    expPage         |
  | sam@something.com     | pwd      | LoginPass       |    FlyAway.home    |
  | sam@somewrong.com     | pwd      | LoginFail       |    FlyAway.login   |
  #| sam@something.com     | pwd2     | LoginFail       
