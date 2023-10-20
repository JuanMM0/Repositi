
import java.util.Scanner;

public class TestaRangar {
    public static void main(String[] args) {
        System.out.println("\n"+"***It's Morphing Time***\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Ranger verde: \n");
        String nomeVerde = sc.nextLine();
        PowerRanger ranger1 = new PowerRangerVerde(nomeVerde);

        System.out.println("Digite o nome do Ranger preto: \n");
        String nomePreto = sc.nextLine();
        PowerRanger ranger2 = new PowerRangerVerde(nomePreto);

        System.out.println("Digite o nome do Ranger rosa: \n");
        String nomeRosa = sc.nextLine();
        PowerRanger ranger3 = new PowerRangerVerde(nomeRosa);

        System.out.println("Digite o nome do Ranger azul: \n");
        String nomeAzul = sc.nextLine();
        PowerRanger ranger4 = new PowerRangerVerde(nomeAzul);

        System.out.println("Digite o nome do Ranger amarelo: \n");
        String nomeAmarelo = sc.nextLine();
        PowerRanger ranger5= new PowerRangerVerde(nomeAmarelo);

         System.out.println("Digite o nome do Ranger verde: \n");
        String nomeVermelho = sc.nextLine();
        PowerRanger ranger6 = new PowerRangerVermelho(nomeVermelho);

        sc.close();   
        
        ranger1.morfar();
        ranger2.morfar();
        ranger3.morfar();
        ranger4.morfar();
        ranger5.morfar();
        ranger6.morfar();
    }
    
}
