package HP;

public class Pocoes {
    public static void main(String[] args) {
        LovePotion lovePotion = new LovePotion();
        InvibilityPotion invibilityPotion = new InvibilityPotion();
        FireResistencePotion fireResistencePotion = new FireResistencePotion();
        FlyPotion flyPotion = new FlyPotion();

        System.out.println("\t***Preparando Poções***\n");
        System.out.println("Preparando a poção do Amor: \n");
        lovePotion.mix();
        lovePotion.heat();
        lovePotion.drink();

        System.out.println("Preparando a poção de Invisibilidade\n");
        invibilityPotion.mix();
        invibilityPotion.heat();
        invibilityPotion.drink();

        System.out.println("Preparando poção de resistencia a fogo\n");
        fireResistencePotion.mix();
        fireResistencePotion.heat();
        fireResistencePotion.drink();

        System.out.println("Preparando poção de voo\n");
        flyPotion.mix();
        flyPotion.heat();
        flyPotion.drink();
        
    }
    
}
