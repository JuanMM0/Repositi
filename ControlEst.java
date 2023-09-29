import java.util.Scanner;
public class ControlEst {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();
        int opcao;

        do {

            System.out.println("=== Sistema de Controle de Estoque ===");
            System.out.println("1. Adicionar Item ao Estoque");
            System.out.println("2. Atualizar Item no Estoque");
            System.out.println("3. Consultar Item no Estoque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome do Item: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço por Unidade: ");
                    double precoPorUnidade = sc.nextDouble();

                    System.out.print("Quantidade Disponível: ");
                    int quantidade = sc.nextInt();

                    sc.nextLine();

                    ItemEstoque item = new ItemEstoque(nome, precoPorUnidade, quantidade);
                    estoque.adicionarItem(item);
                    System.out.println("Item adicionado ao estoque.");

                    break;

                case 2:

                    System.out.print("Nome do Item a ser atualizado: ");
                    String nomeAtualizar = sc.nextLine();
                    ItemEstoque itemAtualizar = estoque.consultarItem(nomeAtualizar);

                    if (itemAtualizar != null) {

                        System.out.print("Novo Preço por Unidade: ");
                        double novoPreco = sc.nextDouble();

                        System.out.print("Nova Quantidade Disponível: ");
                        int novaQuantidade = sc.nextInt();

                        sc.nextLine(); // Limpa o buffer do teclado

                        itemAtualizar.setPrecoPorUnidade(novoPreco);
                        itemAtualizar.setQuantidadeDisponivel(novaQuantidade);
                        System.out.println("Item atualizado com sucesso.");

                    } else {

                        System.out.println("Item não encontrado no estoque.");
                    }

                    break;

                case 3:

                    System.out.print("Nome do Item a ser consultado: ");
                    String nomeConsultar = sc.nextLine();
                    ItemEstoque itemConsultado = estoque.consultarItem(nomeConsultar);

                    if (itemConsultado != null) {

                        System.out.println("Nome: " + itemConsultado.getNome());
                        System.out.println("Preço por Unidade: " + itemConsultado.getPrecoPorUnidade());
                        System.out.println("Quantidade Disponível: " + itemConsultado.getQuantidadeDisponivel());

                    } else {

                        System.out.println("Item não encontrado no estoque.");
                    }

                    break;

                case 4:

                    System.out.println("Saindo do Sistema de Controle de Estoque.");

                    break;

                default:

                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (opcao != 4);

        sc.close();
    }
}
class ItemEstoque {

    private String nome;
    private double precoPorUnidade;
    private int quantidadeDisponivel;
    public ItemEstoque(String nome, double precoPorUnidade, int quantidadeDisponivel) {

        this.nome = nome;
        this.precoPorUnidade = precoPorUnidade;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    public String getNome() {
        return nome;
    }
    public double getPrecoPorUnidade() {
        return precoPorUnidade;

    }
    public void setPrecoPorUnidade(double precoPorUnidade) {

        this.precoPorUnidade = precoPorUnidade;
    }
    public int getQuantidadeDisponivel() {

        return quantidadeDisponivel;
    }
    public void setQuantidadeDisponivel(int quantidadeDisponivel) {

        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}