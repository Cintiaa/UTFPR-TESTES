package com.mycompany.opencartpageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author CINTIA
 */
public class AddProductPage extends OpenCartBasePage{
    @FindBy(id = "input-name1")
    WebElement product_name;
    
    @FindBy(xpath = "/html")
    WebElement description;
    
    @FindBy(id = "input-meta-title-9")
    WebElement meta_tag;
    
    @FindBy(xpath = "//*[@id=\"form-product\"]/ul/li[2]/a")
    WebElement tab_data;

    @FindBy(id = "input-model")
    WebElement model;
    
    @FindBy(id = "input-price")
    WebElement price;
    
    @FindBy(id = "input-quantity")
    WebElement quantity;
    
    @FindBy(xpath = "//*[@id=\"form-product\"]/ul/li[3]/a")
    WebElement link;
    
    @FindBy(id = "input-manufacturer")
    WebElement manafacturer;
    Select dropdown_manafacturer = new Select(manafacturer);
    
    @FindBy(id = "input-category")
    WebElement category;
    Select dropdown_category = new Select(category);
    
    @FindBy(xpath = "//*[@id=\"form-product\"]/ul/li[6]/a")
    WebElement discount;
    
    @FindBy(id = "button-discount")
    WebElement bt_discount;
    
    @FindBy(xpath = "//*[@id=\"discount-row0\"]/td[1]/select")
    WebElement customer_group;
    Select dropdown_customer = new Select(customer_group);
    
    @FindBy(xpath = "//*[@id=\"discount-row0\"]/td[2]/input")
    WebElement quantity_discount;
    
    @FindBy(xpath = "//*[@id=\"discount-row0\"]/td[3]/input")
    WebElement priority;
    
    @FindBy(xpath = "//*[@id=\"discount-row0\"]/td[4]/input")
    WebElement price_discount;
    
    @FindBy(xpath = "//*[@id=\"discount-row0\"]/td[5]/div/input")
    WebElement date_start;
    
    @FindBy(xpath = "//*[@id=\"discount-row0\"]/td[6]/div/input")
    WebElement date_end;
    
    @FindBy(xpath = "//*[@id=\"form-product\"]/ul/li[8]/a")
    WebElement image;
    
    @FindBy(xpath = "//*[@id=\"images\"]/div[1]/div/div/button[1]")
    WebElement add_image;
    
    @FindBy(xpath = "//*[@id=\"filemanager\"]/div/div[2]/div[2]/div[1]/div/a")
    WebElement demo;
    
    @FindBy(xpath = "//*[@id=\"filemanager\"]/div/div[2]/div[2]/div[12]/div/a/img")
    WebElement img_thumbnail;
    
    @FindBy(xpath = "//*[@id=\"form-product\"]/ul/li[10]/a")
    WebElement seo;
    
    @FindBy(xpath = "//*[@id=\"tab-seo\"]/div[2]/table/tbody/tr/td[2]/div/input")
    WebElement keyword;
    
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button")
    WebElement save;
    
    public AddProductPage(WebDriver driver) {
        super(driver);
    }
    
    public OpenCartBasePage AddNewProduct(String tProduto, String tDescription, String tMeta, String tModel,
            String tPrice, String tQuantity, String tManafacturer, String tCategory, String tCustomer,
            String tQtdDiscount, String tPriority, String tPDiscount, String tKeyword){
        product_name.sendKeys(tProduto);
        description.sendKeys(tDescription);
        meta_tag.sendKeys(tMeta);
        tab_data.click();
        model.sendKeys(tModel);
        price.sendKeys(tPrice);
        quantity.sendKeys(tQuantity);
        link.click();
        dropdown_manafacturer.selectByVisibleText(tManafacturer);
        dropdown_category.selectByVisibleText(tCategory);
        discount.click();
        bt_discount.click();
        dropdown_customer.selectByVisibleText(tCustomer);
        quantity_discount.sendKeys(tQtdDiscount);
        priority.sendKeys(tPriority);
        price_discount.sendKeys(tPDiscount);
        date_start.click();
        date_end.click();
        image.click();
        add_image.click();
        demo.click();
        img_thumbnail.click();
        seo.click();
        keyword.sendKeys(tKeyword);
        save.submit();
        return new ProductPage(driver);
    }
}
