package ejercicio2;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p = new Producto("Teclado mecánico", 100.0);

        CalculadoraPrecio calculadora = new CalculadoraPrecio(0.19); // IVA 19 %
        double precioFinal = calculadora.calcularPrecioFinal(p, 0.10); // 10 % de descuento

        EtiquetaProducto etiqueta = new EtiquetaProducto();
        System.out.println(etiqueta.generar(p, precioFinal));
    }
}
