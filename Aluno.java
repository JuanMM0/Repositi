//ENCAPSULAMENTO

public class Aluno {
    private String Nome;
    private int Idade;
    private double Nota;

    // GET / SET -->Métodos públicos que manipulam os atributos privados

    public String getNome() {

        return Nome;

    }

    public void setNome(String Nome) {

        this.Nome = Nome;

    }

    public int getIdade() {

        return Idade;

    }

    public void setIdade(int Idade) {

        if (Idade >= 0) {

            this.Idade = Idade;

        } else {

            System.out.println("Sua anta, a idade deve ser maior que 0.");

        }

    }

    public double getNota() {

        return Nota;

    }

    public void setNota(double Nota) {

        if (Nota >= 0 && Nota <= 10) {

            this.Nota = Nota;

        } else {

            System.out.println("Nota inválida");

        }

    }

}