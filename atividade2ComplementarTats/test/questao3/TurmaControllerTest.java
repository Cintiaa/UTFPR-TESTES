package questao3;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 *
 * @author CINTIA
 */
public class TurmaControllerTest {

    public TurmaControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    /*
    Implemente casos de teste em JUnit para o método “cadastrarTurma(..)” da classe “TurmaController”.
    Use o Mockito para simular as interfaces “TurmaDAO” e “VerificadorDeCodigos”. Implemente cinco
    casos de teste para cada um dos cinco possíveis retornos do método “cadastrarTurma(..)”
    **/
    @Test
    public void ct01() {

        TurmaDAO tdMock = mock(TurmaDAO.class);
        VerificadorDeCodigos vcMock = mock (VerificadorDeCodigos.class);
        
        TurmaController tc = new TurmaController(tdMock);
        Turma t1 = new Turma();
        t1.setCodDisciplina("IF54C");
        t1.setCodTurma("ES41");
        t1.setMaximoAlunos(44);
        
        vcMock.verificarCodigoDisciplina(t1.getCodDisciplina());
        
    }
}
