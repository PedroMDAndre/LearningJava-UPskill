package CartaoPresente;

public class Aniversario extends CartaoPresente {
    // Attributes


    // Constructors
    public Aniversario(String destinatario) {
        super(destinatario);
    }


    // Methods
    @Override
    public void showMessage() {
        System.out.println("---------------------------------------");
        System.out.println(getDestinatario() + ",");
        System.out.println("\nDesejos de um Feliz Aniversário!!! 🎁\n");
        System.out.println("Muitos beijinhos!");
        System.out.println("---------------------------------------");;
    }
}
