package Veiculo;

public class Automovel extends Veiculo {
    // Attributes


    // Constructor
    public Automovel(int capacidade){
        super(capacidade);
        System.out.println("Automóvel criado.");
    }


    // Methods
    @Override
    public double getConsumo(){
        return getConsumoBase();
    }
}
