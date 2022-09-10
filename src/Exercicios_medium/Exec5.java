package Exercicios_medium;

import javax.swing.*;

import static java.lang.System.out;

public class Exec5 {
    public static void main(String[] args) {
        int  i = 1, anterior = 0, numDigitado = 0;
        while (i <= 5) {
            numDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            if (numDigitado < anterior || i == 1) {
                anterior = numDigitado;}
            i++;}
            System.out.println("O menor digitado é: " +anterior);

    }
}

//5-) Faça um algoritmo para ler 5 números, verificar e exibir, quais dos
//        5 números digitados, é o menor.
//        Inicio Algoritmo
//        Declarar variável numérica: i = 1, anterior,
//        numeroDigitado;
//        Enquanto(i&lt;=5)
//        numeroDigitado = Ler();
//        Se(numeroDigitado &lt; anterior || i==1)
//        anterior = numeroDigitado;
//        Fim Se
//        i++;
//        Fim Enquanto
//        Exibir (“O menor digitado é: ”+anterior);
//        Fim Algoritmo