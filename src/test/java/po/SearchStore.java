package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class SearchStore extends HomeStorePage {

    @FindBy(xpath = "//*[@id=\"search\"]/input")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"search\"]/div/button")
    WebElement bt_pesquisar;

    public SearchStore(WebDriver driver) {
        super(driver);
    }

    public ResultadoPesquisaPage goToResultado(String tPesquisa) {
        search.sendKeys(tPesquisa);
        bt_pesquisar.click();
        return new ResultadoPesquisaPage(driver);
    }

}
