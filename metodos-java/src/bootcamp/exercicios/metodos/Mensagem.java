package bootcamp.exercicios.metodos;
public class Mensagem {
    
    public static void obterMensagem(int hora){
        if(hora >= 0 && hora < 5){
            System.out.println("Boa Madrugada!");
        } else if(hora >= 5 && hora < 13){
            System.out.println("Bom dia!");
        } else if(hora >= 13 && hora < 18){
            System.out.println("Boa tarde!");
        } else if(hora >= 18 && hora <= 23){
            System.out.println("Boa noite!");
        } else{
            System.out.println("Valor Inválido");
        }
    }
}
