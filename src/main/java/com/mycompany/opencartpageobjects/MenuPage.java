package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class MenuPage extends OpenCartBasePage{

    @FindBy(xpath = "//*[@id=\"header\"]/div/ul/li[1]/a")
    WebElement dropdown_menu;
    
    @FindBy(xpath = "//*[@id=\"header\"]/div/ul/li[1]/div/a[2]")
    WebElement your_store;
    
    public MenuPage(WebDriver driver) {
        super(driver);
    } 
    
    
    public OpenCartBasePage YourStore(){
        dropdown_menu.click();
        your_store.click();
        return new StorePage(driver);
    }
}
