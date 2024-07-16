https://bevasarlas.tesco.hu/groceries/hu-HU

#User story 1 : Regisztrálás az oldalon
              -létrehozni egy fiókot, megadjuk a később használandó -e-mail címet
                                                                    -passwordot

#User story 2 : Bejelentkezünk a regisztrált adatokkal

#User story 3: Adott termék megkeresése a Kereső funkció által

#User story 4: Mennyiség növelése/csökkentése a Kosárban

#User story 5: Adott termék és mennyiség rendelésének leadása és kifizetése









Rules: User story 5:
                    Rendelés leadása és fizetés

Example: scenario: Placing an order with sucessful payment
Given i have a product in my cart
And i have entered my delivery and payment details
When i submit the order
Then i should see the confirmation message
And my order status should be Processing




                    