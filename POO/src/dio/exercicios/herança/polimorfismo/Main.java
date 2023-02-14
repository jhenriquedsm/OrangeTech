package dio.exercicios.herança.polimorfismo;

public class Main {
    public static void main(String[] args) {
        
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()}; // vetor com a classe mãe e as duas classes filhas

        for (ClasseMae classe : classes){ // foreach
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe : classes) { // foreach -> cada item de classe passa a ser "classe"
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
