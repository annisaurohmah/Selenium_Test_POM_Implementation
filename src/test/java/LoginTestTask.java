import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.ResultPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginTestTask {
    public WebDriver driver;
    public String Url = "https://practicetestautomation.com/practice-test-login/";
    public String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
    @BeforeAll
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(Url);
    }
    @Test
    public void loginTest(){
        LoginPage login = new LoginPage(driver);
        ResultPage result = new ResultPage(driver);

        login.enterUsername("student");
        login.enterPassword("Password123");
        login.clickSubmit();

        //assertion
        result.getTextCongrats();
        Assertions.assertEquals(result.getActualUrl(), expectedUrl);

    }

    @AfterAll
    public void terminateBrowser() {
        driver.quit();
    }
}
