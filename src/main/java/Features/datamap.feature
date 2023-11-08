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
Feature: Presto Data Map Feature

	 Scenario: Presto data map scenario
  Given User is already on login page1 
  When title of login page is1 "Loading..."
	Then user enters username and password1
			| username | password |
			| amanheer14@ymail.com | T485419k |
	Then user clicks on signin button1
	And user is on LoginPage1
	Then user moves to My Prodcuts Page1
	Then user clicks on Redeem Voucher link1
	Then user enters voucher code1
	| Voucher |
	| THSVGUVB |
	| GVYUYVik |
	| jbdeuouh |
	Then user quit1

	