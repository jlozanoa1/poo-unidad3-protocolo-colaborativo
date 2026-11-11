package ejercicio1;

public class Tienda {
    public double calcularTotal(double precio, Descuento descuento) {
        return descuento.aplicar(precio);
    }
}
