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
    
    @FindBy(xpath = "//*[@id=\"menu-sale\"]/a")
    WebElement sales;
    
    @FindBy(xpath = "//*[@id=\"collapse4\"]/li[4]/a")
    WebElement gift_vouchers;
    
    @FindBy(xpath = "//*[@id=\"collapse4-3\"]/li[1]/a")
    WebElement gift_vouchers_sale;
    

    public NavigationPage(WebDriver driver) {
        super(driver);
    }

    public OpenCartBasePage Products(){
        catalog.click();
        products.click();
        return new ProductPage(driver);
    }
    
    public OpenCartBasePage Sales(){
        sales.click();
        gift_vouchers.click();
        gift_vouchers_sale.click();
        return new GiftVouchersPage(driver);
    }
   
}
