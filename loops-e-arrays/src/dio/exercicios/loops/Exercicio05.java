package dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuda, capaz de gerar a tabuada
de qualquer número entre 1 a 10. O usuario deve informar
de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50

*/
public class Exercicio05 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Tabuada: ");
       int tabuada = scanner.nextInt();

       for(int i = 1; i <= 10; i++){
        System.out.println(tabuada + " x " + i + " = " + tabuada * i);
       }

       scanner.close();
    }
}
