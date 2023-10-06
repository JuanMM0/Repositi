public class Cachorro {

 

    private double peso;

    private int idade;

    private String latido;

 

    public Cachorro(){

        peso = 6;

        idade =4;

        latido ="Au!";

    }

    public Cachorro(double peso, int idade){

        this.peso =peso;

        this.idade =idade;

        latido="norf";

    }

    public Cachorro(double peso, int idade, String latido){

this.peso =peso;

this.idade =idade;

this.latido = latido;

 

       

    }

public double getpeso(){

    return peso;

}

    public int getidade(){

        return idade;

    }

    public String getlatido(){

        return latido;

    }

}

 