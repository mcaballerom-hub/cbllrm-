public class Polimorfismo {

    public static void main(String[] args) {

        Animal[] animales = new Animal[3];

        animales[0] = new Animal();
        animales[1] = new Perro();
        animales[2] = new Gato();

        for (Animal animal : animales) {
            animal.sonido();
        }

    }

}

class Animal {

    public void sonido() {
        System.out.println("El animal hace un sonido.");
    }

}

class Perro extends Animal {


    public void sonido() {
        System.out.println("El perro dice: Guau Guau");
    }

}

class Gato extends Animal {

    
    public void sonido() {
        System.out.println("El gato dice: Miau");
    }

}