package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class ShoppingCartPage extends OpenCartBasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/a")
    WebElement check_out;
    
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public OpenCartBasePage CheckOut(){
        check_out.click();
        return new CheckOutPage(driver);
    }
}
