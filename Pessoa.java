public class Pessoa {
    private String nome;
   private int cpf;

   public Pessoa(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
   }
   public String obterNome(){
        return nome;
   }
   public int obterCPF(){
        return cpf;
   }
}