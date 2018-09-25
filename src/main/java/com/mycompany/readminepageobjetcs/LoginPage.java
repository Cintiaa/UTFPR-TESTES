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

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[1]/a")
    WebElement lost_password;

    @FindBy(xpath = "//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input")
    WebElement login;

    @FindBy(id = " flash_error")
    WebElement flash_error;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public RedmineBasePage IrParaMinhaPagina(String tUser, String tPass) {
        username.sendKeys(tUser);
        password.sendKeys(tPass);
        login.click();
        return new LoginPage(driver);
    }

    public LostPassword IrParaPaginaLostPassword() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(lost_password));
        lost_password.click();
        return new LostPassword(driver);
    }

    private boolean Error() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(flash_error));
        return flash_error.isDisplayed();
    }
}
