package Testes;

import Exercicios.Exercicio1;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio1Test {

    @Test
    public void testGetListaDeAsteriscos() {
        Exercicio1 exercicio1 = new Exercicio1();
        List<String> result = exercicio1.getListaDeAsteriscos(5);

        assertEquals(5, result.size());
        assertEquals("*", result.get(0));
        assertEquals("**", result.get(1));
        assertEquals("***", result.get(2));
        assertEquals("****", result.get(3));
        assertEquals("*****", result.get(4));
    }
}
