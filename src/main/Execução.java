package main;

import Exemplos.MetodosSemMain;

public class Execução {
    public static void main(String[] args) {
        MetodosSemMain Exercicios = new MetodosSemMain();
        System.out.println(Exercicios.multiplicarDoisNumeros(10,20));
        System.out.println(Exercicios.somarDoisNumeros(10,20));
        Exercicios.printarCores();
        System.out.println(Exercicios.nome +  Exercicios.sobrenome);


    }
}
