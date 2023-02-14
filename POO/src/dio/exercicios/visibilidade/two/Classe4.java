package dio.exercicios.visibilidade.two;

import dio.exercicios.visibilidade.one.Classe1; // para poder importar a classe pra um package diferente ela precisa estar public

class Classe4 {
    
    Classe1 classe1;

    void metodo(){
        // somente o atributo 3 é visivel, pois é public
    }
    
    // somente o metodo 3 é visivel, pois é public
}
