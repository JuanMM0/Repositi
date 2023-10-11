public class Veiculo {

    public static String marca = "Mercúrio";
    public static String modelo = "Pegaso";
    private String numChassis;
    private String combustivel;

    public Veiculo(String numChassis, String combustivel) {
        this.numChassis = numChassis;
        this.combustivel = combustivel;
    }
    public String getNumChassis() {
        return numChassis;
    }
    public String getCombustivel() {
        return combustivel;
    }
}
