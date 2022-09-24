package main;

import Exemplos.MetodosSemMain;
import Exercicios_easy.Exec2;
import Exercicios_easy.Exec3;
import Exercicios_easy.Exec4;
import Exercicios_easy.Exec5;

public class Execução {
    public static void main(String[] args) {
        MetodosSemMain Exercicios = new MetodosSemMain();
        System.out.println(Exercicios.multiplicarDoisNumeros(10,20));
        System.out.println(Exercicios.somarDoisNumeros(10,20));
        Exercicios.printarCores();
        System.out.println(Exercicios.nome  + " " +   Exercicios.sobrenome);

        Exec2 palavra = new Exec2();
        System.out.println(palavra.exibirPalavra("Vai Curintia"));

        Exec3 exec3 = new Exec3();
        System.out.println(exec3.ExibirNomeSobrenome("Adriano" , "Oliveira"));


        Exec4 exec4 = new Exec4();
        System.out.println(exec4.calcularOdobro(10));

        Exec5 exec5 = new Exec5();
        System.out.println(exec5.calcularNumeros(10,10,10));
    }
}
