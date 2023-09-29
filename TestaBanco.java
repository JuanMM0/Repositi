import java.util.Random;
import java.util.Scanner;

public class TestaBanco {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o nome do cliente: ");
    String nome = sc.nextLine();
    System.out.print("Digite o valor inicial depositado na conta: ");
    double salInicial = sc.nextDouble();

    Random random = new Random();
    random.nextInt(9000);
    banco clienteBanco = new banco(salInicial, nome);
    clienteBanco.exibirInformacoes();
    clienteBanco.exibirMenu();
    sc.close();
  }
}