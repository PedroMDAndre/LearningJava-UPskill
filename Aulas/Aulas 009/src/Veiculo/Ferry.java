package Veiculo;

public class Ferry extends Veiculo{
    // Attributes


    // Constructor
    public Ferry(int capacidade){
        super(capacidade);
        System.out.println("Ferry criado.");
    }


    // Methods
    @Override
    public double getConsumo(){
        return 2 * getConsumoBase();
    }
}
