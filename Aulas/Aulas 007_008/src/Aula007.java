import Aula007_Classes.*;

public class Aula007 {
    public static void main(String[] args) {
        exercise1();
        exercise2();

    }


    public static void exercise1() {
        // Criar empresa
        Empresa empresa = new Empresa("XPTO");
        empresa.setLucro(30000);
        System.out.println("Empresa " + empresa.getNome() + " criada!");

        // Recrutar empregados
        Empregado empregadoJose = new Empregado("José", empresa);
        Empregado empregadaMaria = new Empregado("Maria", empresa);

        Gerente gerenteManuel = new Gerente("Manuel", empresa);
        Gerente gerenteAna = new Gerente("Ana", empresa);

        Director directorRaquel = new Director("Raquel", empresa);

        System.out.println("Empregados recrutados:\n" + empregadoJose + "\n" + empregadaMaria +
                           "\n" + gerenteManuel + "\n" + gerenteAna + "\n" + directorRaquel);
        System.out.println("\nGerentes:\n" + gerenteManuel + "\n" + gerenteAna);

        gerenteAna.setCumpriuObjectivos(true);
        System.out.println("\nGerente " + gerenteAna.getName() + " cumpriu os objectivos!");


        // Lucro da empresa
        System.out.println("\nLucro da empresa:\n" + empresa.getLucro());

        // Despesa total com salário
        System.out.println("\nDespesa total com salário:");
        System.out.println(empresa.getSalarioTotal());
        System.out.println("\nDespesa com os salários dos gerentes:");
        System.out.println(empresa.getSalarioGerentes());


    }

    public static void exercise2() {
        // Criar equipa
        JogadorDeCampo defesa1 = new JogadorDeCampo("Paulo Costa", 2);
        GuardaRedes guardaRedes1 = new GuardaRedes("António Simão",1);
        System.out.println("Equipa criada:");
        System.out.println(defesa1);
        System.out.println(guardaRedes1);

        // Início do jogo 1
        System.out.println("\n 1º Jogo da Temporada");
        System.out.println("----------------------");
        defesa1.fazerPasse();
        System.out.println("A equipa sofre golo aos 25 min.");
        guardaRedes1.sofrerGolo();
        System.out.println("A equipa marca GOLO aos 30 min.");
        defesa1.receberPasse();
        defesa1.marcarGolo();
        System.out.println("A equipa marca GOLO aos 35 min. Está na frente do marcador.");
        defesa1.receberPasse();
        defesa1.marcarGolo();
        defesa1.receberPasse();
        defesa1.fazerPasse();
        defesa1.receberPasse();
        defesa1.fazerPasse();
        defesa1.receberPasse();

        System.out.println("A equipa sofre golo aos 46 min.");
        guardaRedes1.sofrerGolo();

        System.out.println("A equipa sofre golo aos 90 min.\n");
        guardaRedes1.sofrerGolo();

        System.out.println("Caracterização dos jogadores após jogo");
        System.out.println(defesa1);
        System.out.println(guardaRedes1);
    }
}
