package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

/**
 *
 * @author CINTIA
 */
public class StorePage extends OpenCartBasePage {
    
    @FindBy(name = "search")
    WebElement search;
    
    @FindBy(xpath = "//*[@id=\"search\"]/div/button")
    WebElement bt_search;
    
    @FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[2]/a")
    WebElement dropdown_menu;
    
    @FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[2]/div/a")
    WebElement show_option;
    Select options = new Select(show_option);
    
    @FindBy(xpath = "//*[@id=\"content\"]/h3")
    WebElement h3;
    
    MenuTopPage menutop;
    
    public StorePage(WebDriver driver) {
        super(driver);
        menutop = new MenuTopPage(driver);
    }
    
    public MenuTopPage SelectionItem(){
        return menutop;
    }
    
    public OpenCartBasePage Search(String tSearch) {
        search.sendKeys(tSearch);
        bt_search.submit();
        return new SearchPage(driver);
    }
    
    public OpenCartBasePage Result(String tOptions) {
        dropdown_menu.click();
        options.selectByVisibleText(tOptions);
        return new ResultPage(driver);
    }
    
    public boolean Sucess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(h3));
        return h3.isDisplayed();
    }
}
