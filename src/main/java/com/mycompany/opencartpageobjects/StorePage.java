package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
    
    public StorePage(WebDriver driver) {
        super(driver);
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
}
