import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.println("===== MENÚ =====");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola!");
                    break;
                case 2:
                    System.out.println(java.time.LocalDate.now());
                    break;
                case 3:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número.");
        }

        teclado.close();
    }
}