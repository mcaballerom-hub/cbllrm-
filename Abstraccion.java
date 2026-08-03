import java.util.Scanner;

public class Abstraccion {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = teclado.nextDouble();

        System.out.print("Ingrese el radio del círculo: ");
        double radio = teclado.nextDouble();

        Figura cuadrado = new Cuadrado(lado);
        Figura circulo = new Circulo(radio);

        System.out.println("Área del cuadrado: " + cuadrado.area());
        System.out.println("Área del círculo: " + circulo.area());

        teclado.close();

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

    @Override
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