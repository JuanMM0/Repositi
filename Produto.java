public class Produto {
    /* Atributos privados que armazenam o nome do produto, seu preço e a quantidade em estoque,
     respectivamente. */
    private String nome;
    private double preco;
    private int quantiEstoque;

    /*  O construtor Produto é usado para criar um objeto Produto com valores iniciais
     para esses atributos. */
    public Produto(String nome, double preco, int quantiEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantiEstoque = quantiEstoque;
    }

    /* Métodos GET para acessar os valores dos meus atributos, usando do return para devolver esses mesmos
     valores */
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantiaEstoque() {
        return quantiEstoque;
    }

    /*  Método para calcular o valor total em estoque, calcula o valor total em estoque multiplicando 
    o preço pelo número em estoque.
    */
    public double calcularValor() {
        return preco * quantiEstoque;
    }
}

  