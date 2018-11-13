
package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author CINTIA
 */
public class ResultProductPage extends OpenCartBasePage {
    
    @FindBy(xpath = "//*[@id=\"button-cart\"]")
    WebElement bt_add;
    
    @FindBy(xpath= "//*[@id=\"alert-box\"]/div")
    WebElement alert;
    
    @FindBy(xpath = "//*[@id=\"cart\"]/button")
    WebElement bt_dropdown;
    
    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")
    WebElement view_cart;
    
    public ResultProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean Sucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alert));
        return alert.isDisplayed();
    }
    
    public OpenCartBasePage ShoppingCart(){
        bt_add.click();
        bt_dropdown.click();
        view_cart.click();
        return new ShoppingCartPage(driver);
    }
    
}
