package com.mycompany.opencartpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class OpenCartBasePage extends BasePage{
    
    @FindBy(xpath = "//*[@id=\"modal-security\"]/div/div/div[1]/button")
    WebElement fechaModal;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/h1")
    WebElement titulo;
    
    MenuPage menupage;

    public OpenCartBasePage(WebDriver driver) {
        super(driver);
        menupage = new MenuPage(driver);
    }
    
    public MenuPage selecionaItemMenu(){
        return menupage;
    }
    
    
    
    
}
