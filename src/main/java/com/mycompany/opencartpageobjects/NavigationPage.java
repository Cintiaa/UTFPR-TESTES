package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class NavigationPage extends OpenCartBasePage{
    
    @FindBy(xpath = "//*[@id=\"menu-catalog\"]/a")
    WebElement catalog;
    
    @FindBy(xpath = "//*[@id=\"collapse1\"]/li[2]/a")
    WebElement products;

    public NavigationPage(WebDriver driver) {
        super(driver);
    }

   
}
