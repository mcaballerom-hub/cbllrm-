public class Ejercicio15 {
    public static void main(String[] args) {
        try {
            throw new MiExcepcion("Excepción lanzada manualmente");
        } catch (MiExcepcion e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}