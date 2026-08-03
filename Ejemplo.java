import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            int numero1 = teclado.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int numero2 = teclado.nextInt();

            int resultado = numero1 / numero2;

            System.out.println("El resultado es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } finally {
            System.out.println("Programa finalizado.");
            teclado.close();
        }

    }
}