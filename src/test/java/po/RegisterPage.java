package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author CINTIA
 */
public class RegisterPage extends StoreBasePage {

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
    WebElement country_id;
    Select selectCountry = new Select(country_id);

    @FindBy(id = "input-payment-zone")
    WebElement zone_id;
    Select selectRegion = new Select(zone_id);

    @FindBy(name = "newsletter")
    WebElement click_newsletter;

    @FindBy(name = "agree")
    WebElement click_agree_policy;

    @FindBy(id = "button-register")
    WebElement bt_register;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public DeliveryDetails cadastrarCliente(String tFirstName, String tLastName, String tEmail, String tTelephone,
            String tPassword, String tPasswordConfirm, String tAddress, String tCity, String tPostCode,
            String tCountry, String tRegion) {

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
        
        return new DeliveryDetails(driver);
    }

   

}
