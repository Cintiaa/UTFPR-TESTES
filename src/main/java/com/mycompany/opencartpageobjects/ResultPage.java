package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author CINTIA
 */
public class ResultPage extends OpenCartBasePage{
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[1]/h4/a")
    WebElement product;
    
    public ResultPage(WebDriver driver) {
        super(driver);
    }
    
}
