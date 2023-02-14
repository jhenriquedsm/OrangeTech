package dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
*/

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int quantPares = 0;
        int quantImpares = 0;
        int quantNum;

        System.out.print("Insira a quantidade de números: ");
        quantNum = scanner.nextInt();

        int contador = 0;
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if(numero % 2 == 0){
                quantPares++;
            } else{
                quantImpares++;
            }

            contador++;
        } while(contador < quantNum);

        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpares);

        scanner.close();
    }
}
