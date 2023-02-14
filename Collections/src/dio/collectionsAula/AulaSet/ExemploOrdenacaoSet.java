package AulaSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Dadas as seguintes informações sobre minhas séries favoritas, crie um
 * conjunto e ordene esse conjunto exibindo:
 * (nome - genero - tempo de episódio);
 * 
 * Série 1 = nome: got, genero: fantasia, tempoEpisodio: 60;
 * Série 2 = nome: dark, genero: drama, tempoEpisodio: 60;
 * Série 3 = nome: that '70s show, genero: comedia, tempoEpisodio: 25;
*/

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        
        // ORDEM ALEATÓRIA:
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        for (Serie serie : series) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println();

        // ORDEM DE INSERÇÃO:
        Set<Serie> series1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        for (Serie serie : series1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println();

        // ORDEM NATURAL (TEMPO DE EPISÓDIO):
        Set<Serie> series2 = new TreeSet<>(series1);
        for (Serie serie : series2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println();
        
        // ORDEM NOME/GENERO/TEMPOEPISODIO:
        Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        series3.addAll(series2);
        for (Serie serie : series3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println();

        // ORDEM POR GENERO:
        Set<Serie> series4 = new TreeSet<>(new ComparatorGenero());
        series4.addAll(series);
        for (Serie serie : series4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println();

        // ORDEM POR TEMPO DE EPISODIO:
        Set<Serie> series5 = new TreeSet<>(new ComparatorTempoEpisodio());
        series5.addAll(series);
        for (Serie serie : series5) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }  
    
}



class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    Serie(String nome, String genero, int tempoEpisodio){
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
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
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if(tempoEpisodio != 0){
            return tempoEpisodio;
        }

        return this.getGenero().compareTo(serie.getGenero());
    }
    
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0){
            return nome;
        }

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0){
            return genero;
        }

        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
        
    }

}

class ComparatorGenero implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0){
            return genero;
        }

        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0) {
            return nome;
        }

        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
    }

}

class ComparatorTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int tempoEpisodio = Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
        if (tempoEpisodio != 0){
            return tempoEpisodio;
        }

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0){
            return genero;
        }

        return serie1.getNome().compareTo(serie2.getNome());
    }

}