public class Circulo extends Figura{//Herança
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    //Cálculo de área do Círculo
    //Sobreposição do método da Superclasse

    public double calcularArea(){
        double area = 0;
        area = 3.14*(raio*raio);
        return area;
    }
    
}
