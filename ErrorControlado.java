public class ErrorControlado {

    public static void main(String[] args) {

        try{
            throw new Exception("Este es un error controlado.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}