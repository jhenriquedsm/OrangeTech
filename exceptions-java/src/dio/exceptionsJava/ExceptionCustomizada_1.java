package dio.exceptionsJava;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada_1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        bw.close();
        } catch (impossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro não esperado, por favor, fale com o suporte. " + ex.getMessage());
            ex.printStackTrace();
        } 
        
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws impossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new impossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
        
    }
}

class impossivelAberturaDeArquivoException extends Exception {
    private String nomeDoArquivo;
    private String diretorio;
    public impossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretorio " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "impossivelAberturaDeArquivoException [nomeDoArquivo = '" + nomeDoArquivo + "', diretorio = '" + diretorio + "'"
                + "]";
    } 
}