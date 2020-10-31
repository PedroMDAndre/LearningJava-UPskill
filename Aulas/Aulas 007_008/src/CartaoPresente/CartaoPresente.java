package CartaoPresente;

public abstract class CartaoPresente {
    // Attributes
    String destinatario;


    //Constructors
    public CartaoPresente(String destinatario){
        this.destinatario = destinatario;
    }


    // Methods
    public String getDestinatario() {
        return destinatario;
    }

    public abstract void showMessage();
}
