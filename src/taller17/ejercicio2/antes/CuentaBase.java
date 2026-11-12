package ejercicio2.antes;

public class CuentaBase {
    protected double saldo;

    public CuentaBase(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto > saldo)
            throw new IllegalStateException("Fondos insuficientes");
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}
