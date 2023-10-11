public class TesteVeiculo {
    public static void main(String[] args) {
     
        System.out.println("Marca: " + Veiculo.marca);
        System.out.println("Modelo: " + Veiculo.modelo);
        Veiculo veiculo = new Veiculo("0413ANF", "Gásosa");
        System.out.println("Número de Chassis: " + veiculo.getNumChassis());
        System.out.println("Combustível: " + veiculo.getCombustivel());
    }
}