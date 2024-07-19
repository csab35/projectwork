package hu.masterfield.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"product-list\"]/div[2]/div[3]/div/div[1]/div[1]/div")
    WebElement searchResultCount;

    @FindBy(xpath = "//*[@id=\"results\"]/h1")
    WebElement searchProduct;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void validateSearchResultNumber(int numOfProducts) {
        assertTrue(searchResultCount.getText().contains("" + numOfProducts));
    }

    public boolean isLoaded() {
        return isLoaded(searchResultCount);
    }


    public void verifyProductLoaded(String product) {
        assertEquals(product, searchProduct.getText());
    }
}



