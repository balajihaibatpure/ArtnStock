Feature: User Login and Navigate to Photo Section

  Scenario Outline: User logs in and navigates to photo section
    Given User is on the Artnstock website
    When User clicks on the photo section
    Then User is redirected to the login page
    When User logs in with username "<username>" and password "<passsword>"
    Then User should be successfully logged in
    And User should be on the photo section page

    Examples: 
      | username    | password  |
      | balaji12334 | balu@1234 |
