package AulaMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

public class ExemploMap {
    public static void main(String[] args) {
        
        // CRIE UM DICIONÁRIO QUE RELACIONE OS MODELOS E SEUS RESPECTIVOS CONSUMOS: // as chaves no map são de valores únicos, não podem ser duplicadas
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);
        System.out.println();

        // SUBSTITUA O CONSUMO DO GOL POR 15,2 KM/L:
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println();

        // CONFIRA SE O MODELO TUCSON ESTÁ NO DICIONÁRIO:
        System.out.println("Contém Tucson: " + carrosPopulares.containsKey("tucson"));
        System.out.println();

        // EXIBA O CONSUMO DO UNO:
        System.out.println("Consumo do Uno: " + carrosPopulares.get("uno"));
        System.out.println();

        // EXIBA OS MODELOS:
        Set<String> modelos = carrosPopulares.keySet();
        for (String modelo : modelos) {
            System.out.println(modelo);
        }
        System.out.println();

        // EXIBA O CONSUMO DOS CARROS:
        Collection<Double> consumos = carrosPopulares.values();
        for (Double consumo : consumos) {
            System.out.println(consumo);
        }
        System.out.println();

        // EXIBA O MODELO MAIS ECONÔMICO E SEU CONSUMO:
        Double consumoEconomico = Collections.max(carrosPopulares.values());
        Set<Entry<String, Double>> entrySet = carrosPopulares.entrySet();
        String modeloEconomico = "";
        for (Entry<String,Double> entry : entrySet) {
            if (entry.getValue().equals(consumoEconomico)){
                modeloEconomico = entry.getKey();
                System.out.println("Modelo mais econômico: " + modeloEconomico + " - " + consumoEconomico);
            }
        }
        System.out.println();

        // EXIBA O MODELO MENOS ECONÔMICO E SEU CONSUMO:
        Double consumoMenosEconomico = Collections.min(carrosPopulares.values());
        Set<Entry<String, Double>> entrySet2 = carrosPopulares.entrySet();
        String modeloMenosEconomicos = "";
        for (Entry<String,Double> entry : entrySet2) {
            if(entry.getValue().equals(consumoMenosEconomico)){
                modeloMenosEconomicos = entry.getKey();
                System.out.println("Modelo menos econômico: " + modeloMenosEconomicos + " - " + consumoMenosEconomico);
            }
        }
        System.out.println();

        // EXIBA A SOMA DOS CONSUMOS:
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma dos Consumos: " + soma);
        System.out.println();

        // EXIBA A MÉDIA:
        Double mediaConsumo = soma / carrosPopulares.size();
        System.out.println("Média de Consumo: " + mediaConsumo);
        System.out.println();

        // REMOVA OS MODELOS COM O CONSUMO IGUAL A 15.6 km/l:
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);
        System.out.println();

        // EXIBA TODOS OS CARROS NA ORDEM QUE FORAM INFORMADOS:
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);
        System.out.println();

        // EXIBA O DICIONARIO ORDENADO PELO MODELO:
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);
        System.out.println();

        // APAGUE O DICIONARIO DE CARROS:
        carrosPopulares.clear();

        // CONFIRA SE O DICIONARIO ESTÁ VAZIO:
        System.out.println("Vazio: " + carrosPopulares.isEmpty());
    }
}