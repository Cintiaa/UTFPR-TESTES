package com.mycompany.readminepageobjetcs;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class RedmineBasePage extends BasePage{
    
    @FindBy(tagName = "h2")
    WebElement titulo;
    
    @FindBy(id = "q")
    WebElement pesquisar;
    
    Menu menu;
    
    public RedmineBasePage(WebDriver driver) {
        super(driver);
        menu = new Menu(driver);
    }
    
    
    public Menu selecionaItemMenu(){
        return menu;
    }
    
    public String getTitle() {
        return titulo.getText();
    } 
    
    public SearchPage pesquisar(String tPesquisa){
        pesquisar.sendKeys(tPesquisa);
        pesquisar.submit();
        return new SearchPage(driver);
    }
        
    
}
