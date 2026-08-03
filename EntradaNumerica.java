import java.util.Scanner;

public class EntradaNumerica {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = teclado.nextInt();
            System.out.println("Número: " + numero);
        } catch (Exception e) {
            System.out.println("Debe ingresar un número.");
        }

        teclado.close();
    }
}