package q1;

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
public class UtilTest {

    public UtilTest() {
    }

  

    @Test
    public void testeNumeroDentroDoIntervalo() {
        Util u = new Util();
        int num = u.gerarNumeroAleatorio(1, 20);
        assertTrue(num >= 1 && num <= 20);
    }

    @Test
    public void testeNumeroAleatorio() {
        Util u = new Util();
        int num = u.gerarNumeroAleatorio(-1, 20);
        assertEquals(-1, num);
    }

    @Test
    public void testeInicioMaiorQueFim() {
        Util u = new Util();
        int num = u.gerarNumeroAleatorio(100, 20);
        assertEquals(-1, num);
    }

    @Test
    public void testeCaracterEstaNaString() {
        Util u = new Util();
        char c[] = {'a', 'b', 'c', 'd', 'e'};
        String resp = u.acharCaracter(5, c, 'd');
        assertEquals("3", resp);
        System.out.println(resp);
    }

     @Test
    public void testeCaracterNaoEstaNaString() {
        Util u = new Util();
        char c[] = {'a', 'b', 'c', 'd', 'e'};
        String resp = u.acharCaracter(5, c, 'f');
        assertEquals("caracter nao encontrado", resp);
        System.out.println(resp);
    }
    @Test
    public void testeComprimentoMaior() {
        Util u = new Util();
        char c[] = {'a', 'b', 'c', 'd', 'e'};
        String resp = u.acharCaracter(9, c, 'd');
        assertEquals("comprimento fornecido diferente do comprimento real", resp);
        System.out.println(resp);
    }

    @Test
    public void testeComprimentoInvalido1() {
        Util u = new Util();
        char c[] = {'a', 'b', 'c', 'd', 'e'};
        String resp = u.acharCaracter(0, c, 'd');
        assertEquals("comprimento invalido", resp);
        System.out.println(resp);
    }

    @Test
    public void testeComprimentoInvalido2() {
        Util u = new Util();
        char c[] = {'a', 'b', 'c', 'd', 'e'};
        String resp = u.acharCaracter(21, c, 'd');
        assertEquals("comprimento invalido", resp);
        System.out.println(resp);
    }
}
