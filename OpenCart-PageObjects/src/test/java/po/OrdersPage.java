package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class OrdersPage extends Navigation {

    @FindBy(xpath = "//*[@id=\"form-order\"]/div/table/thead/tr/td[1]/input")
    WebElement check_list;

    @FindBy(xpath = "//*[@id=\"button-shipping\"]")
    WebElement bt_shipping;
        
    public OrdersPage(WebDriver driver) {
        super(driver);
    }

    public OrdersPage check(){
    check_list.click();
    return this;
    }
    
    public NotePage goToNota(){
        bt_shipping.click();
        return new NotePage(driver);
    }
}
