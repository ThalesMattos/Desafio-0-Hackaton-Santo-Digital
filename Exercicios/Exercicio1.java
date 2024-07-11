package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

    public List<String> getListaDeAsteriscos(int num) {
        List<String> asteriskList = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            asteriskList.add("*".repeat(Math.max(0, i)));
        }

        return asteriskList;
    }
}
