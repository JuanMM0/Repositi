public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public ProdutoAlimenticio(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }
    public String getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    public String toString() {
        return super.toString() + "\nData de Validade: " + dataValidade;
        /*Este método sobrescreve o método toString da superclasse Produto. Ele chama primeiro o método 
        toString da superclasse (usando super.toString()) para obter a representação de string dos campos
        herdados (nome e preço) e, em seguida, adiciona a data de validade ao final da representação de
        string. */
    }
}