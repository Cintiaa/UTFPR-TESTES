package questao2;

/**
 *
 * @author CINTIA
 */
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String pNome, int pIdade) {
        nome = pNome;
        idade = pIdade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
