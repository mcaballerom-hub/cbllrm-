public class CharAt {
    public static void main(String[] args) {
        String palabra = "Java";

        try {
            char letra = palabra.charAt(10); // posición que no existe
            System.out.println("Letra: " + letra);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: posición fuera de rango en el texto");
        }
    }
}