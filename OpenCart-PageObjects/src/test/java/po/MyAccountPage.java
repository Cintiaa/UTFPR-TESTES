package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class MyAccountPage extends HomeStorePage{
    
    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[5]")
    WebElement wish_list;
    
    @FindBy(xpath = "//*[@id=\"search\"]/input")
    WebElement search;
    
    @FindBy(xpath = "//*[@id=\"search\"]/div/button")
    WebElement bt_pesquisar;
    
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    
    public MyWishListPage goToMyWishList(){
        wish_list.click();
        return new MyWishListPage(driver);
    }
    
    public ResultadoPesquisaPage goToResultado(String tSearch) {
        search.sendKeys(tSearch);
        bt_pesquisar.click();
        return new ResultadoPesquisaPage(driver);
    }
}
