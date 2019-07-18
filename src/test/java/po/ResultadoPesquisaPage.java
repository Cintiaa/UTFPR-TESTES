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
public class ResultadoPesquisaPage extends HomeStorePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a")
    WebElement resultado;

    @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div/div/div[2]/div[2]/button[1]/span")
    WebElement add_cart;

    @FindBy(xpath = "//*[@id=\"alert-box\"]/div")
    WebElement alert_sucess;

    @FindBy(xpath = "//*[@id=\"alert-box\"]/div/button")
    WebElement close_alert;
    
    @FindBy(xpath = "//*[@id=\"cart\"]/button")
    WebElement cart;
    
    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")
    WebElement view_cart;

    public ResultadoPesquisaPage(WebDriver driver) {
        super(driver);
    }

    public String resultado() {
        return resultado.getText();
    }

    public ResultadoPesquisaPage addCart() {
        add_cart.click();
        return new ResultadoPesquisaPage(driver);
    }

    public boolean sucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alert_sucess));
        return alert_sucess.isDisplayed();
    }
    
    public ShoppingCartPage closeAlert(){
        close_alert.click();
        cart.click();
        view_cart.click();
        return new ShoppingCartPage(driver);
    }
}
