public class TextoNumero {

    public static void main(String[] args) {

        String texto = "Hola";

        try {
            int numero = Integer.parseInt(texto);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir el texto a número.");
        }

    }
}