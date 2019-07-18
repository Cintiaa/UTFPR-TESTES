package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class AddNewCouponsPage extends CouponsPage {
    
    @FindBy(id = "input-name")
    WebElement coupon_name;
    
    @FindBy(id = "input-code")
    WebElement code;
    
    @FindBy(id = "input-discount")
    WebElement discount;
    
    @FindBy(id = "input-total")
    WebElement total;
    
    @FindBy(id = "input-product")
    WebElement product;
    
    @FindBy(id = "input-date-start")
    WebElement date_start;
    
    @FindBy(id = "input-date-end")
    WebElement date_end;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button")
    WebElement bt_save;
    
    public AddNewCouponsPage(WebDriver driver) {
        super(driver);
    }
    
    public CouponsPage addCoupons(String tName, String tCode, String tDiscount, String tTotal, String tProduct,
            String tDInicio, String tDFim) {
        coupon_name.sendKeys(tName);
        code.sendKeys(tCode);
        discount.sendKeys(tDiscount);
        total.sendKeys(tTotal);
        product.sendKeys(tProduct);
        date_start.clear();
        date_start.sendKeys(tDInicio);
        date_end.clear();
        date_end.sendKeys(tDFim);
        bt_save.click();
        return new CouponsPage(driver);
    }
}
