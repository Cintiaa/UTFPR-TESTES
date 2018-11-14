package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class LoginPage extends OpenCartBasePage {

    @FindBy(id = "input-email")
    WebElement email;
    
    @FindBy(id = "input-password")
    WebElement password;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/form/input")
    WebElement bt_login;
   
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    public OpenCartBasePage MyAccount(String tEmail, String tPassword){
        email.sendKeys(tEmail);
        password.sendKeys(tPassword);
        bt_login.submit();
        return new MyAccountPage(driver);
    }
    
}
