package com.dicoding.kotlin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    By search_bar = new By.ByName("q");
    By button = new By.ByName("btnK");
    WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }
    public void setSearch_bar(String query){
        //memasukkan kueri
        driver.findElement(search_bar).sendKeys(query);
    }

    public ResultPage clickSearch(){
        driver.findElement(button).submit();
        return new ResultPage(driver);
    }

}
