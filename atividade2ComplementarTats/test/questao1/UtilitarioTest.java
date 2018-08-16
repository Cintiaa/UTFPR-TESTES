package questao1;

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
public class UtilitarioTest {

    Utilitario u;

    public UtilitarioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        u = new Utilitario();
    }

    @After
    public void tearDown() {
    }

    /*Implemente quatro casos de teste em JUnit para o método “acharExtremos(...)” da classe Utilitario que
    verifique as seguintes entradas: (i) um vetor {1, 2, 3, 4, 5, 6}; (ii) um vetor {1, 99, 3, -5, 8}; (iii) um
    vetor vazio; (iv) um vetor nulo. */
    
    @Test //Caso de teste para encontrar maior elemento do vetor
    public void ct01() throws Exception{
        int v[] = {1, 2, 3, 4, 5, 6};
        int maior  = u.acharExtremos(v).maior;
        assertEquals(maior, 6);
        System.out.println("Resultado " + u.acharExtremos(v).maior);
    }

    @Test //Caso de teste para encontrar menor elemento do vetor
    public void ct02() throws Exception {

        int v[] = {1, 99, 3, -5, 8};
        int menor  = u.acharExtremos(v).menor;
        assertEquals(menor, -5);
        System.out.println("Resultado " + u.acharExtremos(v).menor);  
    }

    @Test //caso de teste para verificar se vetor possui 0 elementos
    public void ct03() {

        int v[] = {};

        try {
            u.acharExtremos(v);
            fail();
        } catch (Exception e) {
            assertEquals(e.getMessage(), "vetor com zero elementos");
        }
    }

    @Test //Caso de teste para verificar se o vetor é nulo
    public void ct04() {

        int v[] = null;

        try {
            u.acharExtremos(v);
            fail();
        } catch (Exception e) {
            assertEquals(e.getMessage(), "vetor nao pode ser nulo");
        }
    }

}
