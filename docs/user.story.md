https://bevasarlas.tesco.hu/groceries/hu-HU

#User story 1 : Regisztrálás az oldalon
              -létrehozni egy fiókot, megadjuk a később használandó -e-mail címet
                                                                    -passwordot

#User story 2 : Bejelentkezünk a regisztrált adatokkal

#User story 3: Adott termék megkeresése a Kereső funkció által

#User story 4: Mennyiség növelése/csökkentése a Kosárban

#User story 5: Adott termék és mennyiség rendelésének leadása és kifizetése

Rules: User story 1:
                    Szükséges adatok a regisztrációhoz: - e-mail cím
                                                       - jelszó: tartlmaznia kell minimum egy betűt és egy számot és legalább 8 karakter

Example: scenario: Succesfull registration
Given I am on the registration page
When i enter valid data(e-mail, password)
Then i see confirmation message
And i will be able to login with my mail-adress and my password

Rules: User story 2:
                    Adott terméket/ket kidobja a keresőmező
Example: scenario: Searching a product with keyword
Given I am on the homepage
When i enter a certain word in search bar
And i press search button
Then i should see te certain product