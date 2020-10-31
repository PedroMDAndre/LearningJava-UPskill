package Aula007_Classes;

public class Gerente extends Empregado {
    // Attributes
    private boolean cumpriuObjectivos = false;

    // Constructors
    public Gerente(String name, Empresa empresa){
        super(name, empresa);
    }


    // Methods
    public void setCumpriuObjectivos(boolean cumpriu) {
        this.cumpriuObjectivos = cumpriu;
    }

    @Override
    public double getSalario() {
        if(cumpriuObjectivos){
            return super.getSalario() + 200;
        }
        return super.getSalario();
    }
}
