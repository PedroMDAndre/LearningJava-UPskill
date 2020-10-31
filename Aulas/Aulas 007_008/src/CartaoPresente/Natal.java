package CartaoPresente;

public class Natal extends CartaoPresente {
    // Attributes


    // Constructors
    public Natal(String destinatario) {
        super(destinatario);
    }


    // Methods
    @Override
    public void showMessage() {
        System.out.println("---------------------------------------");
        System.out.println(getDestinatario() + ",");
        System.out.println("\nDesejos de um bom Natal!\n");
        System.out.println("Abraços!🎅");
        System.out.println("---------------------------------------");
    }
}
