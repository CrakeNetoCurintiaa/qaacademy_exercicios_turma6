package Exercicios_easy;

//import javax.swing.*;

public class Exec10b {
    public String calcularjurosComposto(double valorInv){
        double taxaJuros =0.05, valorJuros=0;

        int i =1;
        while (i <= 10){
        valorJuros = ((valorInv + valorJuros )* taxaJuros + valorJuros);
        i= i+1;}


        return "valor de juros  "+  valorJuros + "\n" + "valor de investimento  " + valorInv + "\n" + "valor total  " + (valorInv+valorJuros);

    }
}
//    public static void main(String[] args) {
//        double investimento, taxa = 0.05, valorJuros = 0, valorTotal = 0, i = 1;
//        investimento = Integer.parseInt(JOptionPane.showInputDialog("digite o investimento"));
//        while (i <= 10) {
//        valorJuros = investimento * taxa+valorJuros;
//        i = i + 1;
//        }
//
//        System.out.println("Valor juros:" + valorJuros);
//        System.out.println("Valor investido:" + investimento);
//        System.out.println("Valor total:" + (investimento + valorJuros));
//    }
//
//}


//    Declarar variáveis tipo numero: investimento, taxa =0,05, valorJuros=0,
//        valorTotal=0;i=1;
//        Investimento = Ler(1000);
//        Enquanto(i&lt;=10)
//        valorJuros = investimento*taxa+valorJuros
//        i =i+1;
//        fim enquanto
//        exibir(“Valor juros: ” + valorJuros);
//        exibir(“Valor investido: ” + investimento);
//
//        exibir(“Valor total: ” + investimento+valorJuros);