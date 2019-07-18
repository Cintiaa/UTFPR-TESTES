package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author CINTIA
 */
public class AddGiftVouchersPage extends OpenCartBasePage {

    @FindBy(id = "input-code")
    WebElement code;
    
    @FindBy(id = "input-from-name")
    WebElement from_name;
    
    @FindBy(id = "input-from-email")
    WebElement from_email;
    
    @FindBy(id = "input-to-name")
    WebElement to_name;
    
    @FindBy(id = "input-to-email")
    WebElement to_email;
    
    @FindBy(id = "input-theme")
    WebElement theme;
    Select dropdown_theme = new Select(theme);
    
    @FindBy(id = "input-message")
    WebElement message;
    
    @FindBy(id = "input-amount")
    WebElement amount;
    
    @FindBy(id = "//*[@id=\"content\"]/div[1]/div/div/button")
    WebElement bt_save;
    
    
    public AddGiftVouchersPage(WebDriver driver) {
        super(driver);
    }
    
    public OpenCartBasePage AddNewGiftVourches(String tCode, String tFromName, String tFromEmail, String tToName,
            String tToEmail, String tTheme, String tMessage, String tAmount){
        code.sendKeys(tCode);
        from_name.sendKeys(tFromName);
        from_email.sendKeys(tFromEmail);
        to_name.sendKeys(tToName);
        to_email.sendKeys(tToEmail);
        dropdown_theme.selectByVisibleText(tTheme);
        message.sendKeys(tMessage);
        amount.sendKeys(tAmount);
        bt_save.submit();
        return new GiftVouchersPage(driver);
    }
    
}
