import java.util.Scanner;

public class ThrowManual {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número: ");
            int numero = teclado.nextInt();

            if (numero < 0) {
                throw new Exception("Error: No se permiten números negativos.");
            }

            System.out.println("Número ingresado: " + numero);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        teclado.close();
    }
}