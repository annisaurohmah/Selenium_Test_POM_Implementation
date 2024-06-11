package stepDefinitions;

import com.dicoding.kotlin.ResultPage;
import com.dicoding.kotlin.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchSteps {
    WebDriver driver;
    public void setUp(){
        driver = new ChromeDriver();
        //default u/ v4.11 ke bawah
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.get("https://google.com");
    }
    @Given("user is on the search page")
    public void user_is_on_the_search_page(){
        setUp();
        driver.get("https://google.com/");
    }
    @When("user search a valid query")
    public void user_search_a_valid_query(){
        // Write code here that turns the phrase above into concrete actions
        SearchPage search = new SearchPage(driver);
        search.setSearch_bar("Annisa Urohmah");
        search.clickSearch();
    }
    @Then("user should be redirected to the result page")
    public void user_should_be_redirected_to_the_result_page(){
        // Write code here that turns the phrase above into concrete actions
        ResultPage result = new ResultPage(driver);
        Assertions.assertTrue(result.getWebTitle().contains("Annisa Urohmah"));
    }
}
