package com.mycompany.readminepageobjetcs;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author CINTIA
 */
class NewProject extends RedmineBasePage{
    
    WebElement project_name;
    WebElement project_identifier;
    WebElement commit;
    WebElement flash_notice;
    WebElement errorExplanation;
    
    public NewProject(WebDriver driver) {
        super(driver);
    }
    
    public RedmineBasePage Criar(String nome, String identificador){
        project_name.sendKeys(nome);
        project_identifier.clear();
        project_identifier.sendKeys(identificador);
        commit.click();
        return new NewProject(driver);
    }
    
    public boolean ProjetoCriadoComSucesso() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(flash_notice));
        return flash_notice.isDisplayed();
    }
    
    public boolean Error(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(errorExplanation));
        return errorExplanation.isDisplayed();
    }
}
