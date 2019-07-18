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
public class ShoppingCartPage extends StoreBasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/a")
    WebElement bt_checkout;
    
    @FindBy(name = "account")
    WebElement check;
    
    @FindBy(id = "button-account")
    WebElement button_account;

    @FindBy(xpath = "//*[@id=\"checkout-cart\"]/div[1]")
    WebElement alert_danger;

    @FindBy(xpath = "//*[@id=\"checkout-cart\"]/div[1]/button")
    WebElement close;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/div/button[2]")
    WebElement bt_remove;
    

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
    WebElement cont;
    
    @FindBy(xpath = "//*[@id=\"accordion\"]/div[1]/h4")
    WebElement use_cupon;
    
    @FindBy(xpath = "//*[@id=\"input-coupon\"]")
    WebElement coupon;
    
    @FindBy(xpath = "//*[@id=\"button-coupon\"]")
    WebElement bt_coupon;
    
    @FindBy(xpath = "//*[@id=\"checkout-cart\"]/div[1]")
    WebElement alerta;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage goToCheckOut() {
        bt_checkout.click();
        check.isEnabled();
        button_account.click();
        return new RegisterPage(driver);
    }

    public boolean error() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alert_danger));
        return alert_danger.isDisplayed();
    }
    
    public ShoppingCartPage fechaMensagem() {
        close.click();
        //bt_remove.click();
        return this;
    }

    public HomeStorePage goToStorePage() {
        cont.click();
        return new HomeStorePage(driver);
    }
    
    public ShoppingCartPage useCupon(String tCupon){
        use_cupon.click();
        coupon.sendKeys(tCupon);
        bt_coupon.click();
        return new ShoppingCartPage(driver);
    }
    
     public boolean sucesso() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alerta));
        return alerta.isDisplayed();
    }

}
