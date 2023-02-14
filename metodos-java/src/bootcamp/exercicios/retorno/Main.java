package bootcamp.exercicios.retorno;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Retorno: ");

        double areaQuadrado = Quadrilatero2.area(20);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(10d, 20d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(10, 11, 12);
        System.out.println("Área do trapézio: " + areaTrapezio);

        double areaLosango = Quadrilatero2.area(10f, 20f);
        System.out.println("Área do losango: " + areaLosango);
        
    }
}
