package com.mycompany.readminepageobjetcs;

import org.openqa.selenium.*;

/**
 *
 * @author CINTIA
 */
public class LostPassword extends RedmineBasePage{
    
    WebElement mail;
    WebElement commit;
    WebElement flash_error;
    
    public LostPassword(WebDriver driver) {
        super(driver);
    }
    
    public RedmineBasePage EnviaLinkSenha(String email){
        mail.sendKeys(email);
        commit.click();
        return new LoginPage(driver);
    }
    
}
