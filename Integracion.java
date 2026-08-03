import java.util.ArrayList;

public class Integracion {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Cuadrado(5));
        figuras.add(new Circulo(3));

        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.area());
        }

    }

}

abstract class Figura {

    public abstract double area();

}

class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    
    public double area() {
        return lado * lado;
    }

}

class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    public double area() {
        return Math.PI * radio * radio;
    }

}