package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import po.CouponsPage;
import po.GiftVouchersPage;
import po.HomePage;
import po.HomeStorePage;
import po.InfoNotebookPage;
import po.LoginAdmPage;
import po.MyWishListPage;
import po.NotePage;
import po.OrdersPage;
import po.ProductsPage;
import po.ResultadoPesquisaPage;
import po.ShoppingCartPage;

/**
 *
 * @author CINTIA
 */
public class OpencartTest {

    private WebDriver driver;
    LoginAdmPage loginAdm;
    HomePage opencart;
    HomeStorePage store;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void before() {

        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1200x600");
        chromeOptions.addArguments("lang=en-US");
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginAdm = new LoginAdmPage(driver);
        store = new HomeStorePage(driver);
    }

    @After
    public void after() {
        driver.close();
    }

    private void login() {
        this.opencart = loginAdm.realizarLogin("teste", "utfpr");
    }

    /*
    @Test
    public void teste() {
        loginAdm = new LoginAdmPage(driver);
        String username = "teste";
        String password = "utfpr";
        HomePage opencart = loginAdm.realizarLogin(username, password);
        assertEquals("Dashboard", opencart.getText());
    }
     */
    //Por algum motivo o driver passou a causar uma exceção e eu só consegui executar os teste utilizando internet móvel
   // @Ignore //passou
    @Test
    public void ct01() {
        login();
        //Cadastro de produto 
        //tfassertEquals("Dashboard", opencart.getText());
        String product_name = "Notebook HP";
        String description = "i5 8gb placa de vídeo";
        String meta_tag = "notebook-hp";
        String model = "HP11025";
        String price = "2880,00";
        String quantity = "5";
        String manufacturer = "HP";
        String category = "Components  >  Monitors";
        //String customer = "Default";
        String QtdDescont = "5";
        String priority = "2";
        String PrecoDesconto = "1000";
        String inicio = "2018-11-01";
        String fim = "2018-11-20";
        String keyword = "ABCDE";

        ProductsPage produto = opencart.selecionaOpcao().goToProductsPage().goToAddProducts()
                .goToNewProducts(product_name, description, meta_tag, model, price, quantity, manufacturer, category,
                        QtdDescont, priority, PrecoDesconto, inicio, fim, keyword);
        assertTrue(produto.sucess());

    }

