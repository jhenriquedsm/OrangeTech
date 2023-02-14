package AulaList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // dada uma lista com 7 notas de um aluno
        // [7, 8.5, 9.3, 5, 7, 8, 3.6], faça:

        // CRIE UMA LISTA E ADICIONE 7 NOTAS:

        // List notas = new ArrayList<>(); -> java 5
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        // List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); -> lista imutavel
        
        List<Double> notas = new ArrayList<Double>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d));
        notas.add(3.6);
        System.out.println(notas); // ou (notas.toString())
        System.out.println();
        
        // EXIBA A POSIÇÃO DA NOTA 5.0:
        System.out.println(notas.indexOf(5d));
        System.out.println();

        // ADICIONE NA LISTA A NOTA 8.0 NA POSIÇÃO 4:
        notas.add(4, 8d);
        System.out.println("Posição da nota 8.0: " + notas.indexOf(8d));
        System.out.println();

        // SUBSTITUA A NOTA 5.0 PELA NOTA 6.0:
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);
        System.out.println();

        // CONFIRA SE A NOTA 5.0 ESTÁ NA LISTA:
        System.out.println("Contém a nota 5.0: " + notas.contains(5d));
        System.out.println();

        // EXIBA TODAS AS NOTAS NA ORDEM EM QUE FORAM INFORMADAS:
        for (Double nota : notas) {
            System.out.println(nota);
        }
        System.out.println();

        // EXIBA A TERCEIRA NOTA ADICIONADA: 
        System.out.println("Terceira nota: " +  notas.get(2));
        System.out.println(notas);
        System.out.println();

        // EXIBA A MENOR NOTA:
        System.out.println("Menor nota: " + Collections.min(notas)); 
        System.out.println();

        // EXIBA A MAIOR NOTA:
        System.out.println("Maior nota: " + Collections.max(notas));
        System.out.println();

        // EXIBA A SOMA DOS VALORES:
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) { // -> quando o iterator tiver proximo
            Double next = iterator.next();
            soma += next; 
        }
        System.out.println("Soma dos valores: " + soma);
        System.out.println();

        // EXIBA A MÉDIA DAS NOTAS:
        Double media = (soma / notas.size());
        System.out.println("Média das notas: " + media);

        // REMOVA A NOTA 0:
        notas.remove(0d);
        System.out.println(notas);
        System.out.println();

        // REMOVA A NOTA DA POSIÇÃO 0:
        notas.remove(0);
        System.out.println(notas);
        System.out.println();

        // REMOVA AS NOTAS MENORES QUE 7 E EXIBA A LISTA:
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
           Double next = iterator1.next();
           if(next < 7){
            iterator1.remove();
           }
        }
        System.out.println(notas);
        System.out.println();

        // APAGUE TODA A LISTA:
        notas.clear();
        System.out.println(notas);
        System.out.println();

        // CONFIRA SE A LISTA ESTÁ VAZIA:
        System.out.println("Lista vazia: " + notas.isEmpty());
    }   
}
