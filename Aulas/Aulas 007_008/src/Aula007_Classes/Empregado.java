package Aula007_Classes;

public class Empregado {
    // Attributes
    private String nome;
    private double salario = 800;
    private Empresa empresa;


    // Constructors
    public Empregado(final String nome, Empresa empresa) {
        this.nome = nome;
        this.empresa = empresa;
        empresa.addEmpregado(this);
    }


    // Methods
    public String getName() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Empregado{ " +
                "nome= " + getName() +
                ", salário= " + getSalario() +
                "€ }";
    }
}
