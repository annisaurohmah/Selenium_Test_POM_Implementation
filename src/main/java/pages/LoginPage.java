package pages;

import objects.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    LoginObject loginObject;
    BasePage pages;
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        pages = new BasePage(driver);
        loginObject = new LoginObject(driver);
    }

    public void enterUsername(String username){
        try {
            pages.inputText(loginObject.getUsernameField(), username);
        } catch (InterruptedException e) {
            throw new RuntimeException("Kesalahan pada ID", e);
        }
    }
    public void enterPassword(String password){
        try {
            pages.inputText(loginObject.getPasswordField(), password);
        } catch (InterruptedException e) {
            throw new RuntimeException("Kesalahan pada ID", e);
        }
    }
    public void clickSubmit(){
        try {
            pages.click(loginObject.getButton());
        } catch (InterruptedException e) {
            throw new RuntimeException("Kesalahan pada ID", e);
        }
    }
}
