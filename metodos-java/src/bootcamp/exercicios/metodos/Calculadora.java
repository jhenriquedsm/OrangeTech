package bootcamp.exercicios.metodos;
public class Calculadora {
    
    public static void soma(double a, double b){
        double resultado = a + b;
        System.out.println(a + " + " + b + " = " + resultado);
    }

    public static void sub(double a, double b){
        double resultado = a - b;
        System.out.println(a + " - " + b + " = " + resultado);
    }

    public static void mult(double a, double b){
        double resultado = a * b;
        System.out.println(a + " * " + b + " = " + resultado);
    }

    public static void div(double a, double b){
        double resultado = a / b;
        System.out.println(a + " / " + b + " = " + resultado);
    }

}
