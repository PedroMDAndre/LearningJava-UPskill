package Banco;

public class ContaPoupanca extends ContaBancaria {
    private final int numero;
    private double saldo;
    private double taxaRendimento;


    // Constructors
    public ContaPoupanca(String senha, int numero, double saldo, double taxaRendimento) {
        super(senha);
        this.numero = numero;
        this.saldo = saldo;
        this.taxaRendimento = taxaRendimento;
        System.out.println("Conta Poupança criada!");
    }


    // Methods
    public void setSaldo(double saldo) {
        this.saldo = saldo;
        adicionaMovimento("\t" + saldo + "\t" + getSaldo() + "Saldo alterado para " + saldo);
    }

    public void setNrTransacoes(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
        adicionaMovimento("\t" + "\t" + getSaldo() + "Taxa rendimento alterada para " + getTaxaRendimento());

    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public void levanta(double valor) {
        if (getSaldo() < valor) {
            System.out.println("Saldo Insuficiente!");
            adicionaMovimento("\t" + -valor + "\t" + getSaldo() + "\tSaldo Insuficiente!");
        } else {
            saldo -= valor;
            adicionaMovimento("\t" + -valor + "\t" + getSaldo() + "\tLevantamento");
            System.out.println("Levantamento efectuado.");
        }
    }

    @Override
    public void deposita(double valor) {
        saldo += valor;
        adicionaMovimento("\t" + valor + "\t" + getSaldo() + "\tDepósito");
        System.out.println("Depósito efectuado.");
    }

    @Override
    public void tiraExtrato() {
        System.out.println("Conta nº: " + getNumero() + "\tTaxa Rendimento: " + getTaxaRendimento());
        System.out.println("Saldo:    " + getSaldo());
        System.out.println("\tValor\tSaldo\tDescrição");
        for (String x : getMovimentos()) {
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
