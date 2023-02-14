package dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjutos de dois valores,
o primeiro representando o nome do aluno e o segundo a sua idade
*/

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Insira 0 em nome para sair");
            System.out.print("Nome: ");
            nome = scanner.next();
            if (nome.equals("0")){
                break;
            }

            System.out.print("Idade: ");
            idade = scanner.nextInt();
        }
        scanner.close();
    }
}
