package Aula007_Classes;

public class Empresa {
    // Attributes
    private String nome;
    private Empregado[] listaEmpregados = new Empregado[0];
    private double lucro;


    // Constructors
    public Empresa(String nome){
        this.nome = nome;
    }


    //Methods
    public String getNome(){
        return nome;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getLucro(){
        return lucro;
    }

    public void addEmpregado(Empregado empregado){
        Empregado[] novaLista = new Empregado[listaEmpregados.length + 1];
        for (int i = 0; i < listaEmpregados.length; i++) {
            novaLista[i] = listaEmpregados[i];
        }

        novaLista[listaEmpregados.length] = empregado;
        this.listaEmpregados = novaLista;
    }

    public double getSalarioTotal(){
        double soma = 0;
        for (Empregado empregado: listaEmpregados) {
            soma += empregado.getSalario();
        }
        return soma;
    }

    public double getSalarioGerentes() {
        double soma = 0;
        for(Empregado empregado : listaEmpregados) {
            if(empregado instanceof Gerente) {
                soma += empregado.getSalario();
            }
        }
        return soma;
    }
}
