import java.util.Scanner;

public class Contrasena {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.print("Ingrese una contraseña: ");
            String contrasena = teclado.nextLine();

            if (contrasena.length() < 8) {
                throw new Exception("Error: La contraseña debe tener al menos 8 caracteres.");
            }

            System.out.println("Contraseña válida.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        teclado.close();
    }
}