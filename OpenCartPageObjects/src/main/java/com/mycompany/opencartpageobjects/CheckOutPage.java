package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author CINTIA
 */
public class CheckOutPage extends OpenCartBasePage {

    @FindBy(name = "account")
    WebElement check_register;

    @FindBy(id = "button-account")
    WebElement bt_account;

    @FindBy(id = "input-payment-firstname")
    WebElement first_name;

    @FindBy(id = "input-payment-lastname")
    WebElement last_name;

    @FindBy(id = "input-payment-email")
    WebElement email;

    @FindBy(id = "input-payment-telephone")
    WebElement telephone;

    @FindBy(id = "input-payment-password")
    WebElement password;

    @FindBy(id = "input-payment-confirm")
    WebElement password_confirm;

    @FindBy(id = "input-payment-address-1")
    WebElement address;

    @FindBy(id = "input-payment-city")
    WebElement city;

    @FindBy(id = "input-payment-postcode")
    WebElement post_code;

    @FindBy(id = "input-payment-country")
    WebElement country;
    Select selectCountry = new Select(country);

    @FindBy(id = "input-payment-zone")
    WebElement region;
    Select selectRegion = new Select(region);

    @FindBy(name = "newsletter")
    WebElement click_newsletter;

    @FindBy(name = "agree")
    WebElement click_agree_policy;

    @FindBy(id = "button-register")
    WebElement bt_register;

    @FindBy(id = "button-shipping-address")
    WebElement bt_shipping_address;

    @FindBy(id = "button-shipping-method")
    WebElement bt_shipping_method;

    @FindBy(xpath = "//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input")
    WebElement click_agree_conditions;

    @FindBy(id = "button-payment-method")
    WebElement bt_payment_method;

    @FindBy(id = "button-confirm")
    WebElement bt_confirm;

    //Redirecionar página e preencher formulário
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public OpenCartBasePage CheckOutSucess(String tFirstName, String tLastName, String tEmail, String tTelephone,
            String tPassword, String tPasswordConfirm, String tAddress, String tCity, String tPostCode,
            String tCountry, String tRegion) {
        check_register.isEnabled();
        bt_account.click();
        first_name.sendKeys(tFirstName);
        last_name.sendKeys(tLastName);
        email.sendKeys(tEmail);
        telephone.sendKeys(tTelephone);
        password.sendKeys(tPassword);
        password_confirm.sendKeys(tPasswordConfirm);
        address.sendKeys(tAddress);
        city.sendKeys(tCity);
        post_code.sendKeys(tPostCode);
        selectCountry.selectByVisibleText(tCountry);
        selectRegion.selectByVisibleText(tRegion);
        click_newsletter.click();
        click_agree_policy.click();
        bt_register.click();
        bt_shipping_address.click();
        bt_shipping_method.click();
        bt_payment_method.click();
        bt_confirm.click();
        return new CheckOutSucessPage(driver);
    }

}
