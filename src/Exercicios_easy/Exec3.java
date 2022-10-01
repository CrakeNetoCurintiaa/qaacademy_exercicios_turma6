package Exercicios_easy;
//Exercício 3 - Faça um algoritmo para ler dois valores, armazenar em variáveis, e
//        exibir os valores das variáveis, trocados

import javax.swing.*;

public class Exec3 {

    public String ExibirNomeSobrenome(String nome, String sobrenome) {
        String auxiliar;
        auxiliar = nome;
        nome = sobrenome;
        sobrenome = auxiliar;

        return  nome +" " + sobrenome;


    }
}
//    public static void main(String[] args) {
////        Declarar variável do tipo texto nome, sobrenome;
//        String nome, sobrenome, auxiliar;
////       nome = Ler(“adriano”);
//        nome = JOptionPane.showInputDialog("Digite sua palavra aqui");
////        sobrenome = Ler(“oliveira”);
//        sobrenome = JOptionPane.showInputDialog("Digite sua palavra aqui");
////        Exibir: “O texto é:” + sobrenome + nome;
//        auxiliar = nome;
//        nome = sobrenome;
//        sobrenome = auxiliar;

//        System.out.println("O texto é: "+nome +sobrenome);


////        Declarar variável do tipo texto nome, sobrenome;
////        nome = Ler(“adriano”);
////        sobrenome = Ler(“oliveira”);
//          auxiliar = nome;
//          nome = sobrenome;
//          sobrenome= auxiliar;
////        Exibir: “O texto é:” + sobrenome + nome;
////        O texto é oliveira adriano