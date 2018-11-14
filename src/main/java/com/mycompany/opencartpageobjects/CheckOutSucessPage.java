package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author CINTIA
 */
public class CheckOutSucessPage extends OpenCartBasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/p[1]")
    WebElement h2;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
    WebElement bt_continue;
    
    public CheckOutSucessPage(WebDriver driver) {
        super(driver);
    }
    
    public OpenCartBasePage YourStore(){
        bt_continue.click();
        return new StorePage(driver);
    }
    
    public boolean Sucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(h2));
        return h2.isDisplayed();
    }
}
