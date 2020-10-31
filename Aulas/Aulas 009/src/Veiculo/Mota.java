package Veiculo;

public class Mota extends Veiculo{
    // Attributes


    // Constructor
    public Mota(int capacidade){
        super(capacidade);
        System.out.println("Mota criada.");
    }


    // Methods
    @Override
    public double getConsumo(){
        return getConsumoBase();
    }
}
