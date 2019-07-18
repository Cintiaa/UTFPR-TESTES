package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class Navigation extends BasePage {

    @FindBy(xpath = "//*[@id=\"menu-catalog\"]/a")
    WebElement catalog;

    @FindBy(xpath = "//*[@id=\"collapse1\"]/li[2]/a")
    WebElement products;

    @FindBy(xpath = "//*[@id=\"menu-sale\"]/a")
    WebElement sales;

    @FindBy(xpath = "//*[@id=\"collapse4\"]/li[1]/a")
    WebElement orders;

    @FindBy(xpath = "//*[@id=\"collapse4\"]/li[4]/a")
    WebElement gift_vouchers;

    @FindBy(xpath = "//*[@id=\"collapse4-3\"]/li[1]/a")
    WebElement gift;

    @FindBy(xpath = "//*[@id=\"menu-marketing\"]/a")
    WebElement marketing;

    @FindBy(xpath = "//*[@id=\"collapse6\"]/li[2]/a")
    WebElement coupons;

    public Navigation(WebDriver driver) {
        super(driver);
    }

    public ProductsPage goToProductsPage() {
        catalog.click();
        products.click();
        return new ProductsPage(driver);
    }

    public GiftVouchersPage goToGiftVouchers() {
        sales.click();
        gift_vouchers.click();
        gift.click();
        return new GiftVouchersPage(driver);
    }

    public CouponsPage goToCouponsPage() {
        marketing.click();
        coupons.click();
        return new CouponsPage(driver);
    }
    
    public OrdersPage goToOrdersPage(){
        sales.click();
        orders.click();
        return new OrdersPage(driver);
    }
   

}
