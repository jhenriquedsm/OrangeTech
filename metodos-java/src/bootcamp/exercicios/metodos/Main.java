package bootcamp.exercicios.metodos;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Calculadora: ");
        Calculadora.soma(2, 2);
        Calculadora.sub(5, 4);
        Calculadora.mult(5, 10);
        Calculadora.div(3, 2);

        System.out.println();

        System.out.println("Mensagem: ");
        Mensagem.obterMensagem(12);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(20);
        Mensagem.obterMensagem(1);
        
        System.out.println();

        System.out.println("Empréstimo: ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
