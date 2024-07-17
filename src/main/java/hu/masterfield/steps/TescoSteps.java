package hu.masterfield.steps;

import hu.masterfield.pages.HomePage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TescoSteps {
    @BeforeAll
    public static void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments();

        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().setSize(new Dimenson(800, 800));
    }

    @AfterAll
    public static void cleanup() {
        driver.quit();
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        HomePage = new HomePage(driver);
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU");

    }

    @When("i search a {string} word in search bar")
    public void iSearchAWordInSearchBar(String product) {


        homePage.fillSearchField(searchWord);
    }

    @Then("i should see the {string} product")
    public void iShouldSeeTheProduct(String product) {
    }
}
