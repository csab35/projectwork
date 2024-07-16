Rules: User story 4:
Kosár kezelése-A felhasználó módosíthatja a termékek mennyiségét a kosárban

Example: scenario: Increasing the quantity of product in cart

Given i have a product in my cart
When i change the quantity of product to 2
Then the cart should reflect the new quantity
