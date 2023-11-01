import java.util.Scanner;

public class TestaVeiculo {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Veículos");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Cadastrar cliente");
            System.out.println("3. Alugar veículo");
            System.out.println("4. Devolver veículo");
            System.out.println("5. Abastecer veículo");
            System.out.println("6. Consultar informações");
            System.out.println("7. Listar clientes");
            System.out.println("8. Calcular valor do aluguel");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Cadastrar veículo
                    System.out.print("Marca do veículo: ");
                    String marcaVeiculo = scanner.nextLine();
                    System.out.print("Modelo do veículo: ");
                    String modeloVeiculo = scanner.nextLine();
                    System.out.print("Ano do veículo: ");
                    int anoVeiculo = scanner.nextInt();
                    System.out.print("Quantidade de combustível: ");
                    double quantidadeCombustivel = scanner.nextDouble();
                    System.out.print("Preço da diária: ");
                    double precoDiaria = scanner.nextDouble();

                    System.out.println("Tipo de veículo (1 - Carro, 2 - Moto): ");
                    int tipoVeiculo = scanner.nextInt();
                    scanner.nextLine();

                    Veiculo novoVeiculo;

                    if (tipoVeiculo == 1) {
                        System.out.print("Número de portas: ");
                        int numeroPortas = scanner.nextInt();
                        novoVeiculo = new Carro(marcaVeiculo, modeloVeiculo, anoVeiculo, quantidadeCombustivel, numeroPortas, precoDiaria);
                    } else if (tipoVeiculo == 2) {
                        System.out.print("Cilindrada: ");
                        int cilindrada = scanner.nextInt();
                        novoVeiculo = new Moto(marcaVeiculo, modeloVeiculo, anoVeiculo, quantidadeCombustivel, cilindrada, precoDiaria);
                    } else {
                        System.out.println("Opção inválida. Veículo não cadastrado.");
                        continue;
                    }

                    locadora.cadastrarVeiculo(novoVeiculo);
                    break;

                case 2:
                    // Cadastrar cliente
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Idade do cliente: ");
                    int idadeCliente = scanner.nextInt();
                    scanner.nextLine();
                    Cliente novoCliente = new Cliente(nomeCliente, idadeCliente);
                    locadora.cadastrarCliente(novoCliente);
                    break;

                case 3:
                    // Alugar veículo
                    System.out.print("Nome do cliente: ");
                    String nomeAlugar = scanner.nextLine();
                    System.out.print("Marca do veículo: ");
                    String marcaAlugar = scanner.nextLine();
                    System.out.print("Modelo do veículo: ");
                    String modeloAlugar = scanner.nextLine();

                    Cliente clienteAlugar = null;

                    for (Cliente cliente : locadora.clientes) {
                        if (cliente.getNome().equalsIgnoreCase(nomeAlugar)) {
                            clienteAlugar = cliente;
                            break;
                        }
                    }

                    if (clienteAlugar != null) {
                        Veiculo veiculoAlugar = null;
                        for (Veiculo veiculo : locadora.veiculos) {
                            if (veiculo.getMarca().equalsIgnoreCase(marcaAlugar) && veiculo.getModelo().equalsIgnoreCase(modeloAlugar)) {
                                veiculoAlugar = veiculo;
                                break;
                            }
                        }

                        if (veiculoAlugar != null) {
                            locadora.alugarVeiculo(clienteAlugar, veiculoAlugar);
                        } else {
                            System.out.println("Veículo não encontrado.");
                        }
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 4:
                    // Devolver veículo
                    System.out.print("Nome do cliente: ");
                    String nomeDevolver = scanner.nextLine();
                    Cliente clienteDevolver = null;

                    for (Cliente cliente : locadora.clientes) {
                        if (cliente.getNome().equalsIgnoreCase(nomeDevolver)) {
                            clienteDevolver = cliente;
                            break;
                        }
                    }

                    if (clienteDevolver != null) {
                        locadora.devolverVeiculo(clienteDevolver);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 5:
                    // Abastecer veículo
                    System.out.print("Nome do cliente: ");
                    String nomeAbastecer = scanner.nextLine();
                    System.out.print("Quantidade de combustível: ");
                    double quantidadeAbastecer = scanner.nextDouble();
                    Cliente clienteAbastecer = null;

                    for (Cliente cliente : locadora.clientes) {
                        if (cliente.getNome().equalsIgnoreCase(nomeAbastecer)) {
                            clienteAbastecer = cliente;
                            break;
                        }
                    }

                    if (clienteAbastecer != null) {
                        locadora.abastecerVeiculo(clienteAbastecer, quantidadeAbastecer);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 6:
                    // Consultar informações
                    System.out.print("Nome do cliente: ");
                    String nomeConsultar = scanner.nextLine();
                    Cliente clienteConsultar = null;

                    for (Cliente cliente : locadora.clientes) {
                        if (cliente.getNome().equalsIgnoreCase(nomeConsultar)) {
                            clienteConsultar = cliente;
                            break;
                        }
                    }

                    if (clienteConsultar != null) {
                        locadora.consultarInformacoes(clienteConsultar);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 7:
                    // Listar clientes
                    locadora.listarClientes();
                    break;

                case 8:
                    // Calcular valor do aluguel
                    System.out.print("Nome do cliente: ");
                    String nomeCalcularAluguel = scanner.nextLine();
                    System.out.print("Número de dias de aluguel: ");
                    int diasAluguel = scanner.nextInt();
                    Cliente clienteCalcularAluguel = null;

                    for (Cliente cliente : locadora.clientes) {
                        if (cliente.getNome().equalsIgnoreCase(nomeCalcularAluguel)) {
                            clienteCalcularAluguel = cliente;
                            break;
                        }
                    }

                    if (clienteCalcularAluguel != null) {
                        clienteCalcularAluguel.calcularAluguel(diasAluguel);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 9:
                    // Sair do programa
                    System.out.println("O programa foi encerrado.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
