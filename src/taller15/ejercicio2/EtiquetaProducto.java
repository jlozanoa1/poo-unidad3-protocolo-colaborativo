package ejercicio2;

public class EtiquetaProducto {
    public String generar(Producto producto, double precioFinal) {
        return String.format("*** %s ***%nPrecio: $%.2f",
                producto.getNombre().toUpperCase(), precioFinal);
    }
}
