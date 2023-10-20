package Flash;

public class TestaHeranca {

    public static void main(String[] args) {

        SuperHero flash = new Flash("Flash", 30, "Super-herói mais rápido do mundo");
        SuperHero flashReverso = new Speedster("Flash Reverso", 35, "Inimigo do Flash");

        System.out.println("\t" + flash.nome + " " + flash.descricao + "\n");
        flash.runFast();
        flash.savePeople();
        flash.useSuperPower();

        System.out.println("\n\t" + flashReverso.nome + " " + flashReverso.descricao + "\n");
        flashReverso.runFast();
        flashReverso.savePeople();
        flashReverso.useSuperPower();
    }
}
