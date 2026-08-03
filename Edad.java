import java.util.Scanner;

public class Edad {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.print("Ingrese su edad: ");
            int edad = teclado.nextInt();

            if (edad < 0) {
                throw new Exception("Error: La edad no puede ser negativa.");
            }

            System.out.println("Edad válida: " + edad + " años.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        teclado.close();
    }
}