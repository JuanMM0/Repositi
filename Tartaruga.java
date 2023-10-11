public class Tartaruga {
    public static String comida = "Comida de tartaruga";
    private int idade;
    public int numDoTanque;
    public static int numDeTanques = 4;

    public Tartaruga(int idade){
        this.idade = idade;
        numDoTanque = (int) ((Math.random() * numDeTanques) + 1);
    }
    public int getIdade() {
       return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public static String aquario(){
        return "Eu tenho " + numDeTanques + "tanques.";
    }
}