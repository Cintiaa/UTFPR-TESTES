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
public class NewProjectTest {

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


    //Já existe um projeto com esse identificador por isso ele está comentado
    @Ignore 
    @Test
    public void CriarProjeto() {
        String login = "TesteUtfpr02";
        String password = "teste123";
        String nome = "NovoProjUtfpr123";
        String identificador = "proj123";

        homePage.selecionaItemMenu().
                IrParaPaginaDeLogin().IrParaMinhaPagina(login, password);

        NewProject novoProjeto = (NewProject) homePage.selecionaItemMenu().
                CriarNovoProjeto().Criar(nome, identificador);

        assertTrue(novoProjeto.ProjetoCriadoComSucesso());
    }
    
    @Test
    public void TentaCriarProjetoJaExistente() {
        String login = "TesteUtfpr02";
        String password = "teste123";
        String nome = "NovoProjUtfpr123";
        String identificador = "proj123";

        homePage.selecionaItemMenu().
                IrParaPaginaDeLogin().IrParaMinhaPagina(login, password);

        NewProject novoProjeto = (NewProject) homePage.selecionaItemMenu().
                CriarNovoProjeto().Criar(nome, identificador);

        assertTrue(novoProjeto.Error());
    }
    
    
}
