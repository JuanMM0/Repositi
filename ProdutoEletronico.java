public class ProdutoEletronico extends Produto {
    private int garantia;

    public ProdutoEletronico(String nome, double preco, int garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }
    public int getGarantia() {
        return garantia;
    }
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    public String toString() {
        return super.toString() + "\nGarantia: " + garantia + " meses";
    }
}