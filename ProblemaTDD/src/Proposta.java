

/**
 *
 * @author CINTIA
 */
class Proposta {
    private float total;
    private int numeroParcelas;
    private float valorParcela;

    
    Proposta(float ptotal, int pnumeroParcelas){
        this.total = ptotal;
        this.numeroParcelas = pnumeroParcelas;
    }
    
    Proposta(){
        
    }
    
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public float getValorParcela() {
        return total/numeroParcelas;
    }
}
