package AulaList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Dadas as seguintes informações sobre meus gatos, crie uma lista
// e ordene esta lista exibindo:
// (nome - idade - cor);

// Gato 1 = nome: Jon, idade: 18, cor: preto;
// Gato 2 = nome: Simba, idade: 6, cor: tigrado;
// Gato 3 = nome: Jon, idade: 12, cor amarelo;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println(gatos);
        System.out.println();

        // EXIBA NA ORDEM DE INSERÇÃO:
        System.out.println(gatos);
        System.out.println();

        // EXIBA NA ORDEM ALEATÓRIA:
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println();

        // EXIBA NA ORDEM NATURAL (NOME):
        Collections.sort(gatos); // neste caso a list precisa ter a interface Comparable;
        System.out.println(gatos);
        System.out.println();

        // EXIBA EM ORDEM DE IDADE:
        Collections.sort(gatos, new ComparatorIdade()); // outra opção: gatos.sort(new ComparatorIdade());
        System.out.println(gatos);
        System.out.println();

        // EXIBA EM ORDEM DE COR:
        Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);
        System.out.println();

        // EXIBA NOME/COR/IDADE:
        Collections.sort(gatos, new ComparatorNomeCorIdade());
        System.out.println(gatos);
        System.out.println();
    }
}


class Gato implements Comparable<Gato>{
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() { // serve para exibir os dados e não o endereço na memoria
        return "[nome = " + nome + ", idade = " + idade + ", cor = " + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    
}


class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
    
}


class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }

}


class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0){ // se os nomes forem diferentes
            return nome;
        }

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (cor != 0){
            return cor;
        }

        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }

}