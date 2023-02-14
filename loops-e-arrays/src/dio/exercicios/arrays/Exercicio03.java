package dio.exercicios.arrays;

import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleatorios
 * (entre 0 e 100) e armazene-os em um vetor.
 * Ao final mostre os números e seus sucessores
 */

public class Exercicio03 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números Aleatórios: ");
        for (int numero : numerosAleatorios) { //foreach
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) { ; //foreach
            System.out.print((numero + 1) + " ");
        }

    }
}
