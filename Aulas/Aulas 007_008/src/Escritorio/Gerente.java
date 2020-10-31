package Escritorio;

public class Gerente extends Funcionario {
    // Attributes

    // Constructors
    public Gerente(String nome, String codigoFuncionario, double salarioBase){
        super(nome, codigoFuncionario, salarioBase);
        System.out.println("Gerente criado.");
    }

    // Methods
    @Override
    public double calculaSalario() {
        return 2 * getSalarioBase();
    }

    @Override
    public String toString() {
        return "Gerente:\n" + super.toString();
    }
}
