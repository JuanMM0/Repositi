public class TestaAluno {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rafaela", 123456789);
        System.out.println(pessoa.obterNome());
        System.out.println(pessoa.obterCPF());

        Aluno aluno = new Aluno("Richard", 987654321, 33334444);
        System.out.println(aluno.obterNome());
        System.out.println(aluno.obterCPF());
        System.out.println(aluno.obterMatricula());

        Formando formando = new Formando("Iza", 2098320983, 20948585, 2024);
        System.out.println(formando.obterNome());
        System.out.println(formando.obterCPF());
        System.out.println(formando.obterMatricula());
        System.out.println(formando.obterAno());

    }
}