package atividade;

/**
 *
 * @author CINTIA
 */
public class Funcionario {
   private String nome;
    private String email;
    private float salarioBase;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


   public float getSalarioBase() {
        return salarioBase;// - (salarioBase * 0.20f);//Commit com o problema resolvido
   }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
