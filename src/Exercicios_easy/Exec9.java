package Exercicios_easy;

public class Exec9 {
    public int tabuada (int valor) {
        int multiplicador = 0, resultado =0;
        while (multiplicador <=10){
            resultado = valor * multiplicador;
            System.out.println( valor + " x " + multiplicador + " = " + resultado);
            multiplicador ++;
        }

              return valor;
    }
    }
//    public static void main(String[] args) {
//        int numDigitado, i=1;
//        numDigitado= Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
//        while (i<=10){
//        System.out.println( numDigitado  + "x"+ i +"=" + numDigitado *i);
//        i=i+1;}
//
//    }



//    Declarar variável do tipo numérico: numeroDigitado, i = 1;
//        numeroDigitado = Ler(5);
//        Enquanto(i&lt;=10)
//        Exibir: “Numero ”+numeroDigitado + “ x ”+ i +“ = ” + numeroDigitado * i;
//        i=i+1;
//        Fim Enquanto