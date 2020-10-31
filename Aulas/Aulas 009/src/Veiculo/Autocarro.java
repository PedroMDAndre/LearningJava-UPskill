package Veiculo;

public class Autocarro extends Veiculo {
    // Attributes


    // Constructor
    public Autocarro(int capacidade) {
        super(capacidade);
        System.out.println("Autocarro criado.");
    }


    // Methods
    @Override
    public double getConsumo(){
        if(taxaOcupacao() > 0.5) {
            return 2 * getConsumoBase();
        } else{
            return getConsumoBase();
        }
    }
}
