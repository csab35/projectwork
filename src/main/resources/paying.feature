Feature:
  Adott termék és mennyiség rendelésének leadása és kifizetése

Example: Placing an order with sucessful payment
Given i have a product in my cart
And i have entered my delivery and payment details
When i submit the order
Then i should see the confirmation message
And my order status should be "Processing"