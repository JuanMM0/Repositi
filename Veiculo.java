import java.util.ArrayList;
import java.util.List;

abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double quantidadeCombustivel;
    private double precoDiaria;
    
    

    public Veiculo(String marca, String modelo, int ano, double quantidadeCombustivel, double precoDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.precoDiaria = precoDiaria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }


    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Combustível: " + quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(double litros) {
    }
}

class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, double quantidadeCombustivel, int numeroPortas, double precoDiaria) {
        super(marca, modelo, ano, quantidadeCombustivel, precoDiaria);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

   

    @Override
    public String toString() {
        return super.toString() + ", Número de Portas: " + numeroPortas;
    }
}

class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, double quantidadeCombustivel, int cilindrada, double precoDiaria) {
        super(marca, modelo, ano, quantidadeCombustivel, precoDiaria);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + cilindrada;
    }
}

interface OperacoesVeiculo {
    void alugarVeiculo(Veiculo veiculo);

    void devolverVeiculo();

    void abastecerVeiculo(double quantidade);

    void consultarInformacoes();

    double calcularAluguel(int dias);
}

class Cliente implements OperacoesVeiculo {
    private String nome;
    private int idade;
    private Veiculo veiculoAlugado;
    private double valorTotalAluguel;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void alugarVeiculo(Veiculo veiculo) {
        if (veiculoAlugado == null) {
            veiculoAlugado = veiculo;
            System.out.println("Veículo alugado: " + veiculo);
        } else {
            System.out.println("Você já possui um veículo alugado.");
        }
    }

    @Override
    public void devolverVeiculo() {
        if (veiculoAlugado != null) {
            System.out.println("Veículo devolvido: " + veiculoAlugado);
            veiculoAlugado = null;
        } else {
            System.out.println("Você não possui um veículo alugado para devolver.");
        }
    }
  @Override
    public void abastecerVeiculo(double quantidade) {
    if (veiculoAlugado != null) {
        double combustivelAtual = veiculoAlugado.getQuantidadeCombustivel();
        veiculoAlugado.setQuantidadeCombustivel(combustivelAtual + quantidade);
        System.out.println("Veículo abastecido. Novo nível de combustível: " + veiculoAlugado.getQuantidadeCombustivel());
    } else {
        System.out.println("Você não possui um veículo alugado para abastecer.");
    }
}


    @Override
    public void consultarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (veiculoAlugado != null) {
            System.out.println("Veículo alugado: " + veiculoAlugado);
        } else {
            System.out.println("Não há veículo alugado no momento.");
        }
    }

    @Override
    public double calcularAluguel(int dias) {
        if (veiculoAlugado != null) {
            valorTotalAluguel = veiculoAlugado.getPrecoDiaria() * dias;
            System.out.println("Valor total do aluguel: R$" + valorTotalAluguel);
            return valorTotalAluguel;
        } else {
            System.out.println("Você não possui um veículo alugado para calcular o valor do aluguel.");
            return 0.0;
        }
    }
}

class Locadora {
    List<Veiculo> veiculos;
    List<Cliente> clientes;

    public Locadora() {
        veiculos = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo cadastrado: " + veiculo);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado: " + cliente.getNome());
    }

    public void alugarVeiculo(Cliente cliente, Veiculo veiculo) {
        cliente.alugarVeiculo(veiculo);
    }

    public void devolverVeiculo(Cliente cliente) {
        cliente.devolverVeiculo();
    }

    public void abastecerVeiculo(Cliente cliente, double quantidade) {
        cliente.abastecerVeiculo(quantidade);
    }

    public void consultarInformacoes(Cliente cliente) {
        cliente.consultarInformacoes();
    }

    public void listarClientes() {System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }
}

