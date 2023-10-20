abstract class StarWars {

    String nome;

    public StarWars(String nome) {

        this.nome = nome;

    }

    public abstract void execultarAcao();

}

class Jedi extends StarWars {

    public Jedi(String nome) {

        super(nome);

    }

    @Override

    public void execultarAcao() {

        System.out.println(nome + "usa a Força para o lado da luz \n");

    }

}

class Sith extends StarWars {

    public Sith(String nome) {

        super(nome);

    }

    @Override

    public void execultarAcao() {

        System.out.println(nome + "usa a Força para o lado negro \n");

    }

}

class Padawan extends StarWars {

    public Padawan(String nome) {

        super(nome);

    }

    @Override

    public void execultarAcao() {

        System.out.println(nome + "treina para usar a Força \n");

    }

}