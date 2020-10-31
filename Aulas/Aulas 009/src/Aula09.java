import Veiculo.*;

import java.sql.SQLOutput;
/*Considere as seguintes classes: Automóvel, Mota, Barco, Ferry, Avião, F16, Autocarro.
  Organize as classes utilizando os conhecimentos de herança e polimorfismo de acordo com as caraterísticas de cada:
    * Todos os veículos possuem uma lotação de lugares, representada por um vetor
      A lotação é diferente dependendo do tipo de veículo

    * Os veículos possuem um consumo de combustível de base 5L/km sendo que:
        - Os veículos náuticos consomem 2x mais.
        - Os veículos aéreos consomem 3x mais.
        - Em caso de missão de resgate, o F16 consome 4x mais.
        - O autocarro consome 2x mais caso a sua lotação seja superior a 50%.

    * Deve ser possível saber o consumo de um veículo.

    * Implemente a classe Pessoa.

    * Implemente os métodos que permitem adicionar, remover e listar os passageiros de um veículo.
        - Só é permitido adicionar Pessoas ao F16 caso estas pertençam à Força Aérea.
        - A primeira pessoa a entrar e a sair de um veículo deve ser sempre alguém
          com carta de condução (exceto nos F16).*/


public class Aula09 {
    public static void main(String[] args) {
        // Criar Pessoas
        System.out.println("Criar Pessoas");
        System.out.println("-----------------------");
        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa("Pedro");
        Pessoa pessoa3 = new Pessoa("Maria");
        Pessoa pessoa4 = new Pessoa("Luisa");
        Pessoa pessoa5 = new Pessoa("Kate");
        Pessoa pessoa6 = new Pessoa("Jorge");
        Pessoa pessoa7 = new Pessoa("Charles");
        Pessoa pessoa8 = new Pessoa("Albert");
        Pessoa pessoa9 = new Pessoa("Cristy");

        // Atribuir Cartas
        System.out.println("\nAtribuir Cartas");
        System.out.println("-----------------------");
        pessoa1.setCarta(true);
        pessoa2.setCarta(true);
        System.out.println(pessoa1);
        System.out.println(pessoa2);

        // Registar na Força Aérea
        System.out.println("\nRegistar na Força Aérea");
        System.out.println("-----------------------");
        pessoa3.setForcaAerea(true);
        pessoa4.setForcaAerea(true);
        pessoa5.setForcaAerea(true);
        System.out.println(pessoa3);
        System.out.println(pessoa4);
        System.out.println(pessoa5);

        // Criar Veículos
        System.out.println("\nCriar Veículos");
        System.out.println("-----------------------");
        Autocarro autocarro = new Autocarro(10);
        Automovel automovel = new Automovel(5);
        Aviao aviao = new Aviao(3);
        F16 f16 = new F16(2);
        Ferry ferry = new Ferry(10);
        Mota mota = new Mota(2);

        // Descrição dos Veículos
        System.out.println("\nDescrição dos Veículos");
        System.out.println("-----------------------");

        System.out.println("Autocarro:\n" + autocarro);
        System.out.println("Passageiros:\n");
        Pessoa.printListaPessoas(autocarro.getPassageiros());

        System.out.println("\nAutomóvel:\n" + automovel);
        System.out.println("Passageiros:\n");
        Pessoa.printListaPessoas(automovel.getPassageiros());

        System.out.println("\nAvião:\n" + autocarro);
        System.out.println("Passageiros:\n");
        Pessoa.printListaPessoas(aviao.getPassageiros());

        System.out.println("\nF16:\n" + autocarro);
        System.out.println("Passageiros:\n");
        Pessoa.printListaPessoas(f16.getPassageiros());

        System.out.println("\nFerry:\n" + autocarro);
        System.out.println("Passageiros:\n");
        Pessoa.printListaPessoas(ferry.getPassageiros());

        System.out.println("\nMota:\n" + autocarro);
        System.out.println("Passageiros:\n");
        Pessoa.printListaPessoas(mota.getPassageiros());

        // Introduzir Passageiros
        // Autocarro
        // Automóvel

        // F16
        System.out.println("\nF16");
        System.out.println("-----------------------");
        f16.adiciona(pessoa1);
        f16.adiciona(pessoa3);
        f16.adiciona(pessoa3);
        f16.adiciona(pessoa4);
        f16.adiciona(pessoa5);
        f16.setMissao(true);
        System.out.println("Em missão");
        System.out.println("F16:\n" + f16);
        Pessoa.printListaPessoas(f16.getPassageiros());
        f16.remove(pessoa1);
        f16.remove(pessoa3);
        f16.remove(pessoa3);
        f16.remove(pessoa4);
        f16.remove(pessoa5);
        Pessoa.printListaPessoas(f16.getPassageiros());

        // Avião
        // Ferry

        // Mota
        System.out.println("\nMota");
        mota.adiciona(pessoa3);
        mota.adiciona(pessoa1);
        mota.adiciona(pessoa1);
        mota.adiciona(pessoa2);
        mota.adiciona(pessoa3);
        Pessoa.printListaPessoas(mota.getPassageiros());
        mota.remove(pessoa3);
        mota.remove(pessoa2);
        mota.adiciona(pessoa7);
        mota.remove(pessoa1);

        Pessoa.printListaPessoas(mota.getPassageiros());

        // Autocarro
        System.out.println("\nAutocarro");
        System.out.println(autocarro);
        autocarro.adiciona(pessoa1);
        autocarro.adiciona(pessoa2);
        autocarro.adiciona(pessoa3);
        autocarro.adiciona(pessoa4);
        autocarro.adiciona(pessoa5);
        autocarro.adiciona(pessoa6);
        autocarro.adiciona(pessoa7);
        System.out.println(autocarro);
    }
}

