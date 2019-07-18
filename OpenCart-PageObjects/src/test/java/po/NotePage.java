package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class NotePage extends OrdersPage {

    //@FindBy(xpath = "/html/body/div/div[1]/h1")
    //WebElement h1;
    
    public String title = "Shipping";

    public NotePage(WebDriver driver) {
        super(driver);
    }

    public String titulo() {
        return title;
    }

}
