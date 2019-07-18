
package po;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author CINTIA
 */
public class StoreBasePage extends BasePage{
    
    MenuStore menu;
    OpcoesStore opcao;
    
    public StoreBasePage(WebDriver driver) {
        super(driver);
        menu = new MenuStore(driver);
        opcao = new OpcoesStore(driver);
    }
    
    public MenuStore selecionarItemMenu() {
        return menu;
    }

    public OpcoesStore selecionarOpcao() {
        return opcao;
    }
    
}
