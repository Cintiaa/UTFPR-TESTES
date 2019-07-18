package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class DeliveryMethod extends StoreBasePage{
    
    @FindBy(xpath = "//*[@id=\"button-shipping-method\"]")
    WebElement bt_method;
    
    public DeliveryMethod(WebDriver driver) {
        super(driver);
    }
    
    public PaymentMethod goToPaymentMethod(){
        bt_method.click();
        return new PaymentMethod(driver);
    }
    
    
}
