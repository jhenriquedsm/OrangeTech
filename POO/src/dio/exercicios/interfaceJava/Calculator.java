package dio.exercicios.interfaceJava;

public class Calculator implements OperacaoMatematica{

    @Override
    public void sum(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + resultado);
        
    }

    @Override
    public void sub(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resultado);
        
    }

    @Override
    public void mul(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + resultado);
        
    }

    @Override
    public void div(double num1, double num2) {
        double resultado = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + resultado);
        
    }
    
}
