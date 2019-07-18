package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class ConfirmOrder extends StoreBasePage {

    @FindBy(xpath = "//*[@id=\"button-confirm\"]")
    WebElement bt_confirm;

    public ConfirmOrder(WebDriver driver) {
        super(driver);
    }

    public CheckOutSucessPage goToCheckOutSucess() {
        bt_confirm.click();
        return new CheckOutSucessPage(driver);
    }

}
