package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author NUNES
 */
public class ProductPage extends OpenCartBasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    WebElement bt_add_new;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]")
    WebElement alert;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public OpenCartBasePage AddProduct(){
        bt_add_new.click();
        return new AddProductPage(driver);
    }
    
    public boolean Sucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alert));
        return alert.isDisplayed();
    }

}
