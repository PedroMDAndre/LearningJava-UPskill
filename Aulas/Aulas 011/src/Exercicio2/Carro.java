package Exercicio2;
/*
Exercício 2
* Crie um tipo de objecto Carro que guarda as seguintes informações:
    - Matrícula
    - Marca
    - Ano de Venda

* Crie uma classe de teste e na função main() crie um mapa (HashMap) de Carros, onde a chave é a
matricula de carros. Exprimente a inserção, remoção e obtenção de um carro.
*/

import java.util.HashMap;

public class Carro {
    public static void main(String[] args) {
        HashMap<String, Carro> carros = new HashMap<>();

        // Criar carros
        Carro peugeot = new Carro("23-JK-12", "Peugeot 206", 2001);
        Carro volvo = new Carro("19-33-UU", "Volvo S60", 1996);
        Carro ferrari = new Carro("AD-33-PO", "Ferrari F8", 2020);
        Carro carro1 = new Carro("20-XS-94", "Audi", 2020);
        Carro carro2 = new Carro("AA-01-12", "BMW", 2018);
        Carro carro3 = new Carro("81-73-RT", "Seat", 2017);

        // Adicionar carros ao mapa
        carros.put(peugeot.getMatricula(), peugeot);
        carros.put("19-33-UU", volvo);
        carros.put(ferrari.getMatricula(), ferrari);
        carros.put(carro1.getMatricula(), carro1);
        carros.put(carro2.getMatricula(), carro2);
        carros.put(carro3.getMatricula(), carro3);
        System.out.println(carros);

        Carro honda = new Carro("23-JK-12", "Honda Civic", 2005);
        carros.put(honda.getMatricula(), honda); // Como tem a mesma matrícula do Peugeot, substituí o Peugeot

        System.out.println(carros.get("23-JK-12"));


        //Pesquisar matrícula
        System.out.println("\nPesquisar matrícula: 20-XS-94");
        System.out.println(carros.get("20-XS-94"));
        System.out.println("\nRemover carro matrícula: 20-XS-94");
        carros.remove("20-XS-94");
        System.out.println(carros);

        // Lista de carros
        System.out.println("\nLista de carros:");
        for (Carro carro : carros.values()) {
            System.out.println(carro);
        }
    }


    // Attributes
    private String matricula;
    private String marca;
    private int anoVenda;


    // Constructors
    public Carro(String matricula, String marca, int anoVenda) {
        this.matricula = matricula;
        this.marca = marca;
        this.anoVenda = anoVenda;
    }


    // Methods
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoVenda() {
        return anoVenda;
    }

    public void setAnoVenda(int anoVenda) {
        this.anoVenda = anoVenda;
    }

    @Override
    public String toString() {
        return String.format("> matricula: %s " + ", marca: %-12s" + ", Ano Venda: %d", matricula, marca, anoVenda);
    }
}
