package Aula007_Classes;

public class Director extends Empregado {
    // Attributes


    // Constructors
    public Director(String nome, Empresa empresa){
        super(nome, empresa);
    }

    // Methods
    @Override
    public double getSalario() {
        return (super.getSalario() * 2 + (getEmpresa().getLucro() * 0.01));
    }
}
