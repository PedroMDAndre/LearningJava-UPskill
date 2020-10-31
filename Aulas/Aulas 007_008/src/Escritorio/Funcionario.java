package Escritorio;

public abstract class Funcionario {
    // Attributes
    private String nome;
    private String codigo;
    private double salarioBase;

    // Constructors
    public Funcionario(String nome, String codigoFuncionario, double salarioBase) {
        this.nome = nome;
        this.codigo = codigoFuncionario;
        this.salarioBase = salarioBase;
    }

    // Methods
    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calculaSalario();

    @Override
    public String toString() {
        return "Cód.: " + getCodigo() + "\t  Nome: " + getNome() + "\nSalário Base: " + getSalarioBase()+ "\tSalário: " + calculaSalario();
    }
}
