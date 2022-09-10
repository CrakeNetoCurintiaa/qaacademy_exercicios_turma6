package Exercicios_easy;

import javax.swing.*;

public class Exec11 {
    public static void main(String[] args) {
        int num, i = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite o num"));
        while (i <= 100) {System.out.println("A soma é:" + num);
            num = (num + 2);
            i = i + 1;
        }

    }
}

//    Declarar variáveis do tipo numérico num, i=1;
//        num = Ler(6);
//        Enquanto(i&lt;=100)
//        num = num +2;
//        Exibir(“A soma é:” + num);
//        i =i+1;
//        Fim enquanto