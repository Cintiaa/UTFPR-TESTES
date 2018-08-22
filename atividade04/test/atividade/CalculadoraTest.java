package atividade;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author CINTIA
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    /**
     * “O participante deve implementar uma calculadora de salário de
     * funcionários. Caso o cargo seja DESENVOLVEDOR, o funcionário terá
     * desconto de 20% caso o salário seja maior ou igual que 3.000,00, ou
     * apenas 10% caso o salário seja menor que isso. Caso o cargo seja DBA, o
     * funcionário terá desconto de 25% caso o salário seja maior ou igual que
     * 2.000, 00, ou apenas 15% caso o salário seja menor que isso. Caso o cargo
     * seja TESTADOR, o funcionário terá desconto de 25% caso o salário seja
     * maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que
     * isso. Caso o cargo seja GERENTE, o funcionário terá desconto de 30% caso
     * o salário seja maior ou igual que 5.000,00, ou apenas 20% caso o salário
     * seja menor que isso. Exemplos de cálculo do salário: DESENVOLVEDOR com
     * salário-base 5,000.00. Salário final = 4.000,00 GERENTE com salário-base
     * de 2.500,00. Salário final: 2.000,00 TESTADOR com salário de 550.00.
     * Salário final: 467,50” (Aniche, 2012).
     *
     */
    @Test
    public void testaDescontoDesenvolvedor() {
        Calculadora calc = new Calculadora();
        Funcionario f = new Funcionario();
        f.setCargo("Desenvolvedor");
        f.setSalarioBase(5000.0f);
        assertEquals(4000.0f, calc.calcularDesconto(f), 0.01);
    }

    @Test
    public void testaDescontoTestador() {
        Calculadora calc = new Calculadora();
        Funcionario f = new Funcionario();
        f.setCargo("Testador");
        f.setSalarioBase(1800.0f);
        assertEquals(1530.0f, calc.calcularDesconto(f), 0.01);
    }

    
    @Test
    public void testaDescontoGerente() {
        Calculadora calc = new Calculadora();
        Funcionario f = new Funcionario();
        f.setCargo("Gerente");
        f.setSalarioBase(8000.0f);
        assertEquals(5600.0f, calc.calcularDesconto(f), 0.01);
    }
}
