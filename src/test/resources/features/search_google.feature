
Feature: Google Search Functionality

  Scenario: User searches for a keyword on Google
  Given User is on Google Home Page
   When User enters "Cucumber BDD" in the search box
   And User clicks on the search button
   Then Search results for "Cucumber BDD" should be displayed
