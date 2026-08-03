public class MetodoNegativo {

    static void validar(int numero) throws Exception {

        if(numero < 0){
            throw new Exception("Número negativo.");
        }

    }

    public static void main(String[] args) {

        try{
            validar(-8);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}