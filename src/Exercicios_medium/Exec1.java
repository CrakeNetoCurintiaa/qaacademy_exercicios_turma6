package Exercicios_medium;

public class Exec1 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(" o num é: "  +  i  + "  é par");
            } else {
                System.out.println(" o num é: "  +  i  + "  é ímpar");
            }
            i++;
        }
    }
}

//1-) Faça um algoritmo para verificar e exibir de 0 a 100, quais são os números Pares e
//ímpares.
//    Inicio algoritmo
//    Declarar variavel inteira: i = 0;
//        Enquanto(i &lt;= 100)
//        SE(i % 2 == 0)
//        Exibir: “O Número: ”+ i + “ é par”;
//        Fim SE
//        SE Não
//        Exibir: “O Número: ”+ i + “ é ímpar”;
//        Fim SE
//        i++;
//        Fim Enquanto
//        Fim algoritmo