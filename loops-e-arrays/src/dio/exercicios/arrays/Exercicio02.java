package dio.exercicios.arrays;

import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres, e diga
 * quantas consoantes foram lidas.
 * Imprima as consoantes
 */

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int contador = 0;
        do {
            System.out.print("Letra: ");
            String letra = scanner.next();

            if ( !(letra.equalsIgnoreCase("a") || //IgnoreCase pega tanto minusculo quanto maiusculo
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u") )) {

                consoantes[contador] = letra;
                quantConsoantes++;
            }
            contador++;
        } while(contador < consoantes.length);


        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null){
                System.out.print(consoante + " ");
            }
        }
        System.out.println("Quantidade de consoantes: " + quantConsoantes);

        scanner.close();
    }
}
