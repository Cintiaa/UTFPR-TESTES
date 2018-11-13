package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author CINTIA
 */
public class SearchPage extends OpenCartBasePage{
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div/div/div[2]/div[1]/h4/a")
    WebElement result;
    
    @FindBy(xpath = "//*[@id=\"content\"]/p")
    WebElement no_result;
    
    public SearchPage(WebDriver driver) {
        super(driver);
    }
 
    public boolean Sucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(result));
        return result.isDisplayed();
    }
    
    public boolean Fail(){
         WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(no_result));
        return no_result.isDisplayed();
    }
        
}
