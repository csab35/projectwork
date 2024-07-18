Feature:Regisztrálás az oldalon
  Szükséges adatok a regisztrációhoz: - e-mail cím
  - jelszó: tartalmaznia kell minimum egy betűt és egy számot és legalább 8 karakter
  - későbbiekben:-megye,-település,-utca,- házszám, -cím elnevezése
  -keresztnév, - vezetéknév, -telefonszám(csak számjegyekből)
  -check adatvédelmi és cookie szabályzat

  Example:Succesful registration
    Given I am on the registration page
    When I enter valid data(e-mail, password)
    Then I see confirmation message
    And I will have a account