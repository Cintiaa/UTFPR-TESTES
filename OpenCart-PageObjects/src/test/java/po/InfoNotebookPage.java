package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author NUNES
 */
public class InfoNotebookPage extends StoreBasePage {

    @FindBy(id = "button-cart")
    WebElement bt_cart;

    @FindBy(xpath = "//*[@id=\"alert-box\"]/div")
    WebElement alert_sucess;

    @FindBy(xpath = "//*[@id=\"cart\"]/button")
    WebElement cart;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")
    WebElement view_cart;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[1]/button[1]")
    WebElement add_wish_list;

    @FindBy(xpath = "//*[@id=\"alert-box\"]/div/a[1]")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"alert-box\"]/div/button")
    WebElement close_alert;

    @FindBy(id = "review-tab")
    WebElement review_tab;
    
    @FindBy(id = "input-name")
    WebElement input_name;
    
    @FindBy(id = "input-review")
    WebElement input_review;
    
    @FindBy(xpath = "//*[@id=\"form-review\"]/div[4]/div/input[5]")
    WebElement rating;
    
    @FindBy(id = "button-review")
    WebElement button_review;
    
    @FindBy(xpath = "//*[@id=\"form-review\"]/div[2]")
    WebElement alert_review_sucess;

    public InfoNotebookPage(WebDriver driver) {
        super(driver);
    }

    public InfoNotebookPage addCart() {
        bt_cart.click();
        return new InfoNotebookPage(driver);
    }

    public InfoNotebookPage addWishList() {
        add_wish_list.click();
        return new InfoNotebookPage(driver);
    }

    public LoginPage goToLogin() {
        login.click();
        return new LoginPage(driver);
    }

    
    public InfoNotebookPage addReview(String tNome, String tDescription){
        review_tab.click();
        input_name.sendKeys(tNome);
        input_review.sendKeys(tDescription);
        rating.click();
        button_review.click();
        return this;
    }
    
    public boolean sucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alert_sucess));
        return alert_sucess.isDisplayed();
    }
    
    public boolean reviewSucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alert_review_sucess));
        return alert_review_sucess.isDisplayed();
    }

    public ShoppingCartPage goToShoppingCart() {
        close_alert.click();
        cart.click();
        view_cart.click();
        return new ShoppingCartPage(driver);
    }

}
