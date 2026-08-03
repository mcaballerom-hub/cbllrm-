public class MensajeExcepcion {

    public static void main(String[] args) {

        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al acceder al arreglo.");
        }

    }
}