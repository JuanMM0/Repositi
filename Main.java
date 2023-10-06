public class Main {
    public static void main(String[] args) {

        ProdutoEletronico eletronico1 = new ProdutoEletronico("Smartphone", 999.99, 12);
        System.out.println("\nProduto Eletrônico 1:");
        System.out.println(eletronico1);

        ProdutoAlimenticio alimenticio1 = new ProdutoAlimenticio("Leite", 2.49, "2023-12-31");
        System.out.println("\nProduto Alimentício 1:");
        System.out.println(alimenticio1);
    }
}
