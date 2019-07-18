package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author NUNES
 */
public class ProductsPage extends Navigation {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    WebElement bt_add;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]")
    WebElement alert_sucess;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public AddNewProductsPage goToAddProducts() {
        bt_add.click();
        return new AddNewProductsPage(driver);
    }

    public boolean sucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alert_sucess));
        return alert_sucess.isDisplayed();
    }

}
