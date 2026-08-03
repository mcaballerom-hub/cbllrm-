import java.util.InputMismatchException;
import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Ingrese un número entero: ");
                numero = teclado.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Dato inválido. Intente nuevamente.");
                teclado.nextLine();
            }
        }

        System.out.println("Número ingresado: " + numero);

        teclado.close();
    }
}