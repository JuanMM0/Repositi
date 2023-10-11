public class Aquario {
    public static void main(String[] args) {
        System.out.println(Tartaruga.aquario());
        Tartaruga donatelo = new Tartaruga(15);
        System.out.println(Tartaruga.getIdade());
        System.out.println(donatelo.getIdade());
    }
    
}
