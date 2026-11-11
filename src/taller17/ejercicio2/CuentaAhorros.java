package ejercicio2;

public class CuentaAhorros extends CuentaBancaria {
    private final double tasaInteres; // por ejemplo 0.02 = 2 %

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    // Comportamiento adicional: no altera lo que ya prometía la base
    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
    }

    // depositar() y retirar() se heredan sin cambios:
    // las mismas reglas, sin restricciones nuevas
}
