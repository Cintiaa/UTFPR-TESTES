package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author NUNES
 */
public class AddNewProductsPage extends ProductsPage {

    @FindBy(id = "input-name1")
    WebElement product_name;

    @FindBy(xpath = "//*[@id=\"cke_1_contents\"]/iframe")
    WebElement description;

    @FindBy(id = "input-meta-title1")
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
    WebElement tab_link;

    @FindBy(id = "input-manufacturer")
    WebElement manufacturer;
    // Select dropdown_manufacturer = new Select(manufacturer);

    @FindBy(id = "input-category")
    WebElement category;
    // Select dropdown_category = new Select(category);

    @FindBy(xpath = "//*[@id=\"form-product\"]/ul/li[6]/a")
    WebElement tab_discount;

    @FindBy(id = "button-discount")
    WebElement bt_discount;

    //@FindBy(xpath = "//*[@id=\"discount-row1\"]/td[1]/select")
    // WebElement customer_group;
    //Select dropdown = new Select(customer_group);
    @FindBy(xpath = "//*[@id=\"discount-row0\"]/td[2]/input")
    WebElement qtd_discount;

    @FindBy(xpath = "//*[@id=\"discount-row0\"]/td[3]/input")
    WebElement priority;

    @FindBy(xpath = "//*[@id=\"discount-row0\"]/td[4]/input")
    WebElement d_price;

    @FindBy(xpath = "//*[@id=\"discount-row0\"]/td[5]/div/input")
    WebElement date_start;

    @FindBy(xpath = "//*[@id=\"discount-row0\"]/td[6]/div/input")
    WebElement date_end;

    @FindBy(xpath = "//*[@id=\"form-product\"]/ul/li[8]/a")
    WebElement tab_image;

    @FindBy(xpath = "//*[@id=\"images\"]/div[1]/div/div/button[1]")
    WebElement bt_edit;

    @FindBy(xpath = "//*[@id=\"filemanager\"]/div/div[2]/div[2]/div[1]/div/a")
    WebElement demo;

    @FindBy(xpath = "//*[@id=\"filemanager\"]/div/div[2]/div[2]/div[12]/div/a/img")
    WebElement img_thumbnail;

    @FindBy(xpath = "//*[@id=\"form-product\"]/ul/li[10]/a")
    WebElement tab_seo;

    @FindBy(xpath = "//*[@id=\"tab-seo\"]/div[2]/table/tbody/tr/td[2]/div/input")
    WebElement keywords;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button")
    WebElement bt_save;

    public AddNewProductsPage(WebDriver driver) {
        super(driver);
    }

    public ProductsPage goToNewProducts(String tProduto, String tDescricao, String tMeta, String tModelo, String tPreco,
            String tQuantidade, String tFabricante, String tCategoria, String tQtdDesconto,
            String tPrioridade, String tPrecoDesconto, String tInicio, String tFim, String tKeywords) {

        product_name.sendKeys(tProduto);
        description.sendKeys(tDescricao);
        meta_tag.sendKeys(tMeta);
        tab_data.click();
        model.sendKeys(tModelo);
        price.sendKeys(tPreco);
        quantity.clear();
        quantity.sendKeys(tQuantidade);
        tab_link.click();
        manufacturer.sendKeys(tFabricante);
        category.sendKeys(tCategoria);
        tab_discount.click();
        bt_discount.click();
        //dropdown.selectByVisibleText(tGrupo);
        qtd_discount.clear();
        qtd_discount.sendKeys(tQtdDesconto);
        priority.clear();
        priority.sendKeys(tPrioridade);
        d_price.sendKeys(tPrecoDesconto);
        date_start.clear();
        date_start.sendKeys(tInicio);
        date_end.clear();
        date_end.sendKeys(tFim);
        tab_image.click();
        bt_edit.click();
        demo.click();
        img_thumbnail.click();
        tab_seo.click();
        keywords.sendKeys(tKeywords);
        bt_save.click();
        return new ProductsPage(driver);
    }
}
