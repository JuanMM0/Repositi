import java.util.Scanner;

public class banco {

    private double saldo;
    private String NomeTL;
    private double numConta;

    public banco(double saldo, String NomeTL) {

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O saldo inicial é inválido. O seu saldo deve ser maior que 0");
        }
        this.NomeTL = NomeTL;
    }

    public double consultarSaldo() {

        return saldo;
    }

    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
            System.out.println("Seu depósito de R$" + valor + " foi realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para realizar um depósito");
        }
    }

    public boolean sacar(double valor) {

        if (saldo >= valor && valor > 0) {
            saldo -= valor;
            System.out.println("Seu saque de R$" + valor + " foi realizado com sucesso");
            return true;
        } else {
            System.out.println("Saque inválido. O Saldo foi insuficiente ou o valor é inválido");
            return false;
        }

    }

    public void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        while (!sair) {
            System.out.println("\n======== MENU ========");
            System.out.println("1 - Consultar Extrato");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    double saldo = consultarSaldo();
                    System.out.println("O Seu saldo atual da conta: R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Digite aqui o valor a ser sacado: ");
                    double valSaque = sc.nextDouble();
                    sacar(valSaque);
                    break;
                case 3:
                    System.out.print("Digite aqui o valor a ser depositado: ");
                    double valDeposito = sc.nextDouble();
                    depositar(valDeposito);
                    break;
                case 4:
                    sair = true;
                    System.out.println("Obrigado por usar o SENAI BANK!");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
        sc.close();
    }

    public void exibirInformacoes() {
        System.out.println("======== SENAI BANK ========");
        System.out.println("Titular da conta: " + NomeTL);
        System.out.println("Número da Conta: " + numConta);
        System.out.println("Saldo atual da Conta: R$ " + saldo);
    }
}