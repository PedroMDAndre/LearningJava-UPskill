package Banco;

public class ContaCorrente extends ContaBancaria {
    // Attributes
    private final int numero;
    private double saldo;
    private int nrTransacoes;


    // Constructor
    public ContaCorrente(String senha, int numero, double saldo) {
        super(senha);
        this.numero = numero;
        this.saldo = saldo;
        this.nrTransacoes = 0;
        System.out.println("Conta Corrente criada!");
    }


    // Methods
    public void setSaldo(double saldo) {
        this.saldo = saldo;
        adicionaMovimento("\t" + saldo + "\t" + getSaldo() + "Saldo alterado para " + saldo);
    }

    public void setNrTransacoes(int nrTransacoes) {
        this.nrTransacoes = nrTransacoes;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNrTransacoes() {
        return nrTransacoes;
    }

    @Override
    public void levanta(double valor) {
        if (getSaldo() < valor) {
            System.out.println("Saldo Insuficiente!");
            adicionaMovimento(" \t" + -valor + "\t" + getSaldo() + "\tSaldo Insuficiente!");
        } else {
            saldo -= valor;
            nrTransacoes += 1;
            adicionaMovimento(nrTransacoes + "\t" + -valor + "\t" + getSaldo() + "\tLevantamento");
            System.out.println("Levantamento efectuado.");
        }
    }

    @Override
    public void deposita(double valor) {
        saldo += valor;
        nrTransacoes += 1;
        adicionaMovimento(nrTransacoes + "\t+" + valor + "\t" + getSaldo() + "\tDepósito");
        System.out.println("Depósito efectuado.");
    }

    @Override
    public void tiraExtrato() {
        System.out.println("Conta nº: " + getNumero());
        System.out.println("Saldo:    " + getSaldo());
        System.out.println("Nº\tValor\tSaldo\tDescrição");
        String movimentos[] = getMovimentos();
        for (String x : movimentos) {
            System.out.println(x);
        }
    }

    @Override
    public void adicionaMovimento(String movimento) {
        String resultado[] = new String[getMovimentos().length + 1];
        resultado[0] = movimento;

        for (int i = 1; i < resultado.length; i++) {
            resultado[i] = getMovimentos()[i - 1];
        }
        setMovimentos(resultado);
    }
}
