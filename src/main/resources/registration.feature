Feature:Regisztrálás az oldalon
Szükséges adatok a regisztrációhoz: - e-mail cím
- jelszó: tartlmaznia kell minimum egy betűt és egy számot és legalább 8 karakter
- későbbiekben:-megye,-település,-utca,- házszám, -cím elnevezése
-keresztnév, - vezetéknév, -telefonszám(csak számjegyekből)
-check adatvédelmi és cookie szabályzat

Example:  Succesfull registration
Given I am on the registration page
When i enter valid data(e-mail, password)
Then i see confirmation message
And i will have a account