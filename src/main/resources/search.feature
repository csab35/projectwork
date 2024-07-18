Feature:
  Adott termék megkeresése a Kereső funkció által

  Example:  Searching a product with keyword
    Given I am on the homepage
    When I search a "banán" word in search bar
    Then I should see the "banán" product