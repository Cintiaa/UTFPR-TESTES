package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class MenuStore extends BasePage {

    @FindBy(xpath = "//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span")
    WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/div/a[2]")
    WebElement login;

    public MenuStore(WebDriver driver) {
        super(driver);
    }

    public LoginPage goToLogin() {
        myAccount.click();
        login.click();
        return new LoginPage(driver);
    }
}
