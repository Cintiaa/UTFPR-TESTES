package atividade06;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CINTIA
 */
public class Utilitario {

    public void OrdernaVetor(double[] v) {

        Arrays.sort(v);
    }

    public void VerificaVetor(double[] v) throws Exception {

        if (v == null) {
            throw new Exception("vetor nao pode ser nulo");
        }

        if (v.length == 0) {
            throw new Exception("vetor com zero elementos");
        }
    }

    public double Mediana(double[] v) throws Exception {
        this.VerificaVetor(v);
        this.OrdernaVetor(v);
        
        int tipo = v.length % 2;
        if (tipo == 1) {
            return v[((v.length + 1) / 2) - 1];
        } else {
            int i = v.length / 2;
            return (v[i - 1] + v[i] / 2);
        }
    }

    public Estatistica CalculaEstatistica(double[] v) throws Exception {
        this.VerificaVetor(v);
        double media = 0;
        double menor = v[0];
        double maior = v[0];
        int contMaior = 0;
        int contMenor = 0;

        for (int i = 0; i < v.length; i++) {
            media += v[i];
            if (v[i] < menor) {
                menor = v[i];
            }
            if (v[i] > maior) {
                maior = v[i];
            }
        }
        media = media / v.length;

        for (int i = 0; i < v.length; i++) {
            if (v[i] < media) {
                contMenor += 1;
            }
            if (v[i] > media) {
                contMaior += 1;
            }
        }
        return new Estatistica(media, menor, maior, contMenor, contMaior);
    }

    public double DesvioPadrao(double[] v) throws Exception {
        this.VerificaVetor(v);
        
        double somatorio = 0;
        double aux = 0;
        double media = 0;
        for (int i = 0; i < v.length; i++) {
            media += v[i];
        }
        media /= v.length;
        for (int i = 0; i < v.length; i++) {
            aux = v[i] - media;
            somatorio = somatorio + (aux * aux);
        }
        return Math.sqrt(((double) 1 / (v.length - 1) * somatorio));
    }

    public Estatistica VerificaNumeroVetor(double[] v, int t) throws Exception {
        this.VerificaVetor(v);
        this.OrdernaVetor(v);
        double[] vMenor;
        double[] vMaior;
        vMenor = null;
        vMaior = null;
        for (int i = 0; i < t; i++) {
            vMenor[i] = v[i];
        }
        double aux = 0;
        int k;
        for (k = 0; k < v.length; k++) {
            if (v[k] > v[k + 1]) {
                aux = v[0];
                v[k] = v[k + 1];
                v[k + 1] = aux;
                k = 0;
            } 
        }
        for (int i = 0; i < t; i++) {
            vMaior[i] = v[i];
        }
        
        
        return new Estatistica(vMenor, vMaior);
    }

}
