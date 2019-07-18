package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class LoginAdmPage extends BasePage{
    
    @FindBy(id = "input-username")
    WebElement username;
    
    @FindBy(id = "input-password")
    WebElement password;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
    WebElement bt_login;
    
    public LoginAdmPage(WebDriver driver) {
        super(driver);
        driver.get("http://192.168.43.157/admin/");
    }
    
    public HomePage realizarLogin(String tUser, String tPass){
        username.sendKeys(tUser);
        password.sendKeys(tPass);
        bt_login.click();
        return new HomePage(driver);
    }
    
}
