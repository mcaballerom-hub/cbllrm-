import java.util.Scanner;

public class LongitudTexto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try{

            System.out.print("Ingrese un texto: ");
            String texto = teclado.nextLine();

            if(texto.length() < 5){
                throw new Exception("El texto es muy corto.");
            }

            System.out.println("Texto aceptado.");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        teclado.close();

    }

}