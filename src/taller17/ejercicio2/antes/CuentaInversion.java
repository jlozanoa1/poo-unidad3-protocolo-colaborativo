package ejercicio2.antes;

public class CuentaInversion extends CuentaBase {
    public CuentaInversion(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto) {
        throw new UnsupportedOperationException("No se puede retirar de esta cuenta");
    }
}
