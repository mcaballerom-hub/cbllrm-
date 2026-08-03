import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};

        try {

            System.out.println("El arreglo tiene 5 posiciones (0 a 4).");
            System.out.print("Ingrese el indice que desea consultar: ");
            int indice = teclado.nextInt();

            System.out.println("El valor es: " + numeros[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El indice esta fuera del rango del arreglo.");
        }

        teclado.close();
    }
}