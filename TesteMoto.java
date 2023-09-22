import java.util.Scanner;

public class TesteMoto {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        moto yamaha = new moto();
        yamaha.velocidadeMaxima = 120;
        yamaha.velocidadeAtual = 25;

        moto BMW = new moto();
        BMW.velocidadeMaxima = 110;
        BMW.velocidadeAtual = 20;

        moto Hornet = new moto();
        Hornet.velocidadeMaxima = 100;
        Hornet.velocidadeAtual = 15;

        System.out.println("Escolha uma moto (1-Yamaha, 2-Honda, 3-Suzuki): ");
        int escolha = SC.nextInt();

        moto motoSelecionada = null;

        switch (escolha) {
            case 1:
                motoSelecionada = yamaha;
                break;
            case 2:
                motoSelecionada = BMW;
                break;
            case 3:
                motoSelecionada = Hornet;
                break;
            default:
                System.out.println("Opção inválida. Saindo do programa.");
                System.exit(0);
        }

        System.out.println("Velocidade atual da moto selecionada: " + motoSelecionada.velocidadeAtual);

        System.out.println("Quanto você gostaria de acelerar a moto?");
        double quantidadeAceleracao = SC.nextDouble();

        int resultado = motoSelecionada.acelerar(quantidadeAceleracao);

        if (resultado == 0) {
            System.out.println("Você atingiu a velocidade máxima da moto: " + motoSelecionada.velocidadeAtual);
        } else {
            System.out.println("Nova velocidade da moto: " + motoSelecionada.velocidadeAtual);
        }

        SC.nextLine(); // Limpar o buffer
        System.out.println("Qual o tipo de combustível utilizado na moto (Gasolina/Alcool)?");
        String tipoCombustivel = SC.nextLine();

        System.out.println("Tipo de combustível selecionado: " + tipoCombustivel);

        motoSelecionada.buzinar();

        motoSelecionada.desligar();

        SC.close();
    }
}
