import java.util.Scanner;

public class Texto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String texto = sc.nextLine();

        try {
            if (texto.trim().isEmpty()) {
                throw new MiExcepcion("El texto no puede estar vacío");
            }
            System.out.println("Texto válido: " + texto);
        } catch (MiExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}