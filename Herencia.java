public class Herencia {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.sonido();

        Perro perro = new Perro();
        perro.sonido();

    }

}

class Animal {

    public void sonido() {
        System.out.println("El animal hace un sonido.");
    }

}

class Perro extends Animal {

    @Override
    public void sonido() {
        System.out.println("El perro dice: Guau Guau");
    }

}