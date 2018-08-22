package atividade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CINTIA
 */
public class Calculadora {

    public List<Funcionario> calcularDesconto(String cargo, float salarioLiquido) {
        ArrayList<Funcionario> func = new ArrayList<>();
        Funcionario p = new Funcionario();
        func.add(p);
        
        
        if(cargo.equals(p.getCargo()) && p.getSalarioBase() >= 3000.0f){
           
            salarioLiquido = p.getSalarioBase() - (p.getSalarioBase() * 0.20f);
        }
        
      
        return func;
    }
}
