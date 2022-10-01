package Exercicios_easy;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Exec8 {
    public String calcularImposto(double salario) {
        double imposto = 0;
        if (salario <= 1903.98) {
            return ("Isento de imposto de renda");
        }
        else {

            if (salario >= 1903.99 && salario <= 2826.65) {
                imposto = (salario * 0.075) - 142.80;
                return ( "valor bruto: " + salario +" " + "valor liquido:" + " " +(salario - imposto) + " " + "valor ir: " + imposto);

            }
            if (salario >= 2826.66 && salario <= 3751.05) {
                imposto = (salario * 0.15) - 354.80;
                return ( "valor bruto: " + salario +" " + "valor liquido:" + " " +(salario - imposto) + " " + "valor ir: " + imposto);
            }
            if (salario >= 3751.06 && salario <= 4664.68) {
                imposto = (salario * 0.225) - 636.13;
                return ( "valor bruto: " + salario +" " + "valor liquido:" + " " +(salario - imposto) + " " + "valor ir: " + imposto);
            }
            if (salario > 4664.68) {
                imposto = (salario * 0.275) - 869.36;
                return ( "valor bruto: " + salario +" " + "valor liquido:" + " " +(salario - imposto) + " " + "valor ir: " + imposto);
            }
        }
        return null;
    }
}
//        Exibir“Salario Bruto: ” + salario;
//        Exibir“Salario Liquido: ” + (salario - ir);
//        Exibir“Imposto a pagar: ” +  i);

//            System.out.println("O seu salario bruto: " + salario);
//            System.out.println("O seu salario liquido:" + (salario - imposto));
//            System.out.println("Valor do imposto renda: " + imposto);
//

//    public static void main(String[] args) {
//        double salario, imposto = 0;
//        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario!: "));
//        if (salario <= 1903.98){
//             System.out.println("Isento de imposto de renda");
//        }
//
//        {
//            if (salario >= 1903.99 && salario <= 2826.65) {
//                imposto = (salario * 0.075) - 142.80;
//            }
//            if (salario >= 2826.66 && salario <= 3751.05) {
//                imposto = (salario * 0.15) - 354.80;
//            }
//            if (salario >= 3751.06 && salario <= 4664.68) {
//                imposto = (salario * 0.225) - 636.13;
//            }
//            if (salario > 4664.68) {
//                imposto = (salario * 0.275) - 869.36;
//            }
//
////        Exibir“Salario Bruto: ” + salario;
////        Exibir“Salario Liquido: ” + (salario - ir);
////        Exibir“Imposto a pagar: ” +  i);
//
//            System.out.println("O seu salario bruto: " + salario);
//            System.out.println("O seu salario liquido:" + (salario - imposto));
//            System.out.println("Valor do imposto renda: " + imposto);
//        }
//    }
//}
