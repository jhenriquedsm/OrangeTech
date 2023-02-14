package dio.exercicios.herança.funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente(); // upcast  
        gerente.setNome("José");

        Funcionario vendedor = new Vendedor(); // upcast
        vendedor.setNome("Lorenzo");

        Funcionario faxineiro = new Faxineiro(); // upcast
        faxineiro.setNome("Théo");  

        Gerente gerente2 = new Gerente();
        gerente2.setNome("Gabriel");

        // Vendedor vendedor_ = (Vendedor) new Funcionario(); // downcast
    }
}
