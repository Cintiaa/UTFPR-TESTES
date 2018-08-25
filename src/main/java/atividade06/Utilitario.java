package atividade06;

import java.util.Arrays;

/**
 *
 * @author CINTIA
 */
public class Utilitario {

    public void OrdernaVetor(double[] v) {
        Arrays.sort(v);
    }

    public double VerificaEstatistica(double[] v) {

        this.OrdernaVetor(v);
        int tipo = v.length % 2;
        if (tipo == 1) {
            return v[((v.length + 1) / 2) - 1];
        } else {
            int i = v.length / 2;
            return (v[i - 1] + v[i] / 2);
        }

    }
    
     

}
