package ejercicio2;

public class PruebaCuentas {

    static void operar(CuentaBancaria cuenta) {
        cuenta.depositar(100);
        cuenta.retirar(40);
        System.out.printf("Saldo tras operar: $%.2f%n", cuenta.getSaldo());
    }

    public static void main(String[] args) {
        CuentaBancaria normal = new CuentaBancaria(500);
        CuentaBancaria ahorros = new CuentaAhorros(500, 0.02);

        operar(normal);
        operar(ahorros); // se comporta igual: es sustituible

        ((CuentaAhorros) ahorros).aplicarInteres();
        System.out.printf("Saldo con interés: $%.2f%n", ahorros.getSaldo());
    }
}
