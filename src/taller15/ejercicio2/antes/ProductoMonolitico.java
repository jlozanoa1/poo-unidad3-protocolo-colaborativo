package ejercicio2.antes;

public class ProductoMonolitico {
    private String nombre;
    private double precioBase;

    public ProductoMonolitico(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Responsabilidad 1: datos
    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    // Responsabilidad 2: cálculo de precios
    public double calcularPrecioFinal(double iva, double descuento) {
        return precioBase * (1 - descuento) * (1 + iva);
    }

    // Responsabilidad 3: etiquetas
    public String generarEtiqueta() {
        return "*** " + nombre.toUpperCase() + " ***\nPrecio: $" + precioBase;
    }
}
