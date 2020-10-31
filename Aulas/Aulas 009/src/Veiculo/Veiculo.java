package Veiculo;

public abstract class Veiculo {
    // Attributes
    private int capacidade;   // número de lugares
    private Pessoa[] passageiros; // passageiros
    private final double consumoBase = 5; // 5 litros/km


    // Constructors
    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
        this.passageiros = new Pessoa[0];
    }


    // Methods
    // Get Methods
    public int getCapacidade() {
        return capacidade;
    }

    public Pessoa[] getPassageiros() {
        return passageiros;
    }

    public double getConsumoBase() {
        return consumoBase;
    }

    public abstract double getConsumo();

    //Set Methods


    protected void setPassageiros(Pessoa[] passageiros) {
        this.passageiros = passageiros;
    }

    // Taxa de Ocupação
    public int countPassageiros() {
        int count = 0;
        for (Pessoa x : passageiros) {
            if (x != null) {
                count++;
            }
        }
        return count;
    }

    public double taxaOcupacao() {
        return ((double) countPassageiros()) / getCapacidade();  // Cast de um dos argumentos da divisão para double
        // para obter resultado em double
    }


    // Adicionar e remover passageiros
    public void adiciona(Pessoa novoPassageiro) {
        if (getCapacidade() == countPassageiros()) {
            System.out.println("O veículo encontra-se cheio. Não é possível entrar mais passageiros.");

        } else if (isPassageiro(novoPassageiro)) {
            System.out.println("Passageiro já se encontra na lista");

        } else if (countPassageiros() == 0 && novoPassageiro.hasCarta()) {
            passageiros = new Pessoa[1];
            passageiros[0] = novoPassageiro;
            System.out.println("Novo Passageiro.");

        } else if (passageiros.length == 0 && !novoPassageiro.hasCarta()) {
            System.out.println("O primeiro passageiro a entrar tem de ter carta.");

        } else {
            Pessoa[] resultado = new Pessoa[passageiros.length + 1];
            System.out.println("Novo Passageiro.!!!!!!!");
            resultado[passageiros.length] = novoPassageiro; // adiciona novo passageiro na última posição
            for (int i = 0; i < passageiros.length; i++) {
                resultado[i] = passageiros[i];
            }
            passageiros = resultado;
        }
    }

    public void remove(Pessoa passageiroSai) {
        if (Pessoa.nrPessoasCarta(passageiros) == 1 && passageiroSai.hasCarta() && passageiros.length > 1) {
            System.out.println("A última pessoa a sair tem de ser um condutor");
        } else {


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

    @Override
    public String toString() {
        return "Consumo:    " + getConsumo() + "\nCapacidade: " + getCapacidade() + "\tNº passageiros: "
                + countPassageiros() + "\tTaxa ocupação: " + taxaOcupacao();
    }

    public boolean isPassageiro(Pessoa pessoa) {
        for (Pessoa x : passageiros) {
            if (x.equals(pessoa)) {
                return true;
            }
        }
        return false;
    }
}
