

public class Reestruturacao {
    public static void main(String[] args) {
        Empregado promovido;
        Empregado e1 = new Empregado("Kaique","Estágiario", 7);
        Empregado e2 = new Empregado("Rafael","Chefe", 3);
        Promocao promocao = new Promocao();
        promovido = promocao.promocao(e1, e2);

        System.out.println("O colaborador " + promovido.getNome() + " foi promovido");
    }
}
