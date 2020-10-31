package Trabalho006_Classes;

public class CreditCard {
    // Attributes
    private Person person;
    private long number;
    private int expMonth;
    private int expYear;
    private int limitWithdrawal;
    private int totalSpent;
    private String[] historic;


    // Constructors
    public CreditCard(Person person, long number, int expMonth, int expYear, int limitWithdrawal) {
        this.person = person;
        this.number = number;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.limitWithdrawal = limitWithdrawal;
        this.totalSpent = 0;
        this.historic = new String[0];

    }


    // Methods
    public int saldo() {
        return limitWithdrawal - totalSpent;
    }

    public void pagarCredito(int pagamento) {
        String movimento = "+" + pagamento + "\t| Credit payment";
        addMovimento(movimento);
        totalSpent -= pagamento;
    }

    public void gastar(int quantia, String descr) {
        // need to check if there is sufficient limit...
        if (saldo() < quantia) {
            System.out.println("You don't have enough credit balance. Remaining credit is: " + saldo());
        } else {
            this.addMovimento(-quantia + "\t| " + descr);
            totalSpent += quantia;
        }
    }

    public String obterTalao() {
        if (historic.length == 0) {
            return "";
        } else {
            return historic[0];
        }
    }

    public String getMovimentos() {
        String movimentos = "Operations:";
        for (int i = 0; i < historic.length; i++) {
            movimentos += "\n" + historic[i];
        }
        movimentos += "\nRemaining Credit: " + saldo();
        return movimentos;
    }


    public void addMovimento(String movimento) {
        String[] tempHistoric = new String[historic.length + 1];
        tempHistoric[0] = movimento;
        for (int i = 1; i < tempHistoric.length; i++) {
            tempHistoric[i] = historic[i - 1];
        }
        historic = tempHistoric;
    }

    @Override
    public String toString() {
        int authCredit = limitWithdrawal;
        if (saldo() > limitWithdrawal) {
            authCredit = saldo();
        }
        String description = "Credit card nr.: " + (long) number + " | Expiration date: " + expMonth + "/" + expYear +
                "\nAuthorized credit: " + authCredit + "\nOwner: " + person.toString();
        return description;
    }

}
