package Escritorio;

public class Vendedor extends Funcionario {
    // Attributes
    private double comissao;

    // Constructors
    public Vendedor(String nome, String codigoFuncionario, double salarioBase, double comissao){
        super(nome, codigoFuncionario, salarioBase);
        this.comissao = comissao;
        System.out.println("Vendedor criado.");
    }


    // Methods
    @Override
    public double calculaSalario() {
        return getSalarioBase() + comissao;
    }

    @Override
    public String toString() {
        return "Vendedor:\n" + super.toString();
    }
}
