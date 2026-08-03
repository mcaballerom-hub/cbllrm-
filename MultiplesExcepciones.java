import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplesExcepciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};

        try {

            System.out.println("El arreglo tiene posiciones del 0 al 4.");
            System.out.print("Ingrese el índice que desea consultar: ");
            int indice = teclado.nextInt();

            System.out.println("El valor es: " + numeros[indice]);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El índice está fuera del rango del arreglo.");
        }

        teclado.close();
    }
}