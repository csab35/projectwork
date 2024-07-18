Feature:
  Adott termék és mennyiség rendelésének leadása és kifizetése

  Example: Placing an order with sucessful payment
    Given I have a product in my cart
    And I have entered my delivery and payment details
    When I submit the order
    Then I should see the confirmation message
    And my order status should be "Processing"