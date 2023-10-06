public class Produto {
    private String nome;
    private double preco;
    /*Duas váriaveís que fazem com que o código funcione*/

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        /*Este é o construtor da classe Produto. Ele permite criar um objeto Produto e inicializa os 
        campos nome e preco com os valores fornecidos como argumentos ao criar um novo objeto.*/

    }
    public String getNome() {
        return nome;
        /*Retorna o nome do produto. */
    }
    public double getPreco() {
        return preco;
        /* Retorna o preço do produto. */
    }
    public void setNome(String nome) {
        this.nome = nome;
        /* Define o nome do produto. */
    }
    public void setPreco(double preco) {
        this.preco = preco;
        /*Define o preço do produto. */
    }
    public String toString() {
        return "Nome: " + nome + "\nPreço: R$" + String.format("%.2f", preco);
        /*Este método substitui o método toString da classe Object e retorna uma representação 
        formatada em string do objeto Produto. Ele retorna uma string que inclui o nome e o preço 
        do produto formatado com duas casas decimais */
    }
}
