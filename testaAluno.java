
public class testaAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno(); // Criando o Objeto aluno

        aluno.setNome("Silas Kando");
        aluno.setIdade(16);
        aluno.setNota(8.5);

        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Idade do Aluno: " + aluno.getIdade());
        System.out.println("Nota do Aluno: " + aluno.getNota());

    }

}
