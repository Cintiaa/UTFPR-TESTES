package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class OpcoesStore extends BasePage {

    @FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[2]/a")
    WebElement laptops_notebooks;

    @FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[2]/div/a")
    WebElement showAll_laptops_notebooks;

    @FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[7]/a")
    WebElement camera;

    @FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[7]/div/a")
    WebElement show_all_cameras;

    public OpcoesStore(WebDriver driver) {
        super(driver);
    }

    public ResultadoProdutosPage goToLaptopNotebook() {
        laptops_notebooks.click();
        showAll_laptops_notebooks.click();
        return new ResultadoProdutosPage(driver);
    }

    public ResultadoProdutosPage goToCameras() {
        camera.click();
        //show_all_cameras.click();
        return new ResultadoProdutosPage(driver);
    }

}
