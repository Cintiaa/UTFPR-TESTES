package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author CINTIA
 */
public class InfoCameraPage extends BasePage {

    @FindBy(id = "button-cart")
    WebElement bt_cart;
    
    @FindBy(id = "input-option226")
    WebElement cor;
    Select dropdown = new Select(cor);

    public InfoCameraPage(WebDriver driver) {
        super(driver);
    }

    public InfoNotebookPage goToShoppingCartCannon(String tCor) {
        dropdown.selectByVisibleText(tCor);
        bt_cart.click();
        return new InfoNotebookPage(driver);
    }

}
