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
public class GiftVouchersPage extends Navigation {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    WebElement bt_add;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]")
    WebElement alert_sucess;

    @FindBy(name = "selected[]")
    WebElement check;

    @FindBy(xpath = "//*[@id=\"form-voucher\"]/div/table/thead/tr/td[1]/input")
    WebElement check_list;

    @FindBy(xpath = "//*[@id=\"form-voucher\"]/div/table/tbody/tr[1]/td[2]")
    WebElement codigo;

    @FindBy(id = "button-send")
    WebElement bt_send;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button[2]")
    WebElement delete;

    public GiftVouchersPage(WebDriver driver) {
        super(driver);
    }

    public AddNewGiftVouchers goToAddGiftVouchers() {
        bt_add.click();
        return new AddNewGiftVouchers(driver);
    }

    public boolean sucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(alert_sucess));
        return alert_sucess.isDisplayed();
    }

    public String codigo() {
        return codigo.getText();
    }

    public GiftVouchersPage listGift() {
        if (codigo().equals("1234")) {
            check.click();
            bt_send.click();
        } else {
            check_list.click();
        }
        return new GiftVouchersPage(driver);
    }

}
