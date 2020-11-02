package Exercício3;

public class Movimento {
    // Attributes
    private int id;
    private String descricao;
    private double valor;


    // Constructor
    public Movimento(int id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }


    // Methods
    @Override
    public String toString() {
        return id + ";" + descricao + ";" + valor;
    }
}
