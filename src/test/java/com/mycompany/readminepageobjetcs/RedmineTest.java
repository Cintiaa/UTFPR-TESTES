package com.mycompany.readminepageobjetcs;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author CINTIA
 */
public class RedmineTest {

    private WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1200x600");
        chromeOptions.addArguments("start-maximized");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//tenta pesquisar novamente
        
        driver.get("http://demo.redmine.org/");
    }

    @After
    public void after() {
        driver.close();
    }
    
    @Test
    public void CriarConta(){
                
        String login = "TesteUtfpr02";
        String password = "teste123";
        String confirmation = "teste123";
        String first_name = "Luffy";
        String last_name = "D. Monkey";
        String email = "monkeydluffy@mohmal.com";
        String language = "Portuguese/Brasil (Português/Brasil)";
        
        HomePage homePage = new HomePage(driver);
        
        MinhaContaPage minhaContaPage = (MinhaContaPage) homePage.selecionaItemMenu().IrParaPaginaDeCriarConta().
                register(login, password, confirmation, first_name, last_name, email, language);
                
        assertEquals(minhaContaPage.menu.AcessandoComo(), login);
    }
    
    
}
