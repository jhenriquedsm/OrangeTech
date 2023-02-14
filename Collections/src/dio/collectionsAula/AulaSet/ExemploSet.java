package AulaSet;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// não é possível trabalhar com posição dentro do Set

public class ExemploSet {
    public static void main(String[] args) {
        // dada uma lista com 7 notas de um aluno
        // [7, 8.5, 9.3, 5, 7, 8, 3.6], faça:

        //CRIE UM CONJUNTO E ADICIONE AS NOTAS:
        // não fica na ordem e elementos repetidos se tornam um
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6));
        System.out.println(notas);
        System.out.println();

        // CONFIRA SE A NOTA 5.0 ESTÁ NO CONJUNTO:
        System.out.println("Contém a nota 5.0: " + notas.contains(5d));
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
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println("Soma: " + format.format(soma));
        System.out.println();

        // EXIBA A MÉDIA DAS NOTAS:
        System.out.println("Média: " + format.format((soma / notas.size())));
        System.out.println();

        // REMOVA A NOTA 0:
        notas.remove(0d);
        System.out.println(notas);
        System.out.println();

        //REMOVA AS NOTAS MENORES QUE 7 E EXIBA A LISTA:
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);
        System.out.println();

        // EXIBA TODAS AS NOTAS NA ORDEM QUE FORAM INFORMADAS:
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println();

        // EXIBA TODAS AS NOTAS NA ORDEM CRESCENTE:
        Set<Double> notas3 = new TreeSet<>(notas2); // só pode fazer pq o notas2 tem o Comparable
        System.out.println(notas3);
        System.out.println();

        // APAGUE O CONJUNTO:
        notas.clear();
        System.out.println(notas);
        System.out.println();

        // VERIFIQUE SE O CONJUNTO ESTÁ VAZIO:
        System.out.println("Notas está vazio: " + notas.isEmpty());
        System.out.println("Notas 2 está vazio: " + notas2.isEmpty());
        System.out.println(); 
    }
}
