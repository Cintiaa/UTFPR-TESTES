package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author CINTIA
 */
public class GiftVouchersPage extends OpenCartBasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    WebElement add_new;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]")
    WebElement alert;
    
    @FindBy(xpath = "//*[@id=\"form-voucher\"]/div/table/tbody/tr/td[1]/input")
    WebElement check;
    
    @FindBy(id = "button-send")
    WebElement bt_send;
    
    @FindBy(id = "//*[@id=\"content\"]/div[2]/div[1]")
    WebElement alert_gift;
    
    public GiftVouchersPage(WebDriver driver) {
        super(driver);
    }
    
    public OpenCartBasePage AddGiftVouchers(){
        add_new.click();
        return new AddGiftVouchersPage(driver);
    }
    
    public boolean Sucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alert));
        return alert.isDisplayed();
    }
    
    public boolean SucessGift() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alert_gift));
        return alert_gift.isDisplayed();
    }
}
