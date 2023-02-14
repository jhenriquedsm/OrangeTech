package bootcamp.exercicios.sobrecarga;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Quadrilatero: ");
        Quadrilatero.area(20);
        Quadrilatero.area(10d, 20d);
        Quadrilatero.area(10, 11, 12);
        Quadrilatero.area(12f, 14f);
    }
}
