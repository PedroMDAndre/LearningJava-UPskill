package Exercício6;

/*
Exercício 6
Utilizando o PrintWriter/Scanner crie um programa para escrever/ler a seguinte
informação num ficheiro de texto:

Carro;      Cliente;        Reparação;      Valor
BB-11-22;   João Silva;     Motor;          1000.0
CC-11-22;   Maria do Carmo; Vidro;          100.0
DD-11-22;   Manuel Damásio; Pára-choques;   500.0
EE-11-22;   Vitor Pereira;  Embraiagem;     500.0

Inicialmente deve carregar a informação de vários ficheiros cujo conteúdo é informações
de reparações (classe Reparacao). Ao carregar a informação deve criar objectos do tipo
Reparacao.

Depois de carregar toda a informação dos diversos ficheiros deve mostrar no ecrã a
informação sobre as mesmas (através do toString redefinido para a classe Reparacao) e
deve também gravar num novo ficheiro.

 */

import java.io.File;
import java.util.ArrayList;

public class Exercicio6 {
    public static void main(String[] args) {
        // Ficheiros com dados
        File file1 = new File("ficheiros/reparacao1.txt");
        File file2 = new File("ficheiros/reparacao2.txt");

        // Ficheiro onde salvar dados
        File file3 = new File("ficheiros/reparacao3.txt");

        ArrayList<Reparacao> listaReparacoes = new ArrayList<>();

        Reparacao.loadFile(file1, listaReparacoes);
        System.out.println(listaReparacoes);
        Reparacao.loadFile(file2, listaReparacoes);
        System.out.println(listaReparacoes);
        Reparacao.saveToFile(file3, listaReparacoes);

    }
}
