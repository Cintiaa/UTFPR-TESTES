package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author NUNES
 */
public class CheckOutPage extends StoreBasePage{

    @FindBy(name = "account")
    WebElement register;
    
    @FindBy(xpath = "//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input")
    WebElement guest_checkout;
   
    @FindBy(id = "button-account")
    WebElement bt_account;

    
    //Redirecionar página e preencher formulário
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    
 
    public RegisterPage goToCheckOutSucess() {
       
       // guest_checkout.click();
        register.isEnabled();
        bt_account.click();
        return new RegisterPage(driver);
    }

}
