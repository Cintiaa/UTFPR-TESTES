package com.mycompany.readminepageobjetcs;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author CINTIA
 */
public class HomePage extends RedmineBasePage {
    
    @FindBy(id = "flash_notice")
    WebElement flash_notice;

     public HomePage(WebDriver driver) {
        super(driver);
    }
    public boolean ContaExcluida() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(flash_notice));
        return flash_notice.isDisplayed();
    }

   

}
