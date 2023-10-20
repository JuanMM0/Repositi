public class Triangulo extends Figura{
    double altura;
    double base;

     public Triangulo(double altura, double base){ 
        this.altura = altura;
        this.base = base;

    }
    public double calcularArea(){
        double area = 0;
        area = (base*altura)/2;
        return area;
    }
}

