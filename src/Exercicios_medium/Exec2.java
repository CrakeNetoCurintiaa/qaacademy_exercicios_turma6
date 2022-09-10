package Exercicios_medium;

import javax.swing.*;

public class Exec2 {
    public static void main(String[] args) {
        double valorInvestimento, taxaJuros = 0.05, valorJuros, valorTotal;
        int i = 1;
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
        valorTotal = valorInvestimento;
        valorJuros=0.05;
        while (i <= 1000) {
            valorJuros = ((valorJuros+valorInvestimento)*taxaJuros)+valorJuros;
            valorTotal = (valorTotal * taxaJuros) + valorTotal;
            i++;
        }

            System.out.println( "Você investiu"  + " "  + valorInvestimento );
            System.out.println( "Rendeu" + " " + valorJuros  + " " + "de Juros" );
            System.out.println( "O Valor total é "  + valorTotal );



    }
}
//        2-) Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5%
//        a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros, e o total.
//        Considerando que a remuneração será no regime de juros compostos.
//        Inicio Algoritmo
//        Declarar Variavel do tipo numerica: valorInvestimento,
//        taxaJuros = 0.05, valorJuros, valorTotal, i =1, valorJuros;
//        valorInvestimento = Ler (“1000,00”);
//        valorTotal = valorInvestimento;
//        Enquanto (i&lt;=10)
//        valorTotal = (valorTotal*taxaJuros) +valorTotal;
//        i=i+1; //i++
//        Fim Enquanto
//        valorJuros = valorTotal - valorInvestimento;
//        Exibir: “Você investiu: ”+valorInvestimento;
//        Exibir: “Rendeu : ”+valorJuros + “de Juros”;
//        Exibir: “O Valor total são : ”+valorTotal;