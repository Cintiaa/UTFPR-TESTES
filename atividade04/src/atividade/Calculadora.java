package atividade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CINTIA
 */
public class Calculadora {

    public float calcularDesconto(Funcionario f) {//Melhorando o código
        if (f.getCargo().equals("Desenvolvedor")) {
            if (f.getSalarioBase() >= 3000f) {
                return f.getSalarioBase() - (f.getSalarioBase() * 0.20f);
            }
            return f.getSalarioBase() - (f.getSalarioBase() * 0.10f);
        } else if (f.getCargo().equals("Testador") || f.getCargo().equals("DBA")) {
            if (f.getSalarioBase() >= 2000f) {
                return f.getSalarioBase() - (f.getSalarioBase() * 0.25f);
            }
            return f.getSalarioBase() - (f.getSalarioBase() * 0.15f);
        } else if (f.getCargo().equals("Gerente")) {
            if (f.getSalarioBase() >= 5000f) {
                return f.getSalarioBase() - (f.getSalarioBase() * 0.30f);
            }
            return f.getSalarioBase() - (f.getSalarioBase() * 0.20f);
        }
        return -1;
    }

}
