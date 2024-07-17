package hu.masterfield.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"product-list\"]/div[2]/div[3]/div/div[1]/div[1]/div)")
    WebElement SearchResultCount;

    public SearchResultPage(WebDriver driver) {
        super(driver);

        public void validateSearchResultNumber(int numOfProducts){
            assertTrue(isLoaded());
            assertTrue(SearchResultCount.getText().contains("" + numOfProducts));
        }
         public boolean isLoaded(){
           boolean isLoaded = isLoaded(SearchResultCount);
           return isLoaded
        }
        

    }


}
