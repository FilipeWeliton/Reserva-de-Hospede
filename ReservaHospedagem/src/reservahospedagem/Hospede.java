package reservahospedagem;

/**
 *
 * @author Filipe
 */
public class Hospede {
    private int codigo;
    private String nome;
    private String endereco;
    private int idade;

    public Hospede(int codigo, String nome, String endereco, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }
    
    public Hospede(){
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Hospede{" + "codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + '}';
    }
    
    
    
    
}
