public class Estoque {

    private ItemEstoque[] itens;
    private int tamanho;

    public Estoque() {

        itens = new ItemEstoque[100];
        tamanho = 0;

    }
    public void adicionarItem(ItemEstoque item) {

        itens[tamanho] = item;
        tamanho++;

    }
    public ItemEstoque consultarItem(String nome) {

        for (int i = 0; i < tamanho; i++) {

            if (itens[i].getNome().equalsIgnoreCase(nome)) {

                return itens[i];
            }
        }
        return null;
    }
}