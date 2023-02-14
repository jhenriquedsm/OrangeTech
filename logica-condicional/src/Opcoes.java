import java.util.Scanner;

public class Opcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número de 1 a 5: ");
        int num = scanner.nextInt();

        switch(num){
            case 1:
                System.out.println("CERTO");
                break;
            case 2:
                System.out.println("CERTO");
                break;
            case 3:
                System.out.println("CERTO");
                break;
            case 4:
                System.out.println("ERRADO");
                break;
            case 5:
                System.out.println("TALVEZ");
                break;
            default:
                System.out.println("VALOR INDEFINIDO");
        }
        scanner.close();
    }
}
