Feature: Feature is to test practice Page

  Scenario: validate practice home page functionality
    Given Browser is open
    And User is on Practice page
    When User clicks on radio2 butoon
    And User clicks On both Alert and Confirm button
    And User clicks On both Hide and Show button
    And User clicks On Mousehover button
    And User selected iframe
    And User clicks on OpenWindow button
    And User clicks on OpenTab button
    Then radio button is selected
