public class Empregado {

    private String nome;

    private double salario;

    private String cargo;

    private int idade;

    private int tempoDeCasa;

    public Empregado(String nome, double salario, String cargo, int idade,

            int tempoDeCasa) {

        this.nome = nome;

        this.salario = salario;

        this.cargo = cargo;

        this.idade = idade;

        this.tempoDeCasa = tempoDeCasa;

    }

    public String getNome() {

        return nome;

    }

    public double getSalario() {

        return salario;

    }

    public String getCargo() {

        return cargo;

    }

    public int getIdade() {

        return idade;

    }

    public int getTempoDeCasa() {

        return tempoDeCasa;

    }

}
