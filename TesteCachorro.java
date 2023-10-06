public class TesteCachorro {
    public static void main(String[] args) {

        Cachorro mike = new Cachorro(7, 2, "ruferrufe");
        Cachorro tiquetique = new Cachorro(3.5, 12);
        Cachorro tiqueuique = new Cachorro();

        System.out.println(mike.getlatido());
        System.out.println(tiquetique.getlatido());
        System.out.println(tiqueuique.getlatido());
    }
}