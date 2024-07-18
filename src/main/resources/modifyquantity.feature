Feature:Mennyiség növelése a Kosárban

  Example: Increasing the quantity of product in cart

    Given I have a product in my cart
    When I change the quantity of product to 2
    Then the cart should reflect the new quantity
