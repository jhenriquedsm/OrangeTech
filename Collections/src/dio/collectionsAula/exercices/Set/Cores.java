package exercices.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class Cores {
    public static void main(String[] args) {
        Set<String> cores = new LinkedHashSet<>(){{
            add("vermelho");
            add("laranja");
            add("amarelo");
            add("verde");
            add("azul");
            add("violeta");
            add("anil");
        }};
        // a) Exiba todas as cores o arco-íris uma abaixo da outra:
        for (String cor : cores) {
            System.out.println(cor);
        }
        System.out.println();

        // b) A quantidade de cores que o arco-íris tem:
        System.out.println("Quantidade de cores: " + cores.size());
        System.out.println();

        // c) Exiba as cores em ordem alfabética;
        Set<String> cores1 = new TreeSet<>(cores);
        System.out.println("Ordem Alfabética: ");
        for (String cor : cores1) {
            System.out.println(cor);
        }
        System.out.println();

        //d) Exiba as cores na ordem inversa da que foi informada;
        Set<String> cores2 = new LinkedHashSet<>(){{
            add("vermelho");
            add("laranja");
            add("amarelo");
            add("verde");
            add("azul");
            add("violeta");
            add("anil");
        }};
        ArrayList<String> reverseElements = new ArrayList<>(cores2);
        Collections.reverse(reverseElements);
        for (String cor : reverseElements) {
            System.out.println(cor);
        }
        System.out.println();

        // e) Exiba todas as cores que começam com a letra ”v”:
        for (String cor : cores) {
            if(cor.startsWith("v")){
                System.out.println(cor);
            }
        }
        System.out.println();

        //f) Remova todas as cores que não começam com a letra “v”;
        Iterator<String> iterator = reverseElements.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")){
                iterator.remove();
            } 
        }
       System.out.println(reverseElements);
       System.out.println();
        
       // g) Limpe o conjunto:
       reverseElements.clear();
       System.out.println(reverseElements);
       System.out.println();

       // h) Confira se o conjunto está vazio:
       boolean vazio = reverseElements.isEmpty();
       System.out.println("Conjunto vazio: " + vazio);
       System.out.println();
    }
}
