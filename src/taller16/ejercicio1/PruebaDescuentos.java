package ejercicio1;

public class PruebaDescuentos {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        double precio = 200;

        Descuento porcentaje = new DescuentoPorcentaje(15);
        Descuento fijo = new DescuentoFijo(30);

        System.out.printf("Precio original: $%.2f%n", precio);
        System.out.printf("Con 15%% de descuento: $%.2f%n", tienda.calcularTotal(precio, porcentaje));
        System.out.printf("Con $30 de descuento fijo: $%.2f%n", tienda.calcularTotal(precio, fijo));
    }
}
