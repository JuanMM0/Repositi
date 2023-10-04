public class Aluno extends Pessoa {
    int matricula;
    public Aluno(String nome, int cpf, int matricula){
        super (nome, cpf);
        this.matricula = matricula;
    }
    public int obterMatricula(){
        return matricula;
    }
}
