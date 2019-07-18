
package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class DeliveryDetails extends StoreBasePage{
    
    @FindBy(xpath = "//*[@id=\"button-shipping-address\"]")
    WebElement bt_shipping;
    
    public DeliveryDetails(WebDriver driver) {
        super(driver);
    }
    
    public DeliveryMethod gotToDeliveryMethod(){
        bt_shipping.click();
        return new DeliveryMethod(driver);
    }
    
}
