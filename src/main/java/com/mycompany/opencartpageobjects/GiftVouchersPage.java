package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class GiftVouchersPage extends OpenCartBasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    WebElement add_new;
    
    public GiftVouchersPage(WebDriver driver) {
        super(driver);
    }
    
    public OpenCartBasePage AddGiftVouchers(){
        add_new.click();
        return new AddGiftVouchersPage(driver);
    }
}
