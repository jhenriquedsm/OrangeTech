package dio.exercicios.metodosclasses;
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setCor("Prata");
        System.out.println("Cor do Carro: " + carro.getCor());

        carro.setModelo("Hyundai Creta");
        System.out.println("Modelo do carro: " + carro.getModelo());

        carro.setCapacidadeDoTanque(60);
        System.out.println("Tanque do carro: " + carro.getCapacidadeDoTanque());

        double valorTotal = carro.valorTotalTanque(5.12);
        System.out.println("O valor total para encher o tanque é: R$ " + valorTotal);

        System.out.println();

        Carro carro2 = new Carro("silver", "polo", 45);
        System.out.println("Cor do Carro: " + carro2.getCor());
        System.out.println("Modelo do carro: " + carro2.getModelo());
        System.out.println("Tanque do carro: " + carro2.getCapacidadeDoTanque());
        double valorTotal2 = carro2.valorTotalTanque(5.12);
        System.out.println("O valor total para encher o tanque é: R$ " + valorTotal2);
        
    }
}
