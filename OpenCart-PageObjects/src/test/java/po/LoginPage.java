package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class LoginPage extends HomeStorePage{
    
    @FindBy(id = "input-email")
    WebElement email;
    
    @FindBy(id = "input-password")
    WebElement password;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/form/input")
    WebElement bt_login;
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    public MyAccountPage goToMyAccount(String tEmail, String tPassword){
        email.sendKeys(tEmail);
        password.sendKeys(tPassword);
        bt_login.click();
        return new MyAccountPage(driver);
    }
    
}
