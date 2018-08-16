package atividade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CINTIA
 */
public class Calculadora {

    public List<Funcionario> calcularSalario(String cargo, float salario, float desconto) {
            
        ArrayList<Funcionario> funcionario = new ArrayList<>();
        
        if (cargo.equals("")) {
            if (salario >= 3000) {
                salario -= desconto;
            } else {
                salario -= desconto;
            }
        }
        if (cargo.equals("")) {
            if (salario >= 2000) {
                salario -= desconto;
            } else {
                salario -= desconto;
            }
        }
        if (cargo.equals("")) {
            if (salario >= 5000) {
                salario -= desconto;
            } else {
                salario -= desconto;
            }
        }
        return funcionario;
    }
}
