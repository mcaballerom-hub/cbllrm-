import java.util.Scanner;

public class DivisionSegura {
    static int dividir(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("No se puede dividir entre cero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número (dividendo): ");
        int a = sc.nextInt();

        System.out.print("Ingresa el segundo número (divisor): ");
        int b = sc.nextInt();

        try {
            System.out.println("Resultado: " + dividir(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}