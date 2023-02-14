package dio.exercicios.arrays;

import java.util.Random;

/*
 * Gere e imprima uma matriz M 4x4 com valores entre 0-9
 */

public class Exercicio04 {
    public static void main(String[] args) {
        Random random = new Random(); // gera números aleatórios

        int[][] M = new int[4][4]; //matriz

        for(int i = 0; i < M.length; i++){ // linhas
            for(int j = 0; j < M[i].length; j++){ // elementos de cada linha
                M[i][j] = random.nextInt(9); // bound seta o valor máximo de um elemento
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) { // vai pegar cada linha
            for (int elementoColuna : linha) { // vai pegar cada elemento de cada linha
                System.out.print(elementoColuna + " ");
            }
            System.out.println();
        }
    }
}
