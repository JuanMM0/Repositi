package HP;

interface Potion{
    void mix();//Mistura
    void heat();//Aquecer
    void drink();//Beber
}

class LovePotion implements Potion{

    @Override //Polimorfismo

    public void mix(){
        System.out.println("Misturando os ingredientes da poção do amor");
    }
    public void heat(){
        System.out.println("Aquecendo a poção no caldeirão com um toque de paixão");
    }
    public void drink(){
        System.out.println("A pessoa que bebeu a poção se APAIXONA profundamente");
    }
    
    //Poção de invisibilidade
}

class InvibilityPotion implements Potion{

    @Override //Polimorfismo

    
    public void mix(){
        System.out.println("Misturando os ingredientes da poção de invisibilidade");
    }
    public void heat(){
        System.out.println("Aquecendo a poção no caldeirão até que ela fique transparente");
    }
    public void drink(){
        System.out.println("A pessoa que bebeu a poção fica invisivel");
    }
}

class FireResistencePotion implements Potion{

     @Override //Polimorfismo

    
    public void mix(){
        System.out.println("Misturando os ingredientes da poção de Resistencia a fogo");
    }
    public void heat(){
        System.out.println("Aquecendo a poção no caldeirão até que a poção fique fervendo");
    }
    public void drink(){
        System.out.println("A pessoa que bebeu a poção fica resistente a fogo");
    }

}

class FlyPotion implements Potion{

     @Override //Polimorfismo

    
    public void mix(){
        System.out.println("Misturando os ingredientes da poção de Voo");
    }
    public void heat(){
        System.out.println("Aquecendo a poção no caldeirão até que a poção fique leve como pena");
    }
    public void drink(){
        System.out.println("A pessoa que bebeu a poção ganha capacidade de voar");
    }

}

public class HarryPotter {

    
}
