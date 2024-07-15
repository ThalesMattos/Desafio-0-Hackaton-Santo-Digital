package Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio2 {

    public List<int[]> paresComMenosDiferenca(int[] numerosInteiros){

        Arrays.sort(numerosInteiros);
        List<int[]> resultado = new ArrayList<>();
        int diferencaMinima = Integer.MAX_VALUE;

        for (int i = 1; i < numerosInteiros.length; i++) {
            int diferenca = numerosInteiros[i] - numerosInteiros[i - 1];
            if (diferenca < diferencaMinima) {
                diferencaMinima = diferenca;
                resultado.clear();
                resultado.add(new int[]{numerosInteiros[i - 1], numerosInteiros[i]});
            } else if (diferenca == diferencaMinima) {
                resultado.add(new int[]{numerosInteiros[i - 1], numerosInteiros[i]});
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Exercicio2 exercicio2 = new Exercicio2();

        System.out.println(exercicio2.paresComMenosDiferenca(new int[]{3, 8, 50, 5, 1, 18, 12}));
    }
}
