package Exercicios_medium;

import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;

public class Exec6 {
    public static void main(String[] args) {
        int Fatorial, i;
        Fatorial = Integer.parseInt(JOptionPane.showInputDialog("num"));
        i=Fatorial;
        while (i>1){
            Fatorial = Fatorial*(i-1);
            i--;
        }
        System.out.println(" o fatorial é " + Fatorial);
    }
}
