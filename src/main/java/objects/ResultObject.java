package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultObject {
    WebDriver driver;
    public ResultObject(WebDriver driver){
        this.driver = driver;
    }
    public By getText(){
        return By.xpath("//*[contains(text(), 'Congratulations')]");
    }
}
