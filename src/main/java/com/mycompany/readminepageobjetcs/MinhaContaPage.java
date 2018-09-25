package com.mycompany.readminepageobjetcs;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author CINTIA
 */
public class MinhaContaPage extends RedmineBasePage {

    @FindBy(id = "user_firstname")
    WebElement user_firstname;
    
    @FindBy(id = "user_lastname")
    WebElement user_lastname;
    
    @FindBy(id = "user_mail")
    WebElement user_email;
    
    @FindBy(id = "user_language")
    WebElement user_language;
    Select idioma = new Select(user_language);

    @FindBy(xpath = "//*[@id=\"my_account_form\"]/div[1]/input")
    WebElement salvar;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/p[2]/a")
    WebElement excluir_conta;
    
     public MinhaContaPage(WebDriver driver) {
        super(driver);
    }

    public void AtualizarDados(String tFirstName, String tLastName, String tEmail, String tLanguage) {
        user_firstname.sendKeys(tFirstName);
        user_lastname.sendKeys(tLastName);
        user_email.sendKeys(tEmail);
        idioma.selectByVisibleText(tLanguage);
        salvar.submit();
    }

    public ExcluirMinhaContaPage ExcluirConta() {
        excluir_conta.click();
        return new ExcluirMinhaContaPage(driver);
    }

   

}
