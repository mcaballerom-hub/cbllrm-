import java.util.Scanner;

public class MetodoExcepcion {

    static void dividir(int a, int b) {

        try {
            int resultado = a / b;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero.");
        }

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = teclado.nextInt();

        dividir(numero1, numero2);

        teclado.close();
    }
}