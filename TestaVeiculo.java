public class TestaVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Chevrolett", 250.0);
        Veiculo bicicleta = new Bicicleta("Monark", 60);

        Veiculo[] veiculos = {carro, bicicleta};
        for (Veiculo veiculo : veiculos) {
            veiculo.imprimirDescricao();
            System.out.println("Velocidade máxima: " + veiculo.calVLMax() + " km/h");
            System.out.println();
        }
    }
}
