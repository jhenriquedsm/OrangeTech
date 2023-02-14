package dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Exercicio01 {
    public static void main(String[] args) {
        
        int[] vetor = {10, -8, 20, 7, 9, -1};

        System.out.println("Vetor: ");
        int contador = 0;
        while(contador < (vetor.length)){
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        // inverso
        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
