abstract class Veiculo {
    protected String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }
    public abstract double calVLMax();
    public abstract void imprimirDescricao();
}
class Carro extends Veiculo {
    private double potencia;

    public Carro(String marca, double potencia) {
        super(marca);
        this.potencia = potencia;
    }
    @Override
    public double calVLMax() {
        // Exemplo de cálculo de velocidade máxima para um carro
        return potencia * 2.0;
    }
    @Override
    public void imprimirDescricao() {
        System.out.println("Carro da marca " + marca);
    }
}
class Bicicleta extends Veiculo {
    private int forcaCiclista;

    public Bicicleta(String marca, int forcaCiclista) {
        super(marca);
        this.forcaCiclista = forcaCiclista;
    }
    @Override
    public double calVLMax() {
        // Exemplo de cálculo de velocidade máxima para uma bicicleta
        return forcaCiclista * 0.2;
    }
    @Override
    public void imprimirDescricao() {
        System.out.println("Bicicleta da marca " + marca);
    }
}