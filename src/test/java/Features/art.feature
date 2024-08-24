Feature: user nevigate on Artnstock website

  Scenario: user nevigate on art page
    Given user landed on artnstock main page
    When User click on art page
    Then Click on seeall
    #And user click on frist photo
    And user again click on Printable Wall Art frist photo
    And add two product in item section
    Then User Click on add to cart button
    Then I validate the outcomes
