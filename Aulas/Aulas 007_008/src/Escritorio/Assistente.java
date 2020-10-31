package Escritorio;

public class Assistente extends Funcionario {
    // Attributes

    // Constructors
    public Assistente(String nome, String codigoFuncionario, double salarioBase){
        super(nome, codigoFuncionario, salarioBase);
        System.out.println("Assistente criado.");
    }

    // Methods
    @Override
    public double calculaSalario() {
        return getSalarioBase();
    }

    @Override
    public String toString() {
        return "Assistente:\n" + super.toString();
    }
}
