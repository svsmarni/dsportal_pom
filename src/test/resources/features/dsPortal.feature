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
Feature: feature to test if able to open content page
  I want to use this template for my feature file

  @tag1
  Scenario Outline: automate Get Started, Registration, Login, Signout
    Given user is on home page
    And user clicks on "Get Started" button
    And Next page is displayed with content
    When user cicks on "sign-in" button
    And user enters valid username <username> and password <password> and clicks on login button
    Then user should be signed-in and <username> visible on the page
    And user selects Arrays from dropdown
    Then user selects Arrays in Python
    Then user clicks on "try here"
    And user types code in the textarea
    And user clicks "run" and then go back to homepage
    Then user selects Linked List from dropdown
    Then user selects Stack from dropdown
    Then user selects Queue from dropdown
    Then user selects Tree from dropdown
    Then user selects Graph from dropdown

    #And username and sign out button should be displayed
    Examples: 
      | username   | password      |
      | Sireesha44 | california@44 |
      #| sireesha44   | california@44 |
      #| Sireesha44 | california@44  |
