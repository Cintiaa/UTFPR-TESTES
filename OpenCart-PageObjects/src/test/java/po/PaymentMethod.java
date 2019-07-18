
package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class PaymentMethod extends StoreBasePage{
    
    @FindBy(name = "//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input")
    WebElement check;
    
    @FindBy(xpath = "//*[@id=\"button-payment-method\"]")
    WebElement bt_method;
    
    public PaymentMethod(WebDriver driver) {
        super(driver);
    }
    
    public ConfirmOrder goToConfirmOrder(){
        check.click();
        bt_method.click();
        return new ConfirmOrder(driver);
    }
}
