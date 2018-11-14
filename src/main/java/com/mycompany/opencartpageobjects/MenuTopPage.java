package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
class MenuTopPage extends OpenCartBasePage {

    @FindBy(xpath = "//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span")
    WebElement my_account;

    @FindBy(xpath = "//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/div/a[2]")
    WebElement login;

    MenuTopPage(WebDriver driver) {
        super(driver);
    }
    
    private OpenCartBasePage Login(){
        my_account.click();
        login.click();
        return new LoginPage(driver);
    }

}
