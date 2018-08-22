package atividade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CINTIA
 */
public class Calculadora {

    public float calcularDesconto(Funcionario f) {//Melhorando o código
        if(f.getCargo().equals("Desenvolvedor")){
            if(f.getSalarioBase() >= 3000f){
              return f.getSalarioBase() - (f.getSalarioBase() * 0.20f);
            }else{
                return f.getSalarioBase() - (f.getSalarioBase() * 0.10f);
            } 
        }
        return -1;
    }
    
}
