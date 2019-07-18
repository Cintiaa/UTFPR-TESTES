package po;

import static java.lang.System.exit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class MenuAdm extends BasePage {
    
    @FindBy(xpath = "//*[@id=\"header\"]/div/ul/li[1]/a")
    WebElement menu;
    
    @FindBy(xpath = "//*[@id=\"header\"]/div/ul/li[1]/div/a[2]")
    WebElement store;
    
    public MenuAdm(WebDriver driver) {
        super(driver);
    }
    
    public HomeStorePage goToStore() {
        menu.click();
        store.click();
        return new HomeStorePage(driver);
    }
}
