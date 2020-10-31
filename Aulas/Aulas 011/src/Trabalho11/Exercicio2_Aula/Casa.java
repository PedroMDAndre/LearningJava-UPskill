package Trabalho11.Exercicio2_Aula;

import java.util.ArrayList;
import java.util.HashMap;

public class Casa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        Electrodomestico leitorDvd = new Electrodomestico("Leitor DVD", "Sony", 200);
        Electrodomestico televisao = new Electrodomestico("Televisão", "Samsung", 500);

        Electrodomestico frigorifico = new Electrodomestico("Frigorifico", "LG", 300);

        casa.addElectrodomestico("sala", leitorDvd);
        casa.addElectrodomestico("sala", televisao);

        casa.addElectrodomestico("cozinha", frigorifico);
        //etc

        System.out.println(casa);
    }

    // Attributes
    private HashMap<String, ArrayList<Electrodomestico>> divisoes = new HashMap<>();


    // Constructor
    public Casa() {

    }


    // Methods
    public void addElectrodomestico(String divisao, Electrodomestico electro) {
        ArrayList<Electrodomestico> listaElectro = divisoes.get(divisao);

        if (listaElectro == null) {
            divisoes.put(divisao, new ArrayList<>());
        }
        divisoes.get(divisao).add(electro);
    }

    public void removeElectrodomestico(String divisao, Electrodomestico electro) {
        if (divisoes.get(divisao) != null) {
            divisoes.get(divisao).remove(electro);
        }
    }

    @Override
    public String toString() {
        String ret = "";
        for (String divisao : divisoes.keySet()) {
            ret += divisao + ":\n";
            for (Electrodomestico electro : divisoes.get(divisao)) {
                ret += "\t" + electro + "\n";
            }
        }
        return ret;
    }
}
