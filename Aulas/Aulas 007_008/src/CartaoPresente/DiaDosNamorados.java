package CartaoPresente;

public class DiaDosNamorados extends CartaoPresente {
    // Attributes


    // Constructors
    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }


    // Methods
    @Override
    public void showMessage() {
        System.out.println("---------------------------------------");
        System.out.println(getDestinatario() + ",");
        System.out.println("\nDesejos de um bom dia dos Namorados!!!\n");
        System.out.println("Muitos beijinhos!💖");
        System.out.println("---------------------------------------");
    }
}
