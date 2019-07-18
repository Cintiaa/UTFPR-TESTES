package com.mycompany.readminepageobjetcs;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author CINTIA
 */
public class LoginPage extends RedmineBasePage {

    WebElement username;

    WebElement password;

    @FindBy(xpath = "//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[1]/a")
    WebElement lost_password;

    @FindBy(xpath = "//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input")
    WebElement login;

    WebElement flash_error;
    
    WebElement flash_notice;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public RedmineBasePage IrParaMinhaPagina(String tUser, String tPass) {
        username.sendKeys(tUser);
        password.sendKeys(tPass);
        login.click();

       if(Url().equals("http://demo.redmine.org/"))
            return new HomePage(driver);
        else
            return new LoginPage(driver);
    }

    public LostPassword IrParaPaginaLostPassword() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(lost_password));
        lost_password.click();
        return new LostPassword(driver);
    }

    public boolean Error() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(flash_error));
        return flash_error.isDisplayed();
    }
    
    public boolean Sucesso() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(flash_notice));
        return flash_notice.isDisplayed();
    }

}
