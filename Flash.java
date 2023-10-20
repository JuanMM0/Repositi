package Flash;

 

// Interface Super Herói

 

interface SuperHero {

    void runFast();

 

    void savePeople();

 

    void useSuperPower();

}

 

// CLasse Flash

 

class Flash implements SuperHero {

 

    @Override

    public void runFast() {

        System.out.println("Flash está correndo em velocidade máxima");

    }

 

    @Override

    public void savePeople() {

        System.out.println("Flash está salvando as pessoas em perigo");

    }

 

    @Override

    public void useSuperPower() {

        System.out.println("Flash está usando seu superpoder de velocidade");

    }

}

 

class Speedster implements SuperHero {

 

    @Override

    public void runFast() {

        System.out.println("O Speedster também está correndo muito rápida");

    }

 

    @Override

    public void savePeople() {

        System.out.println("O Speedster está salvando vidas com a sua velocidade");

    }

 

    @Override

    public void useSuperPower() {

        System.out.println("O Speedster está usando seu superpoder");

    }

 

}