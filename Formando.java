public class Formando extends Aluno {
    private int ano;
    public Formando(String nome, int cpf, int matricula, int ano){
        super(nome, cpf, matricula);
        this.ano = ano; 
    }
    public int obterAno(){
        return ano;
    }
}
