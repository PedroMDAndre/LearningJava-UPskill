package Veiculo;

public class F16 extends Veiculo {
    // Attributes
    boolean missao; // Está em missão de resgate?


    // Constructor
    public F16(int capacidade) {
        super(capacidade);
    }


    // Methods
    @Override
    public double getConsumo() {
        if (missao) {                       // Está em missão de resgate
            return 4 * getConsumoBase();
        } else {
            return 3 * getConsumoBase();    // Não está em missão de resgate
        }
    }

    public void setMissao(boolean missao) {
        this.missao = missao;
        System.out.println("F16 criado.");
    }

    @Override
    public void adiciona(Pessoa novoPassageiro) {
        if (getCapacidade() == countPassageiros()) {
            System.out.println("O veículo encontra-se cheio. Não é possível entrar mais passageiros.");

        } else if(isPassageiro(novoPassageiro)) {
            System.out.println("Passageiro já se encontra na lista");

        } else if (countPassageiros() == 0 && novoPassageiro.isForcaAerea()) {
            Pessoa[] resultado = new Pessoa[1];
            resultado[0] = novoPassageiro;
            setPassageiros(resultado);
            System.out.println("Novo Passageiro.");

        } else if (countPassageiros() == 0 && !novoPassageiro.isForcaAerea()) {
            System.out.println("Não foi possível adicionar passageiro. Não pertence à Força Aérea.");

        } else {
            Pessoa[] resultado = new Pessoa[countPassageiros() + 1];
            System.out.println("Novo Passageiro.!!!!!!!");
            resultado[countPassageiros()] = novoPassageiro; // adiciona novo passageiro na última posição
            for (int i = 0; i < countPassageiros(); i++) {
                resultado[i] = getPassageiros()[i];
            }
            setPassageiros(resultado);
        }
    }

    @Override
    public void remove(Pessoa passageiroSai) {
        // verificar se passageiro está presente
        boolean presente = false;
        int i; // posição do passageiro a remover
        for (i = 0; i < getPassageiros().length; i++) {
            if (passageiroSai.equals(getPassageiros()[i])) {
                presente = true;
                break;
            }
        }

        // Se estiver, remover o passageiro
        int z = 0; // percorre a lista resultado
        if (presente) {
            Pessoa[] resultado = new Pessoa[getPassageiros().length - 1];
            for (int j = 0; j < getPassageiros().length; j++) {
                if (j == i) {  // passageiro a remover

                } else {
                    resultado[z] = getPassageiros()[j];
                    z++;
                }
            }
            System.out.println("Passageiro removido.");
            setPassageiros(resultado);
        } else {
            System.out.println("Passageiro não está presente. Não foi removido");
        }
    }
}
