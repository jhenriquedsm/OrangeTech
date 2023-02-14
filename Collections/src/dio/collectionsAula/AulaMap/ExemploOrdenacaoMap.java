package AulaMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        // ORDEM ALEATÓRIA:
        Map<String, Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : livros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println();

        // ORDEM INSERÇÃO:
        Map<String, Livro> livros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : livros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println();

        // ORDEM ALFABÉTICA DOS AUTORES:
        Map<String, Livro> livros2 = new TreeMap<>(livros);
        for (Map.Entry<String, Livro> livro : livros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println();

        // ORDEM ALFABÉTICA DOS LIVROS:
        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorNomeLivro());
        livros3.addAll(livros.entrySet());
        for (Map.Entry<String, Livro> livro : livros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println();

        // ORDEM NÚMERO DE PÁGINA:
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorNumeroPaginas());
        livros4.addAll(livros.entrySet());
        for (Entry<String,Livro> livro : livros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }
        System.out.println();
    }
}


class Livro{
    private String nome;
    private Integer paginas;
    
    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
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
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", paginas=" + paginas + "]";
    }
}


class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}

class ComparatorNumeroPaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
        return Integer.compare(livro1.getValue().getPaginas(), livro2.getValue().getPaginas());
    }
}