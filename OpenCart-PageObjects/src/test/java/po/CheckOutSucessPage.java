package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class CheckOutSucessPage extends StoreBasePage{
    
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
    WebElement bt_continue;
    
    public CheckOutSucessPage(WebDriver driver) {
        super(driver);
    }
    
    public HomeStorePage goToStore(){
        bt_continue.click();
        return new HomeStorePage(driver);
    }
}
