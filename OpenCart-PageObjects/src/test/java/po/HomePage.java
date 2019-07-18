package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NUNES
 */
public class HomePage extends OpenCartBasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/h1")
    WebElement h1;

    Navigation navigation;
    MenuAdm menu;

    public HomePage(WebDriver driver) {
        super(driver);
        navigation = new Navigation(driver);
        menu = new MenuAdm(driver);
    }

    public String getText() {
        return h1.getText();
    }

    public Navigation selecionaOpcao() {
        return navigation;
    }
    
    public MenuAdm selecionaItem(){
        return menu;
    }

}
