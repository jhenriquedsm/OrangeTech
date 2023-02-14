import java.util.Scanner;

public class MesesIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número de 1 a 12: ");
        int mes = scanner.nextInt();

        if(mes == 1 || mes == 6 || mes == 12){
            System.out.println("FÉRIAS!");
        } else {
            System.out.println("Não é férias!");
        }

        scanner.close();
    }
}
