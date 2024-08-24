Feature: Art Print Purchase

  Scenario: User selects options, adds digital art print to cart, and proceeds to checkout
    Given User is on the Artnstock webpage
    Then User click on artnstock home page
    And User navigates to the "Abstract Art" section
    And User selects the "Shop Now" option for digital art prints
    And User selects the following options:
      | Property           | Value       |
      | Art Print Type     | Digital     |
      | Print Orientation  | Vertical    |
      | Print Size         | 28cm x 36cm |
      | Top Mat Colour     | Black       |
      | Bottom Mat Colour  | Black       |
      | Material for Print | picture rag |
    When User adds the selected digital art print to the cart
    And User proceeds to checkout
    And User selects "Credit/Debit Card" as the payment method
    And User provides the following credit/debit card information:
      | Card Type       | Select Card         |
      | Card Number     | 1234 5678 9012 3456 |
      | Expiration Date | 24/26               |
      | CVC             |                 123 |
    And User provides the following contact information:
      | First Name    | Balaji                     |
      | Last Name     | Haibatpure                 |
      | Email Address | balajihaibatpure@gmail.com |
      | Phone         |                  973007902 |
    And User provides the following shipping address:
      | Location        | India                                        |
      | Address Line 1  | S. No. 203/2A, Plot 16A, Rajiv Nagar (South) |
      | Address Line 2  | Viman Nagar                                  |
      | City            | Pune                                         |
      | Zip/Postal Code |                                       411014 |
      | State/Province  | Maharashtra                                  |
    And User continues to checkout
    And User click on complete order
    And user click on card
    And User provides the following credit/debit card information:
      | Card Type       | Select Card         |
      | Card Number     | 1234 5678 9012 3456 |
      | Expiration Date | 24/26               |
      | CVC             |                 123 |
    And User click on pay now
    Then User should see the checkout confirmation page
