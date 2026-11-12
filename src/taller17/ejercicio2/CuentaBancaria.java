package ejercicio2;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial < 0)
            throw new IllegalArgumentException("Saldo inicial negativo");
        this.saldo = saldoInicial;
    }

    // Contrato: monto > 0; aumenta el saldo en ese monto
    public void depositar(double monto) {
        if (monto <= 0)
            throw new IllegalArgumentException("El monto debe ser positivo");
        saldo += monto;
    }

    // Contrato: monto > 0 y monto <= saldo; reduce el saldo en ese monto
    public void retirar(double monto) {
        if (monto <= 0)
            throw new IllegalArgumentException("El monto debe ser positivo");
        if (monto > saldo)
            throw new IllegalStateException("Fondos insuficientes");
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}
