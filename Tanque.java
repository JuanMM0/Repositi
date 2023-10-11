public class Tanque {
    public static void main(String[] args) {
        Tartaruga donatelo = new Tartaruga(14);
        Tartaruga miquelangelo = new Tartaruga( 15 );
        Tartaruga leonardo = new Tartaruga(16);
        Tartaruga rafael = new Tartaruga(17);
        System.out.println("Donatelo: "+ donatelo.getIdade());
        System.out.println("Miquelângelo: "+ miquelangelo.getIdade());
        System.out.println("Leonardo: "+ leonardo.getIdade());
        System.out.println("Rafael: "+ rafael.getIdade());

        System.out.println("Comida do Donatelo: " + donatelo.comida);
        donatelo.setIdade(18);
        System.out.println("Idade do MIquelângelo:" + miquelangelo.getIdade());
        //donatelo.comida = "Pizza";
        System.out.println("Comida do Miquelângelo: "+ miquelangelo.comida);
        System.out.println("A comida das tartarugas é: " + Tartaruga.comida);
        System.out.println("Pi: " + Math.PI);
    }
}
