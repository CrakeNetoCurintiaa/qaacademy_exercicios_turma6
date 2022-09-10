package Exercicios_medium;

public class Exec3 {
    public static void main(String[] args) {
        int i = 0, soma = 0;
        while (i <= 1500) {
            soma = i + soma;
                if (soma >= 1500) {
                    break;}
            System.out.println("exibir" + " " + soma);
                    i++;


            }
        }
    }

//3-) Faça um algoritmo para calcular e exibir a soma de todos os números de 0 a 1000. E
//        parar se caso a soma atingir 1500(Ou mais).
//        EX: 0 +1, 1+2, 3+4.. 1500 | break ou parar
//        Inicio Algoritmo
//        Declarar variável do tipo numerico: i=0, soma;
//        Enquanto(i&lt;=1000 )
//        soma = i+soma;
//        Se(soma&gt;= 1500)
//        break; //parar
//
//        Fim Se
//        Exibir(soma);
//        i++; //i = i+1;
//        Fim Enquanto
//        Exibir(soma);
//
//        Fim Agoritmo
//        Sem o break.
//        Inicio Algoritmo
//        Declarar variável do tipo numerico: i=0, soma;
//        Enquanto(i&lt;=1000 &amp;&amp; soma &lt;=1500)
//        soma = i+soma;
//        Exibir(soma);
//        i++; //i = i+1;
//        Fim Enquanto
//        Fim Algoritmo