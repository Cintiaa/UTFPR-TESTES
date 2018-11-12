package com.mycompany.opencartpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class MenuPage extends OpenCartBasePage{
    
    @FindBy(xpath = "//*[@id=\"menu-catalog\"]/a")
    WebDriver catalog;
    
    @FindBy(xpath = "//*[@id=\"collapse1\"]/li[2]/a")
    WebDriver products;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

   
}
