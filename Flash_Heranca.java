package Flash;

// Classe Pai - Super Heroi

class SuperHero {

    protected String nome;
    protected int idade;
    protected String descricao;




    public SuperHero(String nome, int idade, String descricao) {
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;
    }

    public void runFast() {
        System.out.println(nome + " está correndo em velocidade máxima.");
    }

    public void savePeople() {
        System.out.println(nome + " está salvando as pessoas em perigo.");
    }

    public void useSuperPower() {
        System.out.println(nome + " está usando seu superpoder de velocidade.");
    }

}

// Classe Flash (Classe Filha)

class Flash extends SuperHero {

    public Flash(String nome, int idade, String descricao) {
        super(nome, idade, descricao);
    }

    @Override

    public void useSuperPower() {
        System.out.println(nome + " está usando seu superpoder de velocidade como o Flash.");
    }
}

// Classe Speedster (Classe Filha)

class Speedster extends SuperHero {

    public Speedster(String nome, int idade, String descricao) {
        super(nome, idade, descricao);
    }




    @Override

    public void useSuperPower() {
        System.out.println(nome + " está usando seu superpoder como um Speedster.");
    }
}
