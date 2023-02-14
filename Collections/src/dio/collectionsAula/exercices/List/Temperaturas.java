package exercices.List;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* EXERCÍCIO SEM AUXÍLIO
 * Faça um programa que receba a temperatura média dos 6 
 * primeiros meses do ano e armazen-as em uma lista.
 * Após isso, calcule a média semestral das temperaturas e mostre
 * todas as temperaturas acima desta média e em que mês elas
 * ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro,
 * e etc)
 */

public class Temperaturas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> medias = new ArrayList<Double>(){{
            for(int i = 1; i <= 6; i++){
                System.out.print("Insira a média do mês " + i + ": ");
                Double media = scan.nextDouble();
                add(media);
            }
        }};
        System.out.println();
        System.out.println(medias);
        System.out.println();

        Iterator<Double> iterator = medias.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) { // -> quando o iterator tiver proximo
            Double next = iterator.next();
            soma += next; 
        }

        Double mediaSemestral = (soma / 6);
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("A média semestral é: " + formato.format(mediaSemestral));

        List<Double> mediasAcimaDaMedia = new ArrayList<Double>(){{
            for (Double media : medias) {
                if(media >= mediaSemestral){
                    add(media);
                }
            }
        }};
        System.out.println(mediasAcimaDaMedia);


        List<Integer> meses = new ArrayList<Integer>(){{
            for(int i = 0; i < medias.size(); i++){
                if (medias.get(i) > mediaSemestral) {
                    add(i);
                }
             }
        }};
        System.out.println(meses);
        System.out.println();


        System.out.println("Meses acima da média: ");
        for (int i = 0; i < meses.size(); i++){
            if (meses.get(i) == 0){
                System.out.println("1 - JANEIRO");
            } else if (meses.get(i) == 1){
                System.out.println("2 - FEVEREIRO");
            } else if (meses.get(i) == 2){
                System.out.println("3 - MARÇO");
            } else if (meses.get(i) == 3){
                System.out.println("4 - ABRIL");
            } else if (meses.get(i) == 4){
                System.out.println("5 - MAIO");
            } else if (meses.get(i) == 5){
                System.out.println("6 - JUNHO");
            }
        }
        
        scan.close();
    }
    
}