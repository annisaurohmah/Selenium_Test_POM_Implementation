package pages;

import objects.LoginObject;
import objects.ResultObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    ResultObject resultObject;
    BasePage pages;
    WebDriver driver;
    public ResultPage(WebDriver driver){
        this.driver = driver;
        pages = new BasePage(driver);
        resultObject = new ResultObject(driver);
    }
    public void getTextCongrats(){
        try {
            pages.verifyElementVisible(resultObject.getText());
        } catch (InterruptedException e) {
            throw new RuntimeException("Kesalahan pada ID", e);
        }
    }
    public String getActualUrl(){
        return driver.getCurrentUrl();
    }

}
