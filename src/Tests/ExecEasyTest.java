package Tests;

import Exercicios_easy.Exec2;
import Exercicios_easy.Exec3;
import Exercicios_easy.Exec4;
import Exercicios_easy.Exec5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExecEasyTest {
    @Test
    public void testeDeJuncaoPalavra() {
        Exec2 exec2 = new Exec2();
        String retorno = exec2.exibirPalavra("Bolsolula");
        assertEquals("A palavra é : Bolsolula", retorno);
    }

    @Test
    public void ExibirNomeSobrenome() {
        Exec3 exec3 = new Exec3();
        String retorno = exec3.ExibirNomeSobrenome("Adriano", "Oliveira");
        assertEquals("Oliveira Adriano", retorno);
    }

    @Test
    public void calcularOdobro() {
        Exec4 exec4 = new Exec4();
        int dobro = exec4.calcularOdobro(10);
        assertEquals("o dobro é invalido", 20, dobro);
    }

    @Test
    public void calcularSoma() {
        Exec5 exec5 = new Exec5();
        int resultado = exec5.calcularNumeros(10, 10, 10);
        assertEquals(30, resultado);
    }

    @Test
    public void calcularSubtracao() {
        Exec5 exec5 = new Exec5();
        int resultado = exec5.calcularNumeros(8, 2, 2);
        assertEquals(4, resultado);
    }

    @Test
    public void calcularMultiplicacao() {
        Exec5 exec5 = new Exec5();
        int resultado = exec5.calcularNumeros(10, 10, 10);
        assertEquals(1000, resultado);
    }

    @Test
    public void calcularMedia() {
        Exec5 exec5 = new Exec5();
        int resultado = exec5.calcularNumeros(10, 10, 10);
        assertEquals(10, resultado);
    }
}