package atividade06;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CINTIA
 */
public class UtilitarioTest {

    public UtilitarioTest() {
    }

    /**
     * - Depois de todas as configurações, faça ao menos 4 commits. Envie um txt
     * com o link do projeto do Travis-ci e Sonar. * Considere um vetor de
     * double com entrada. Valide para valor nulo e vazio.
     *
     */
    /**
     * (i) Encontre a mediana dos números.*
     */
    @Test
    public void testaVetorOrdenadoImpar() {
        double[] v = {1, 2, 3, 4, 5};
        Utilitario u = new Utilitario();
        double res = u.Mediana(v);
        assertEquals(3.0, res, 0.01);
    }

    /**
     * (ii) Encontre a média, o menor valor, o maior valor, o número de valores
     * acima da média e o o número de valores abaixo da média.*
     */
    @Test
    public void testaVetor() {
        double[] v = {3, 5, 8, 9, 5, 1, 4};
        Utilitario u = new Utilitario();
        Estatistica res = u.CalculaEstatistica(v);
        assertEquals(5, res.getMedia(), 0.01);
        assertEquals(1, res.getMenor(), 0.01);
        assertEquals(9, res.getMaior(), 0.01);
        assertEquals(3, res.getContMenor());
        assertEquals(2, res.getContMaior());

    }

    /**
     * (iii) Encontre o desvio padrão dos números.*
     */
    @Test
    public void testaDesvioPadrao() {
        double[] v = {1, 4, 6, 3, 7};
        Utilitario u = new Utilitario();
        assertEquals(2.38747, u.DesvioPadrao(v), 0.01);

    }

    /**
     * (iv) Encontre os n maiores e os n menores número do vetor, assumindo que
     * n>=1.*
     */

    @Test
    public void testaNMaioreseMenoresNumeros() {
        double[] v = {6, 3, 1, 4, 5, 2};
        double[] vMaior = {6, 5};
        double[] vMenor = {1, 2};
        
        Utilitario u = new Utilitario();
        assertEquals(6.0, vMaior[0], 0.01);
        assertEquals(5.0, vMaior[1], 0.01);
        assertEquals(1.0, vMenor[0], 0.01);
        assertEquals(2.0, vMenor[1], 0.01);
        
    }
}
