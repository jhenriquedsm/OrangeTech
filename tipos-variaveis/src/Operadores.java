public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero);

        numero = -5;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        boolean positivo = numero >= 0;
        System.out.println(positivo);

        positivo = !positivo;
        System.out.println(positivo);

        // operador ternário
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        String nomeUm = "HENRIQUE";
        String nomeDois = new String("HENRIQUE");
        System.out.println(nomeUm.equals(nomeDois));
    }   
}