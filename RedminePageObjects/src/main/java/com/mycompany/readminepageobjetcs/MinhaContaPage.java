package com.mycompany.readminepageobjetcs;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author CINTIA
 */
public class MinhaContaPage extends RedmineBasePage {

    WebElement user_firstname;

    WebElement user_lastname;
    
    WebElement user_mail;

    WebElement user_language;
    Select idioma = new Select(user_language);
    
    WebElement commit;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/p[2]/a")
    WebElement excluir_conta;
    
    WebElement flash_notice;
    
     public MinhaContaPage(WebDriver driver) {
        super(driver);
    }

  
    public MinhaContaPage AtualizarDados(String tFirstName, String tLastName, String tEmail) {
    
        user_firstname.clear();
        user_firstname.sendKeys(tFirstName);
        user_lastname.clear();
        user_lastname.sendKeys(tLastName);
        user_mail.clear();
        user_mail.sendKeys(tEmail);
     
        commit.click();
        return new MinhaContaPage(driver);
                
    }

    public ExcluirMinhaContaPage ExcluirConta() {
        excluir_conta.click();
        return new ExcluirMinhaContaPage(driver);
    }
    
    public boolean Atualizado(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(flash_notice));
        return flash_notice.isDisplayed();
    }
   

}
