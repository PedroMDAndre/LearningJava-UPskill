package Exercício1;

public class Pessoa {
    // Attributes
    private String nome;
    private int idade;
    private String localidade;

    // Constructor
    public Pessoa(String pessoaString) {
        // pessoaString: linha lida do ficheiro, formato [nome]:[idade]:[localidade]
        String[] separado = pessoaString.split(":");
        try {
            this.nome = separado[0];
            try {
                this.idade = Integer.parseInt(separado[1]);
            } catch (NumberFormatException e) {
                System.out.println("Não foi possível ler a idade!");
            }

            this.localidade = separado[2];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Não foi possível ler esta pessoa!");
        }
    }

    // Methods
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return nome + " vive em " + localidade + " e tem " + idade + " anos";
    }
}
