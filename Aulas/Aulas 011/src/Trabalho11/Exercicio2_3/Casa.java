package Trabalho11.Exercicio2_3;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/*
Exercício 2
Pretende-se organizar os electrodomésticos em cada divisão de uma casa segundo um
mapa cuja chave de acesso é o nome de uma divisão e o valor é uma lista dos
eletrodomésticos que estão nessa divisão.
    a. Crie as classes Casa e Eletrodoméstico - a Casa contém o mapa dos
    electrodomésticos; cada electrodoméstico tem como atributos o seu tipo, a
    marca e a potência elétrica que consome.

    b. Crie, na classe Casa, um método para inserir electrodomésticos no mapa,
    assim como o método toString(), a fim de se conseguir visualizar todos os
    electrodomésticos, organizados segundo as divisões onde estão ligados.

    c. Faça um programa teste onde se criem alguns electrodomésticos e insira-os no
    mapa (use divisões diferentes). No final visualize os resultados.

Exercício 3
Acrescente na classe Casa do exercício anterior um método que permita remover de
uma divisão todos os eletrodomésticos que sejam de uma mesma marca (e.g., "Bosch").

De forma a evitar problemas relacionados com a remoção de elementos ao mesmo
tempo que itera sobre uma colecção de dados, experimente três abordagens
diferentes:
    a. Colocar numa lista todos os electrodomésticos da marca a remover e usar o
    método removeAll() após terminar a procura;

    b. Usar um iterador (classe Iterator) para ir removendo cada electrodoméstico
    ao mesmo tempo que se itera sobre a lista;

    c. Criar um filtro que implemente a interface Predicate e usar o método
    removeIf() para remover todos os electrodomésticos da marca a remover
    (só no Java 8).
 */

public class Casa {
    public static void main(String[] args) {
        // Cria uma casa
        System.out.println("Casa criada.");
        Casa casa = new Casa();

        // Cria eletrodomésticos
        System.out.println("Eletrodomésticos criados.");
        Eletrodomestico leitorDvd = new Eletrodomestico("Leitor DVD", "Sony", 200);
        Eletrodomestico ps4 = new Eletrodomestico("PS4", "Sony", 75);
        Eletrodomestico televisao = new Eletrodomestico("Televisão", "Samsung", 500);
        Eletrodomestico frigorifico = new Eletrodomestico("Frigorifico", "LG", 300);

        // Adiciona eletrodomesticos à casa
        System.out.println("Eletrodomésticos adicionados à casa.");
        casa.addEletrodomestico("sala", leitorDvd);
        casa.addEletrodomestico("sala", ps4);
        casa.addEletrodomestico("sala", televisao);
        casa.addEletrodomestico("cozinha", frigorifico);
        //etc
        System.out.println(casa);

        // Remoção de todos os eletrodomésticos da marca Sony da sala
        System.out.println();
        System.out.println("Remoção de todos os eletrodomésticos da marca Sony da sala");
        casa.removeEletrodomestico_c2("sala", "Sony");
        System.out.println(casa);
    }

    // Attributes
    HashMap<String, ArrayList<Eletrodomestico>> divisoes;


    // Constructors
    public Casa() {
        this.divisoes = new HashMap<>();
    }

    // Methods
    public void addEletrodomestico(String divisao, Eletrodomestico eletro) {
        if (!divisoes.containsKey(divisao)) {   // Verifica se a divisão não existe no HashMap
            divisoes.put(divisao, new ArrayList<>()); // Cria a divisão
        }
        divisoes.get(divisao).add(eletro);
    }

    public void removeEletrodomestico_a(String divisao, String marca) {
        ArrayList<Eletrodomestico> eletroMarca = new ArrayList<>(); // Lista para guardar todos os eletrodomésticos de uma marca

        for (Eletrodomestico eletro : this.divisoes.get(divisao)) {
            if (eletro.getMarca().equals(marca)) {
                eletroMarca.add(eletro);
            }
        }
        this.divisoes.get(divisao).removeAll(eletroMarca);
    }

    public void removeEletrodomestico_b(String divisao, String marca) {
        Iterator<Eletrodomestico> iterator = this.divisoes.get(divisao).iterator(); // Criação de um iterador sobre os eletrodomesticos da divisao

        Eletrodomestico eletro;

        while (iterator.hasNext()) {
            eletro = iterator.next();
            if (eletro.getMarca().equals(marca)) {
                iterator.remove();
            }
        }
    }

    public void removeEletrodomestico_c1(String divisao) {      // Só remove electrodoméstico se for Sony
        IsSony<Eletrodomestico> isSony = new IsSony<>();
        ArrayList<Eletrodomestico> resultado = new ArrayList<>();
        for (Eletrodomestico eletro : this.divisoes.get(divisao)) {
            if (isSony.test(eletro)) {
                resultado.add(eletro);
            }
        }
        this.divisoes.get(divisao).removeAll(resultado);
    }

    public void removeEletrodomestico_c2(String divisao, String marca) {
        List<Eletrodomestico> eletro = this.divisoes.get(divisao);
        List<Eletrodomestico> resultado = new ArrayList<>();
        resultado = eletro.stream()
                .filter(isMarca(marca))
                .collect(Collectors.<Eletrodomestico>toList());
        this.divisoes.get(divisao).removeAll(resultado);

    }

    public static Predicate<Eletrodomestico> isMarca(String marca) {
        return p -> p.getMarca().equals(marca);
    }

    @Override
    public String toString() {
        String resultado = "";
        for (String divisao : this.divisoes.keySet()) {
            resultado += divisao + ":\n";
            for (Eletrodomestico eletro : this.divisoes.get(divisao)) {
                resultado += "\t" + eletro + "\n";
            }

        }
        return resultado;
    }

}
