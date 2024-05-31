import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {
    @Test
    public void loginTest(){
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        usernameField.sendKeys("student");
        passwordField.sendKeys("Password123");
        submitButton.click();

//        // Wait for the new page to load and URL to change
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("practicetestautomation.com/logged-in-successfully/"));

        WebElement messageElement = driver.findElement(By.xpath("//*[contains(text(), 'Congratulations')]"));
        assertTrue(messageElement != null && messageElement.getText().contains("Congratulations"),
                "Message does not contain expected text");

        WebElement logoutButton = driver.findElement(By.xpath("//a[contains(text(), 'Log out')]"));
        assertTrue(logoutButton.isDisplayed(), "Logout button is not displayed");

        driver.quit();


    }
}
