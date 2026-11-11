package ejercicio2;

public class CalculadoraPrecio {
    private final double iva;

    public CalculadoraPrecio(double iva) {
        this.iva = iva;
    }

    public double calcularPrecioFinal(Producto producto, double descuento) {
        double conDescuento = producto.getPrecioBase() * (1 - descuento);
        return conDescuento * (1 + iva);
    }
}
