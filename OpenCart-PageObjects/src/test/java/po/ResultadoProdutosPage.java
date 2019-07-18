package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author NUNES
 */
public class ResultadoProdutosPage extends StoreBasePage{
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[1]/a/img")
    WebElement pMacbook;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[1]/h4/a")
    WebElement pSony;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a")
    WebElement pCanon;
      
    public ResultadoProdutosPage(WebDriver driver) {
        super(driver);
    }
    
    public InfoNotebookPage goToInfoMac(){
        pMacbook.click();
        return new InfoNotebookPage(driver);
    }
    
    public InfoNotebookPage goToInfoSony(){
        pSony.click();
        return new InfoNotebookPage(driver);
    }
    
    
    public InfoCameraPage goToInfoCannon(){
        pCanon.click();
        return new InfoCameraPage(driver);
    }
    
    
}
