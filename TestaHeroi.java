package Flash;

public class TestaHeroi {
    public static void main(String[] args) {
        Flash flash = new Flash();
        Speedster fSpeedster = new Speedster();
        
        System.out.println("\tFlash o super herói da velocidade: \n");
        flash.runFast();
        flash.savePeople();
        flash.useSuperPower();

        System.out.println("\tFlash Reverso\n");
        fSpeedster.runFast();
        fSpeedster.savePeople();
        fSpeedster.useSuperPower();
    }
    
}