   // @Ignore //passou
    @Test
    public void ct02() {
        //Verificar se o produto cadastrado no caso de teste 01 aparece na loja
        login();
        HomeStorePage home = opencart.selecionaItem().goToStore();
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1).toString());
        assertEquals(driver.getTitle(), home.getTitle());

        String pesquisa = "HP LP3065";
        ResultadoPesquisaPage resultado = store.goToResultado(pesquisa);
        assertEquals("HP LP3065", resultado.resultado());

        driver.close();
        driver.switchTo().window(tabs.get(0).toString());

    }

   // @Ignore
    @Test
    public void ct03() {

        //Realizar uma compra sem que o cliente possua cadastro na loja, o cadastrado será feito para confirmar a compra
        login();
        HomeStorePage home = opencart.selecionaItem().goToStore();
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1).toString());
        assertEquals(driver.getTitle(), home.getTitle());

        InfoNotebookPage info = store.selecionarOpcao().goToLaptopNotebook().goToInfoMac().addCart();
        assertTrue(info.sucess());
        String firstfame = "Ana Maria";
        String lastname = "Martins";
        String email = "anamaria@gmail.com";
        String telephone = "999999999";
        String password = "teste123";
        String passwordConfirm = "teste123";
        String address = "Rua Duque de Caxias";
        String city = "Cornelio Procopio";
        String postCode = "12345000";
        String country = "Brazil";
        String region = "Paraná";
        //InfoProdutoPage info = new InfoNotebookPage(driver);
        HomeStorePage compra = info.goToShoppingCart().goToCheckOut()
                .cadastrarCliente(firstfame, lastname,
                        email, telephone, password, passwordConfirm, address, city, postCode, country, region)
                .gotToDeliveryMethod().goToPaymentMethod().goToConfirmOrder().goToCheckOutSucess().goToStore();

        assertEquals("Your Store", compra.title_page);

        driver.close();
        driver.switchTo().window(tabs.get(0).toString());

    }

    //
    //@Ignore //passou
    @Test
    public void ct04() {

        //Cadastrar cartão de presente e enviar ao cliente
        login();
        String codigo = "VP10";
        String f_name = "John Doe";
        String f_email = "guilherme_mattiello@hotmail.com";
        String t_name = "Ana Maria";
        String t_email = "anamaria@gmail.com";
        String theme = "Christmas";
        String messagem = "“Parabéns você recebeu um vale presente";
        String amount = "1";
        GiftVouchersPage gift = opencart.selecionaOpcao().goToGiftVouchers().goToAddGiftVouchers()
                .goToNewGiftVouchers(codigo, f_name, f_email, t_name, t_email, theme, messagem, amount);
        assertTrue(gift.sucess());
        GiftVouchersPage enviar = gift.listGift();
        assertTrue(enviar.sucess());
    }

    //@Ignore //passou
    @Test
    public void ct05() {
        //Realizar login em uma conta já cadastrada e tentar realizar um compra de um produto que está 0 no estoque
        login();
        HomeStorePage home = opencart.selecionaItem().goToStore();
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1).toString());
        assertEquals(driver.getTitle(), home.getTitle());

        String email = "anamaria@gmail.com";
        String senha = "teste123";
        String pesquisa = "Samsung Galaxy Tab 10.1";
        ResultadoPesquisaPage produto = store.selecionarItemMenu().goToLogin().goToMyAccount(email, senha).goToResultado(pesquisa);
        assertEquals(pesquisa, produto.resultado());
        produto.addCart();
        assertTrue(produto.sucess());
        ShoppingCartPage shop = produto.closeAlert();
        assertTrue(shop.error());
        HomeStorePage s = shop.fechaMensagem().goToStorePage();
        assertEquals("Your Store", s.title_page);
        driver.close();
        driver.switchTo().window(tabs.get(0).toString());

    }

   // @Ignore //passou
    @Test
    public void ct06() {
//Adicionar produto a lista de desejo sem ter feito login ou cadastro no site
        login();
        HomeStorePage home = opencart.selecionaItem().goToStore();
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1).toString());
        assertEquals(driver.getTitle(), home.getTitle());

        InfoNotebookPage produto = store.selecionarOpcao().goToLaptopNotebook().goToInfoSony().addWishList();
        assertTrue(produto.sucess());
        String email = "anamaria@gmail.com";
        String senha = "teste123";
        MyWishListPage wish = produto.goToLogin().goToMyAccount(email, senha).goToMyWishList();
        assertEquals("Sony VAIO", wish.produto());

        driver.close();
        driver.switchTo().window(tabs.get(0).toString());
    }

   // @Ignore //Passou
    @Test
    public void ct07() {
        //Cadastrar cupom de desconto
        login();
        String name = "Opencart10";
        String code = "123456";
        String discount = "10";
        String total = "0";
        String product = "Canon EOS 5D";
        String inicio = "2018-11-01";
        String fim = "2018-11-30";
        CouponsPage cupon = opencart.selecionaOpcao().goToCouponsPage().goToAddCoupons().addCoupons(name, code,
                discount, total, product, inicio, fim);
        assertTrue(cupon.sucess());
    }

   
    //@Ignore //passou
    @Test
    public void ct08() {
        //Aplicar o cupom de desconto 
        login();
        HomeStorePage home = opencart.selecionaItem().goToStore();
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1).toString());
        assertEquals(driver.getTitle(), home.getTitle());
        //String product = "Canon EOS 5D";
        String cor = "Red";
        InfoNotebookPage resultado = store.selecionarOpcao().goToCameras().goToInfoCannon().goToShoppingCartCannon(cor);
        assertTrue(resultado.sucess());
        String cupom = "123456"; //código cupon opencart10
        ShoppingCartPage shop = resultado.goToShoppingCart().useCupon(cupom);
        assertTrue(shop.sucesso());

        driver.close();
        driver.switchTo().window(tabs.get(0).toString());
    }

   // @Ignore //passou
    @Test
    public void ct09() {
        //Gerar nota de despacho dos produtos vendidos 

        login();

        OrdersPage order = opencart.selecionaOpcao().goToOrdersPage().check();
        NotePage note = order.goToNota();
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1).toString());
        assertEquals("Shipping", note.titulo());

        driver.close();
        driver.switchTo().window(tabs.get(0).toString());

    }

   // @Ignore //passou
    @Test
    public void ct10() {
        //Escrever Review sobre produto comprado 
        String nome = "Teste";
        String desc = "Esse produto é muito bom. Super recomendo ele a todos!! Mega satisfeita.";

        login();
        HomeStorePage home = opencart.selecionaItem().goToStore();
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1).toString());
        assertEquals(driver.getTitle(), home.getTitle());

        InfoNotebookPage info = store.selecionarOpcao().goToLaptopNotebook().goToInfoMac().addReview(nome, desc);
        assertTrue(info.reviewSucess());

        driver.close();
        driver.switchTo().window(tabs.get(0).toString());
    }
}
