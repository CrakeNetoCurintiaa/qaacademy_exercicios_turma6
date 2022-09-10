package Exercicios_easy;

import javax.swing.*;

public class Exec7 {
    public static void main(String[] args) {
        //    Declarar variáveis do tipo Numérico: salário, inss;
        double salario, inss;
//        salário = Ler (1.045,00);
       salario=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
//        inss = salário*0,075
        inss=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
//        se (salário <=1.045,00)
        if (salario<=1045.00);
//        inss = salário*0,075
        inss = (salario*0.075);
//        exibir: ("O valor a ser pago é" +inss);
        System.out.println("O valor a ser pago é" +inss);

//        se (salário >=1.045,01 && salário<=2.089,60)
        if (salario >=1045.01 && salario<=2089.60);
//        inss = salário*0,09
        inss = (salario*0.09);
//        exibir: ("O valor a ser pago é" +inss);
        System.out.println("O valor a ser pago é" +inss);

//        se (salário >=2.089,61 && salário<=3.134,40)
        if (salario >=2089.61 && salario<=3134.40);
//        inss = salário*0,12
        inss = (salario*0.12);
//        exibir: ("O valor a ser pago é" +inss);
        System.out.println("O valor a ser pago é" +inss);

//        se (salário >=3.134,41)
        if (salario >=3134.41);
//        inss = salário*0,14
        inss = (salario*0.14);
//        exibir: ("O valor a ser pago é" +inss);
        System.out.println("O valor a ser pago é" +inss);
    }
}

