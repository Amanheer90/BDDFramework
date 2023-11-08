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
Feature: Presto Data Table Feature

	 Scenario: Presto data table scenario
  Given User is already on login page 
  When title of login page is "Loading..."
	Then user enters username and password
	| amanheer14@ymail.com | T485419k |
	Then user clicks on signin button
	And user is on LoginPage
	Then user moves to My Prodcuts Page
	Then user clicks on Redeem Voucher link
	Then user enters voucher code
	| THSVGUVB |
	Then user quit

	
