public class Cuenta {

    private double saldo;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {

        if (cantidad > 0) {
            saldo = saldo + cantidad;
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
        }

    }

    public void retirar(double cantidad) {

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else if (cantidad > saldo) {
            System.out.println("No hay suficiente saldo.");
        } else {
            saldo = saldo - cantidad;
            System.out.println("Retiro realizado.");
        }

    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + saldo);
    }

}