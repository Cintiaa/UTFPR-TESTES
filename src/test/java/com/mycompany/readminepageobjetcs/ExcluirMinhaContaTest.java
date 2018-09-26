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
public class ExcluirMinhaContaTest {
    
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
    public void ExcluiConta() {
        String login = "TesteUtfpr02";
        String password = "teste123";
        HomePage home = (HomePage) homePage.selecionaItemMenu()
                .IrParaPaginaDeLogin().IrParaMinhaPagina(login, password);

        assertEquals(login, home.selecionaItemMenu().AcessandoComo());
        assertTrue(homePage.selecionaItemMenu().IrParaMinhaConta().ExcluirConta().ConfirmacaoExcluirConta().ContaExcluida());

    }
}
