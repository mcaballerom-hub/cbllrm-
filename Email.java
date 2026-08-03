public class Email {

    static void validar(String correo) throws Exception{

        if(!correo.contains("@")){
            throw new Exception("Correo inválido.");
        }

        System.out.println("Correo válido.");

    }

    public static void main(String[] args){

        try{
            validar("lupita@gmail.com");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}