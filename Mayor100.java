import java.util.Scanner;

public class Mayor100 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try{

            System.out.print("Ingrese un número: ");
            int numero = teclado.nextInt();

            if(numero <= 100){
                throw new Exception("Debe ser mayor a 100.");
            }

            System.out.println("Número válido.");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        teclado.close();

    }

}