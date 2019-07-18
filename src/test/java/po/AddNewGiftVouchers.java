package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class AddNewGiftVouchers extends GiftVouchersPage{
    
    @FindBy(id = "input-code")
    WebElement code;
    
    @FindBy(id = "input-from-name")
    WebElement from_name;
    
    @FindBy(id = "input-from-email")
    WebElement from_email;
    
    @FindBy(id = "input-to-name")
    WebElement to_name;
    
    @FindBy(id = "input-to-email")
    WebElement to_email;
    
    @FindBy(id = "input-theme")
    WebElement theme;
    
    @FindBy(id = "input-message")
    WebElement message;
    
    @FindBy(id = "input-amount")
    WebElement amount;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button")
    WebElement bt_save;
    
    public AddNewGiftVouchers(WebDriver driver) {
        super(driver);
    }
    
    public GiftVouchersPage goToNewGiftVouchers(String tCode, String tFName, String tFEmail, String tToName, String tToEmail,
            String tTheme, String tMessage, String tAmount){
        code.sendKeys(tCode);
        from_name.sendKeys(tFName);
        from_email.sendKeys(tFEmail);
        to_name.sendKeys(tToName);
        to_email.sendKeys(tToEmail);
        theme.sendKeys(tTheme);
        message.sendKeys(tMessage);
        amount.sendKeys(tAmount);
        bt_save.click();
        return new GiftVouchersPage(driver);
    }
}
