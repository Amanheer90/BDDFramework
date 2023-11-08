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
@FunctionalTest
Feature: Presto Card application Testing 

  @SmokeTest @RegressionTest
  Scenario: Login with correct username and correct password
    Given This is a valid login test
  
    
     @RegressionTest
  Scenario: Login with incorrect username and correct password
    Given This is a invalid login test
  

@SmokeTest
     
  Scenario: Add Voucher Code
    Given This is a a voucher Page
   
