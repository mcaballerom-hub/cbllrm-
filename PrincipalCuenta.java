import java.util.Scanner;

public class PrincipalCuenta {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el saldo inicial: Q");
        double saldoInicial = teclado.nextDouble();

        Cuenta cuenta = new Cuenta(saldoInicial);

        int opcion;

        do {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Cantidad a depositar: Q");
                    double deposito = teclado.nextDouble();
                    cuenta.depositar(deposito);
                    break;

                case 2:
                    System.out.print("Cantidad a retirar: Q");
                    double retiro = teclado.nextDouble();
                    cuenta.retirar(retiro);
                    break;

                case 3:
                    cuenta.mostrarSaldo();
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");

            }

        } while (opcion != 4);

        teclado.close();

    }

}