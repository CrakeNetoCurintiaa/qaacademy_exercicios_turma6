package Exercicios_medium;

import javax.swing.*;

public class Exec8 {
    public static void main(String[] args) {
        String[] Mês;
        int num=0;
        Mês = new String[12];


        Mês[0] = "Jan";
        Mês[1] = "Fev";
        Mês[2] = "Mar";
        Mês[3] = "Abr";
        Mês[4] = "Mai";
        Mês[5] = "Jun";
        Mês[6] = "Jul";
        Mês[7] = "Ago";
        Mês[8] = "Set";
        Mês[9] = "Out";
        Mês[10] = "Nov";
        Mês[11] = "Dez";

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
        int i = num-1;
        System.out.println("o Mês é:" +Mês[i]);

        }
    }




