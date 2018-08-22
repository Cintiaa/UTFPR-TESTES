
package atividade;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CINTIA
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testaDescontoDesenvolvedor() {
      Calculadora calc = new Calculadora();
      Funcionario f = new Funcionario();
      f.setCargo("Desenvolvedor");
      f.setSalarioBase(5000.0f);
      assertEquals(4000.0f, calc.calcularDesconto(f), 0.01);
    }
}
