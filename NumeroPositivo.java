import java.util.Scanner;

public class NumeroPositivo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número positivo: ");
            int numero = teclado.nextInt();

            if(numero < 0){
                throw new Exception("El número no puede ser negativo.");
            }

            System.out.println("Número correcto.");

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        teclado.close();

    }

}