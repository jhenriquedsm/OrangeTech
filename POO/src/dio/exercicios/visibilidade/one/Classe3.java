package dio.exercicios.visibilidade.one;

class Classe3{
    
    Classe1 classe1;

    void metodo(){
        // tem acesso ao atributo 2 e 3 (protected, public) -> tá dentro do mesmo pacote
    }

    // tem acesso aos metodos 2 e 3 (protected, public) -> tá dentro do mesmo pacote
}
