package Veiculo;

public class Aviao extends Veiculo{
    // Attributes


    // Constructor
    public Aviao(int capacidade){
        super(capacidade);
        System.out.println("Avião criado.");
    }


    // Methods
    @Override
    public double getConsumo(){
        return 3 * getConsumoBase();
    }
}
