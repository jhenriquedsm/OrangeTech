package dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe
o maior número e a média desses números
*/

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int maiorNumero = 0;
        int valorTotal = 0;
        int media;

        int contador = 0;
        do{
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if(numero > maiorNumero){
                maiorNumero = numero;
            }
            valorTotal += numero;
            media = valorTotal / 5;
            contador++;
        } while(contador < 5);

        System.out.println("Maior: " + maiorNumero);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
