package dio.exceptionsJava;

import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            continueLooping = false;
        } catch (NumberFormatException e){
            // e.printStackTrace(); // aqui imprime a exception
            JOptionPane.showMessageDialog(null, "Entrada Inválida! Informe um número inteiro. " + e.getMessage());
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
        } finally {
            System.out.println("Chegou no finally!");
        }
        } while(continueLooping);

    
        System.out.println("O código continua aqui");
        
    }

    public static int dividir(int a, int b){
        return a / b;
    }
}