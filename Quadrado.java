public class Quadrado extends Figura{ //Herança
    double lado;

    public Quadrado(double lado){ //Método construtor
        this.lado = lado;

    }
    //Declarando o cálculo de área do quadrado
    //Sobreposiçõ do método da Superclasse

    public double calcularArea(){
        double area = 0;
        area = lado*lado;
        return area;
    }
}
