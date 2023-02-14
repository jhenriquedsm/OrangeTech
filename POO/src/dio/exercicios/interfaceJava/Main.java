package dio.exercicios.interfaceJava;

public class Main {
    public static void main(String[] args) {
        OperacaoMatematica calculator = new Calculator();
        calculator.sum(2, 5);
        calculator.sub(15, 12);
        calculator.mul(5, 2);
        calculator.div(15, 4);
    }
}
