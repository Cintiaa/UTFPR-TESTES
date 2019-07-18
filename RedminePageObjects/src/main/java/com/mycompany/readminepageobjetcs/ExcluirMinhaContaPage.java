package com.mycompany.readminepageobjetcs;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class ExcluirMinhaContaPage extends RedmineBasePage{
    
    WebElement confirm;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/form/input[3]")
    WebElement btExcluir;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/form/a")
    WebElement cancelar;
    
    public ExcluirMinhaContaPage(WebDriver driver) {
        super(driver);
    }
    
    public HomePage ConfirmacaoExcluirConta(){
        confirm.click();
        btExcluir.click();
        return new HomePage(driver);
    }
    
    public void CancelarExclusao(){
        cancelar.click();
    }
}
