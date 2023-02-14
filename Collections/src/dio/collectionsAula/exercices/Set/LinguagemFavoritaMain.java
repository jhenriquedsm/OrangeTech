package exercices.Set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class LinguagemFavoritaMain {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("JAVA", 1991, "VS Code"));
            add(new LinguagemFavorita("JavaScript", 1995, "VS Code"));
            add(new LinguagemFavorita("C++", 1980, "Dev C++"));
            add(new LinguagemFavorita("MySQL", 1995, "WorkBench"));
        }};

        // a) Ordem de inserção:
        for (LinguagemFavorita linguagem : linguagens) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIDE());
        }
        System.out.println();

        // b) Ordem natural(nome):
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        for (LinguagemFavorita linguagem : linguagens2) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIDE());
        }
        System.out.println();

        // IDE;
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIDE());
        linguagens3.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens3) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIDE());
        }
        System.out.println();

        // d) Ano de criação e nome:
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
        linguagens4.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens4) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIDE());
        }
        System.out.println();

        // e) Nome, ano de criação e IDE:
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIDE());
        linguagens5.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens4) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIDE());
        }
        System.out.println();
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private Integer anoDeCriacao;
    private String IDE;

    LinguagemFavorita(String nome, Integer anoDeCriacao, String IDE){
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }
    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }
    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", IDE=" + IDE + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((anoDeCriacao == null) ? 0 : anoDeCriacao.hashCode());
        result = prime * result + ((IDE == null) ? 0 : IDE.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LinguagemFavorita other = (LinguagemFavorita) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anoDeCriacao == null) {
            if (other.anoDeCriacao != null)
                return false;
        } else if (!anoDeCriacao.equals(other.anoDeCriacao))
            return false;
        if (IDE == null) {
            if (other.IDE != null)
                return false;
        } else if (!IDE.equals(other.IDE))
            return false;
        return true;
    }
    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        return this.nome.compareToIgnoreCase(linguagem.getNome());
    }
   
}

class ComparatorIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        int IDE = linguagem1.getIDE().compareToIgnoreCase(linguagem2.getIDE());
        if (IDE != 0){
            return IDE;
        }

        return linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());

    }

}

class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        int anoDeCriacao = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
        if (anoDeCriacao != 0) {
            return anoDeCriacao;
        }

        return linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
    }

}

class ComparatorNomeAnoDeCriacaoIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        int nome = linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
        if (nome != 0) {
            return nome;
        }

        int anoDeCriacao = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
        if (anoDeCriacao != 0){
            return anoDeCriacao;
        }

        return linguagem1.getIDE().compareToIgnoreCase(linguagem2.getIDE());
    }

}