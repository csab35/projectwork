package hu.masterfield.steps;

import hu.masterfield.pages.HomePage;
import hu.masterfield.pages.SearchResultPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TescoSteps {
    protected static WebDriver driver;

    protected static WebDriverWait wait;


    HomePage homePage;
    private SearchResultPage search;


    @BeforeAll
    public static void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");

        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //driver.manage().window().setSize(new Dimenson(800, 800));
    }

    @AfterAll
    public static void cleanup() {
        driver.quit();
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        homePage = new HomePage(driver);
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU");

    }

    @When("I search a {string} word in search bar")
    public void iSearchAWordInSearchBar(String product) {
        search = homePage.search(product);

    }

    @Then("I should see the {string} product")
    public void iShouldSeeTheProduct(String product) {


        search.verifyProductLoaded(product);
    }
}
