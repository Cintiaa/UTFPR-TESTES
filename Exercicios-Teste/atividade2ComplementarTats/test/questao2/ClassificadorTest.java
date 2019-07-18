package questao2;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CINTIA
 */
public class ClassificadorTest {

    Classificador c;

    public ClassificadorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        c = new Classificador();
    }

    @After
    public void tearDown() {
    }

    /**
     * Implemente casos de teste em JUnit para o método
     * “definirFaixaEtaria(...)” da classe Classificador que verifique as
     * seguintes situações: (i) um valor de idade inválido; (ii) uma pessoa que
     * é criança; (iii) uma pessoa que é adolescente; (iv) uma pessoa que é
     * adulta; e (ii) uma pessoa que é idosa. 
     *
     */
    @Test(expected = IllegalArgumentException.class) //Verifica se a Idade é inválida para casos menores que 0
    public void ct1() {

        Pessoa p = new Pessoa("Maria", -1);

        System.out.println(c.definirFaixaEtaria(p));
        try {
            c.definirFaixaEtaria(p);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "idade invalida");
        }
    }
    
    @Test(expected = IllegalArgumentException.class) //Verifica se a Idade é inválida para casos maiores de 110
    public void ct2() {

        Pessoa p = new Pessoa("Maria", 110);

        System.out.println(c.definirFaixaEtaria(p));
        try {
            c.definirFaixaEtaria(p);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "idade invalida");
        }

    }

    @Test //Verifica se pessoa é criança
    public void ct3() {

        Pessoa p = new Pessoa("Maria", 5);
        System.out.println(c.definirFaixaEtaria(p));

        assertEquals(c.definirFaixaEtaria(p), "Maria eh crianca");

    }

    @Test //Verifica se pessoa é adolescente
    public void ct4() {

        Pessoa p = new Pessoa("Maria", 18);
        System.out.println(c.definirFaixaEtaria(p));
        assertEquals(c.definirFaixaEtaria(p), "Maria eh adolescente");

    }
    
    @Test //Verifica se pessoa é adulto
    public void ct5() {

        Pessoa p = new Pessoa("Maria", 23);
        System.out.println(c.definirFaixaEtaria(p));
        assertEquals(c.definirFaixaEtaria(p), "Maria eh adulto");

    }
    
    @Test //Verifica se pessoa é idoso
    public void ct6() {

        Pessoa p = new Pessoa("Maria", 109);
        System.out.println(c.definirFaixaEtaria(p));
        assertEquals(c.definirFaixaEtaria(p), "Maria eh idoso");

    }

}
