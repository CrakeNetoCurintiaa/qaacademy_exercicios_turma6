package Exercicios_easy;

import javax.swing.*;

public class Exec10a {
    public double calcularJuros(double valorInv){
        double taxaJuros =0.05;
        int i =10;
        taxaJuros = taxaJuros*i;
        i++;
        return valorInv * taxaJuros;
    }
}
//    public static void main(String[] args) {
//       double valorInvestimento, taxaJuros=0.05, valorJuros, valorTotal;
//       valorInvestimento= Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
//       taxaJuros=0.05*10;
//       valorJuros= valorInvestimento * taxaJuros;
//       valorTotal = valorJuros+valorInvestimento;
//
//        System.out.println("Você investiu"+ " " +valorInvestimento);
//        System.out.println("Rendeu" + " " +valorJuros + "de Juros");
//        System.out.println("O Valor total é " +valorTotal );
//
//    }
//}

//    Declarar Variavel do tipo numerica: valorInvestimento, taxaJuros = 0.05,
//        valorJuros, valorTotal;
//        valorInvestimento = Ler (1000,00);
//        taxajuros = 0.05 * 10; //0.50 ou 50%
//        valorJuros = valorInvestimento * taxajuros;
//        500,00. valorTotal = valorTotal = valorJuros+valorInvestimento;
//        Exibir: “Você investiu: ”+valorInvestimento;
//        Exibir: “Rendeu : ”+valorJuros + “de Juros”;
//        Exibir: “O Valor total são : ”+valorTotal;