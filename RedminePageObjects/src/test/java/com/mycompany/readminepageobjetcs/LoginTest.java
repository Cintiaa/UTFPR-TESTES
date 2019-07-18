package com.mycompany.readminepageobjetcs;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


/**
 *
 * @author CINTIA
 */
public class LoginTest {

    private WebDriver driver;
    HomePage homePage;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void Before() {
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1200x600");
        chromeOptions.addArguments("start-maximized");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//tenta pesquisar novamente
        driver.get("http://demo.redmine.org/");

        homePage = new HomePage(driver);
    }

    @After
    public void after() {
        driver.close();
    }

    @Test
    public void RealizarLoginSemCadastro() {
        String login = "TesteUtfpr02";
        String password = "teste123";
        LoginPage loginPage = (LoginPage) homePage.selecionaItemMenu()
                .IrParaPaginaDeLogin().IrParaMinhaPagina(login, password);

        Assert.assertTrue(loginPage.Error());
    }

  
    @Test
    public void RealizarLogin() {

        String login = "TesteUtfpr02";
        String password = "teste123";
        HomePage home = (HomePage) homePage.selecionaItemMenu()
                .IrParaPaginaDeLogin().IrParaMinhaPagina(login, password);

        assertEquals(login, home.selecionaItemMenu().AcessandoComo());
    }
    
     @Test
    public void AtualizaDados() {

        String login = "TesteUtfpr02";
        String password = "teste123";
        HomePage home = (HomePage) homePage.selecionaItemMenu().IrParaPaginaDeLogin().IrParaMinhaPagina(login, password);
        assertEquals(home.selecionaItemMenu().AcessandoComo(), login);

        String nome = "Goku";
        String sobrenome = "Son";
        String email = "songoku@mohmail.com";

        MinhaContaPage minhaContaPage = (MinhaContaPage) homePage.selecionaItemMenu().
                IrParaMinhaConta().AtualizarDados(nome, sobrenome, email);

        assertTrue(minhaContaPage.Atualizado());

    }

}
