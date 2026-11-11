package ejercicio1;

public class DescuentoFijo implements Descuento {
    private final double monto;

    public DescuentoFijo(double monto) {
        this.monto = monto;
    }

    @Override
    public double aplicar(double precio) {
        return Math.max(0, precio - monto); // el precio no queda negativo
    }
}
