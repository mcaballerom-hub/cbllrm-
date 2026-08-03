public class Interfaces {

    public static void main(String[] args) {

        Vehiculo carro = new Carro();
        Vehiculo moto = new Moto();

        carro.arrancar();
        moto.arrancar();

    }

}

interface Vehiculo {

    void arrancar();

}

class Carro implements Vehiculo {

    public void arrancar() {
        System.out.println("El carro arrancó.");
    }

}

class Moto implements Vehiculo {

    public void arrancar() {
        System.out.println("La moto arrancó.");
    }

}