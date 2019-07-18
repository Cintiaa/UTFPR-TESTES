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
public class CouponsPage extends Navigation {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    WebElement add_new;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]")
    WebElement alert_sucess;

    public CouponsPage(WebDriver driver) {
        super(driver);
    }

    public AddNewCouponsPage goToAddCoupons() {
        add_new.click();
        return new AddNewCouponsPage(driver);
    }

    public boolean sucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alert_sucess));
        return alert_sucess.isDisplayed();
    }

}
