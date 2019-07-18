package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class MyWishListPage extends MyAccountPage{
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr/td[2]/a")
    WebElement produto;
    
    public MyWishListPage(WebDriver driver) {
        super(driver);
    }
    
    public String produto(){
        return produto.getText();
    }
}
