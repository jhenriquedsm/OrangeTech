package exercices.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* EXERCÍCIO SEM AUXÍLIO
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
 * sobre um crime. As perguntas são:
 * 1. "Telefonou para a vítima?"
 * 2. "Esteve no local do crime?"
 * 3. "Mora perto da vítima?"
 * 4. "Devia para a vítima?"
 * 5. Já trabalhou com a vítima?
 * 
 * Se a pessoa responder positivamente a 2 questões ela deve ser
 * classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
 * como "Assasina". Caso o contrário, ela será classificada como
 * "Inocente".
 */

public class Crime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yes = 0;
        
        System.out.print("Telefonou para a vítima?(s/n): ");
        char resposta1 = scan.next().charAt(0);

        System.out.print("Esteve no local do crime?(s/n): ");
        char resposta2 = scan.next().charAt(0);

        System.out.print("Mora perto da vítima?(s/n): ");
        char resposta3 = scan.next().charAt(0);

        System.out.print("Devia para a vítima?(s/n): ");
        char resposta4 = scan.next().charAt(0);

        System.out.print("Já trabalhou com a vítima?(s/n): ");
        char resposta5 = scan.next().charAt(0);

        List<Character> respostas = new ArrayList<Character>(){{
            add(resposta1);
            add(resposta2);
            add(resposta3);
            add(resposta4);
            add(resposta5);
        }};
        System.out.println(respostas);

        
        for (Character character : respostas) {
            if (character == 's' || character == 'S'){
                yes++;
            }
        }
        int totalSim = yes;
        
        if(totalSim == 2){
            System.out.println("Você é SUSPEITO!");
        } else if(totalSim == 3 || totalSim == 4){
            System.out.println("Você é CÚMPLICE!");
        } else if(totalSim == 5){
            System.out.println("Você é ASSASSINO!");
        } else{
            System.out.println("Você é INOCENTE!");
        }

        scan.close();
    }
}
