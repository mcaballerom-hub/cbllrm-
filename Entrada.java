import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            int numero = teclado.nextInt();
            System.out.println("Número: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Debe ingresar un número entero.");
        }

        teclado.close();
    }
}