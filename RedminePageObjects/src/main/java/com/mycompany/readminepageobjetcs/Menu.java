package com.mycompany.readminepageobjetcs;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author CINTIA
 */
public class Menu extends BasePage {

    @FindBy(xpath = "//*[@id=\"top-menu\"]/ul/li[1]/a")
    WebElement home;

    @FindBy(xpath = "//*[@id=\"top-menu\"]/ul/li[2]/a")
    WebElement projects;

    @FindBy(xpath = "//*[@id=\"top-menu\"]/ul/li[3]/a")
    WebElement help;

    @FindBy(xpath = "//*[@id=\"account\"]/ul/li[1]/a")
    WebElement sign_in;

    @FindBy(xpath = "//*[@id=\"account\"]/ul/li[2]/a")
    WebElement register;

    @FindBy(xpath = "//*[@id=\"loggedas\"]/a")
    WebElement loggedas;

    @FindBy(xpath = "//*[@id=\"account\"]/ul/li[1]/a")
    WebElement my_account;

    @FindBy(xpath = "//*[@id=\"account\"]/ul/li[2]/a")
    WebElement logout;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/ul[1]/li[3]/a")
    WebElement new_projects;

    public Menu(WebDriver driver) {
        super(driver);
    }

    private void clickMenuOption(WebElement menuOption) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(menuOption));
        menuOption.click();
    }

    public HomePage IrParaHomePage() {
        clickMenuOption(home);
        return new HomePage(driver);
    }

    public ProjectsPage IrParaPaginaDeProjetos() {
        clickMenuOption(projects);
        return new ProjectsPage(driver);
    }

    public HelpPage IrParaPaginaDeAjuda() {
        clickMenuOption(help);
        return new HelpPage(driver);
    }

    public LoginPage IrParaPaginaDeLogin() {
        clickMenuOption(sign_in);
        return new LoginPage(driver);
    }

    public RegisterPage IrParaPaginaDeCriarConta() {
        clickMenuOption(register);
        return new RegisterPage(driver);
    }

    public MinhaContaPage IrParaMinhaConta() {
        clickMenuOption(my_account);
        return new MinhaContaPage(driver);
    }

    public HomePage Sair() {
        clickMenuOption(logout);
        return new HomePage(driver);
    }

    public String AcessandoComo() {
        return loggedas.getText();
    }

    public NewProject CriarNovoProjeto() {
        clickMenuOption(new_projects);
        return new NewProject(driver);
    }

}
