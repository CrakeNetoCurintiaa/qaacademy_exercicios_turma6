package Exercicios_easy;

import javax.swing.*;

public class Exec6 {
    public String exibirNota(int nota1, int nota2) {
        int media =(nota1 + nota2)/2;
        if (media>5){
            return ("Aprovado");}

        if (media<5){
            return ("Reprovado");}

        if (media==5){
            return ("Exame");}

        return null;
    }
    }
//    public static void main(String[] args) {
//        int num1, num2, media;
//        num1=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
//        num2=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
//        media= (num1+num2)/2;
//        if (media>5)
//        System.out.println("VOCE FOI APROVADO:");
//        if (media<5)
//        System.out.println("VOCE FOI REPROVADO:");
//        if (media==5)
//        System.out.println("VOCE ESTA DE EXAME:");
//    }

//    Declarar variáveis do tipo Numérico: núm1, núm2, resultado;
//        núm1= Ler(10);
//        núm2= Ler(2);
//        resultado = (núm1+núm2)/2;
//        SE (resultado >5)
//        Exibir: “aprovado”
//        Fim SE (resultado >5)
//        Exibir: “Reprovado”
//        Fim SE (resultado >5)
//        Exibir: “Exame”
//        Fim SE
