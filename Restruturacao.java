public class Restruturacao {
    public static void main(String[] args) {
        boolean promovido;
        Promocao promocao = new Promocao();
        Empregado e = new Empregado("Bruno Rocha", 4000, "Artista",
                18, 3);
        promovido = promocao.promocao(e);

        if (promovido == true) {
            System.out.println("O colaborador " + e.getNome() + "foi promovido.");
        } else {
            System.out.println("O cobrador " + e.getNome() + "não foi promovido.");
        }
    }
}
