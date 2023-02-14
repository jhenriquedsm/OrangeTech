package dio.exercicios.loops;

import java.util.Scanner;

/*
 Faça um programa que peça uma nota, entre zero e dez.
 Mostre uma mensagem caso o valor seja inválido e
 continue pedindo até que o usuario informe um valor válido
*/

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.print("Nota: ");
        nota = scanner.nextInt();

        while(nota < 0 || nota > 10){
            System.out.print("Nota inválida! Digite novamente: ");
            nota = scanner.nextInt();
        }

        scanner.close();
    }
}
