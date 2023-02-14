package dio.exercicios.metodosclasses;
class Carro{
    String cor;
    String modelo;
    int capacidadeDoTanque;

    // sobrecarga
    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeDoTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeDoTanque(int capacidadeDoTanque){
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    int getCapacidadeDoTanque(){
        return capacidadeDoTanque;
    }

    double valorTotalTanque(double valorCombustivel){
        return capacidadeDoTanque * valorCombustivel;
    }
}