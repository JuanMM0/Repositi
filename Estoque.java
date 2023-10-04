public class Estoque {

    private ItemEstoque[] itens;
    private int tamanho;

    public Estoque() {

        itens = new ItemEstoque[100];
        tamanho = 0;
//Dentro do construtor, cria-se um novo array `itens` com espaço para armazenar 100 objetos `ItemEstoque`. 
//Inicialmente, o estoque começa com capacidade para 100 itens, mesmo que esteja vazio.
    }
    public void adicionarItem(ItemEstoque item) {

        itens[tamanho] = item;
        tamanho++;

    }
    public ItemEstoque consultarItem(String nome) {

        for (int i = 0; i < tamanho; i++) {
//inicia-se um loop `for` que percorre os itens no estoque. O loop começa com `i` igual a 0
// e continua enquanto `i` for menor que `tamanho`. Isso garante que o loop percorra apenas 
//os itens válidos no estoque.
            if (itens[i].getNome().equalsIgnoreCase(nome))
             //verifica-se se o nome do item na posição `i` do array `itens` 
             //(acessado usando `itens[i]`) é igual ao nome fornecido como parâmetro, 
             //ignorando maiúsculas e minúsculas. Se houver uma correspondência, 
             //o código dentro deste bloco é executado. 
            {

                return itens[i];
            }
        }
        return null;
    }
}