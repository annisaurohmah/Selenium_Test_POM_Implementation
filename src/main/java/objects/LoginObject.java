package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObject {
    WebDriver driver;
    //konstraktor
    public LoginObject(WebDriver driver){
        this.driver = driver;
    }

    public By getUsernameField(){
        return By.id("username");
    }
    public By getPasswordField(){
        return By.id("password");
    }

    public By getButton(){
        return By.id("submit");
    }
}
