package com.mycompany.readminepageobjetcs;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author CINTIA
 */
public class RegisterPage extends RedmineBasePage {

    @FindBy(id = "user_login")
    WebElement user_login;

    @FindBy(id = "user_password")
    WebElement user_password;

    @FindBy(id = "user_password_confirmation")
    WebElement user_password_confirmation;

    @FindBy(id = "user_firstname")
    WebElement user_firstname;

    @FindBy(id = "user_lastname")
    WebElement user_lastname;

    @FindBy(id = "user_mail")
    WebElement user_email;

    @FindBy(id = "user_language")
    WebElement user_language;
    Select dropdown = new Select(user_language);

    @FindBy(xpath ="//*[@id=\"new_user\"]/input[3]")
    WebElement submit;

    @FindBy(id = "errorExplanation")
    WebElement errorExplanation;
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RedmineBasePage register(String tLogin, String tPassword, String tPassConfirmation, String tFirstName,
            String tLastName, String tEmail, String tLanguage) {
        user_login.sendKeys(tLogin);
        user_password.sendKeys(tPassword);
        user_password_confirmation.sendKeys(tPassConfirmation);
        user_firstname.sendKeys(tFirstName);
        user_lastname.sendKeys(tLastName);
        user_email.sendKeys(tEmail);
        dropdown.selectByVisibleText(tLanguage);
        submit.submit();
        return new MinhaContaPage(driver);
    }

}
