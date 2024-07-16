https://bevasarlas.tesco.hu/groceries/hu-HU

#User story 1 : Regisztrálás az oldalon
              -létrehozni egy fiókot, megadjuk a később használandó -e-mail címet
                                                                    -passwordot

#User story 2 : Bejelentkezünk a regisztrált adatokkal

#User story 3: Adott termék megkeresése a Kereső funkció által

#User story 4: Mennyiség növelése/csökkentése a Kosárban

#User story 5: Adott termék és mennyiség rendelésének leadása és kifizetése



Rules: User story 2:
                     regisztrált adatokkal betudunk jelentkezni

Example: scenario: Login is working with certain data

Given I am on the login page
When i enter registered data(e-mail, password)
Then i will be able to you my own account


Rules: User story 3:
                    Adott terméket/ket kidobja a keresőmező
Example: scenario: Searching a product with keyword
Given I am on the homepage
When i enter a certain word in search bar
And i press search button
Then i should see te certain product

Rules: User story 4:
                   Kosár kezelése-A felhasználó módosíthatja a termékek mennyiségét a kosárban

Example: scenario: Increasing the quantity of product in cart

Given i have a product in my cart
When i change the quantity of product to 2
Then the cart should reflect the new quantity

Rules: User story 5:
                    Rendelés leadása és fizetés

Example: scenario: Placing an order with sucessful payment
Given i have a product in my cart
And i have entered my delivery and payment details
When i submit the order
Then i should see the confirmation message
And my order status should be Processing




                    