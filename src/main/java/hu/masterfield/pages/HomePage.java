package hu.masterfield.pages;

import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath =)
    WebElement SearchField;

    @FindBy(xpath =)
    WebElement SearchButton;

    public SearchResultPage search(String productName){

        searchField.sendKeys(productName);
        searchButton.click();
        SearchResultPage searchResult = new SearchResultPage(driver);
        searchResult.isLoaded();
        return SearchResult;



    }
}
