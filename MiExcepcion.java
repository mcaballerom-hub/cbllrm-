public class MiExcepcion extends Exception {

 
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
    public static void main(String[] args) {
        try {
           
            throw new MiExcepcion("Esta es mi excepción personalizada");
        } catch (MiExcepcion e) {
            System.out.println("Se capturó la excepción: " + e.getMessage());
        }
    }
}