
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
    public void testaDescontoDesenvolvedor() {//Faz o teste para desconto - Fazer um commit para esse primeiro teste
       //Commit 1
        Calculadora calc = new Calculadora();
        List<Funcionario> funcionario = calc.calcularDesconto("Desenvolvedor", 3000.0f);
        Funcionario f = new Funcionario();
        f.setNome("Maria");
        f.setEmail("maria@maria.com");
        f.setSalarioBase(3000f);
        f.setCargo("Desenvolvedor");
        funcionario.add(f);
       
        System.out.println(f.getSalarioBase());
        assertEquals(2400.0f, f.getSalarioBase(), 0.01);        
    }
}
