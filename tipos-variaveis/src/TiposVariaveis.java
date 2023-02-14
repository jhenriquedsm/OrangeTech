public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 1320;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting
        System.out.println(numeroCurto2);

        int numero = 5; // -> variavel pode ser alterada
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // -> constante é escrita em letras maiusculas
        System.out.println(VALOR_DE_PI);
    }
}
