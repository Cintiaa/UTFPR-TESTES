package atividade06;

/**
 *
 * @author CINTIA
 */
public class Estatistica {
    private double mediana;
    private double media;
    private double menor;
    private double maior;
    private int contMenor;
    private int contMaior;
    private double desvioPadrao;
    private double[] vMaior;
    private double[] vMenor;
    
    
    
    public Estatistica(double tMedia, double tMenor, double tMaior, int tCMenor, int tCMaior){
        this.media = tMedia;
        this.menor = tMenor;
        this.maior = tMaior;
        this.contMenor = tCMenor;
        this.contMaior = tCMaior;
        
    }

    public Estatistica(double[] vM, double[] vN){
        this.vMenor = vM;
        this.vMaior = vN;
        
    }
    
    public double getMediana() {
        return mediana;
    }

    public void setMediana(double mediana) {
        this.mediana = mediana;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMenor() {
        return menor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }

    public double getMaior() {
        return maior;
    }

    public void setMaior(double maior) {
        this.maior = maior;
    }

    public int getContMaior() {
        return contMaior;
    }

    public void setContMaior(int contMaior) {
        this.contMaior = contMaior;
    }

    public int getContMenor() {
        return contMenor;
    }

    public void setContMenor(int contMenor) {
        this.contMenor = contMenor;
    }

    public double getDesvioPadrao() {
        return desvioPadrao;
    }

    public void setDesvioPadrao(double desvioPadrao) {
        this.desvioPadrao = desvioPadrao;
    }

    public double[] getvMaior() {
        return vMaior;
    }

    public void setvMaior(double[] vMaior) {
        this.vMaior = vMaior;
    }

    public double[] getvMenor() {
        return vMenor;
    }

    public void setvMenor(double[] vMenor) {
        this.vMenor = vMenor;
    }

   
    
}