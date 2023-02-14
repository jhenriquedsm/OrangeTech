public class Comentarios {
    public static void main(String[] args) {
        
    }
    /*
     * Este metodo foi elaborado as pressas
     * por isso eu abreviei o nome das variaveis
     * mas olha, ele tem finalidade de somar ou multiplicar dois números
     */

    public int somaMultiplica(int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if(m == "M"){ // M = Multiplicação
            r = n * x;
        } else {
            r = n + x;
        }
        return r;
    }
}
