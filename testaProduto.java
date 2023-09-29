import java.util.Scanner;

public class testaProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*For usado de loop para criar o objeto produto e me permitir colocar os daods de nome, preço e 
         quantia no estoque*/
        for (int i = 0; i < 3; i++) { 
            /*i é minha variável e essa variável é
             usada como um contador que controla quantas vezes o loop será executado. o i < 3 serve para manter o 
             loop ativo e o i++ encrementa a cada vez que roda essa int */
            System.out.println("Digite aqui o nome do produto em estoque:");
            String nome = sc.nextLine();

            System.out.println("Digite aqui o preço do produto:");
            double preco = sc.nextDouble();

            System.out.println("Digite aqui a quantidade em estoque do produto:");
            int quantiEstoque = sc.nextInt();
            sc.nextLine(); 

            Produto produto = new Produto(nome, preco, quantiEstoque);

            System.out.println("= Nome =: " + produto.getNome());
            System.out.println("= Preço =: " + produto.getPreco());
            System.out.println("= Quantidade em Estoque =: " + produto.getQuantiaEstoque());

            double valorTotal = produto.calcularValor();
            System.out.println("= Valor Total em Estoque =: " + valorTotal);

            System.out.println();
        }

        sc.close();
    }
}