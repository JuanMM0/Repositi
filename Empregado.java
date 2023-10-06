

public class Empregado {
    private static String nome = "Zé Ruela";
    private String cargo;
    private int tempoDeCasa;
    //private static String empresa = "SENAI";

    public Empregado(String nome, String cargo,int tempoDeCasa) {
        this.nome = nome;
        this.cargo= cargo;
        this.tempoDeCasa = tempoDeCasa;
    }

    public String getNome() {
        return nome;
    }
   

    public String getCargo() {
        return cargo;
    }


    public int getTempoDeCasa() {
        return tempoDeCasa;
    }
}
