package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class HomeStorePage extends StoreBasePage {

    @FindBy(xpath = "//*[@id=\"search\"]/input")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"search\"]/div/button")
    WebElement bt_pesquisar;

    @FindBy(xpath = "//*[@id=\"logo\"]/h1")
    WebElement h1;

    public String title_page = "Your Store";

   
    public HomeStorePage(WebDriver driver) {
        super(driver);
    }

    public ResultadoPesquisaPage goToResultado(String tSearch) {
        search.sendKeys(tSearch);
        bt_pesquisar.click();
        return new ResultadoPesquisaPage(driver);
    }

    public String getTitle() {
        return h1.getText();
    }

    
}
