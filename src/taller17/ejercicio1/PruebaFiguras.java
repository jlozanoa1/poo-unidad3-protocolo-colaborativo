package ejercicio1;

public class PruebaFiguras {

    // Código cliente: funciona con cualquier Figura sin conocer su tipo concreto
    static double areaTotal(Figura[] figuras) {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularArea();
        }
        return total;
    }

    public static void main(String[] args) {
        Figura[] figuras = {
                new Circulo(5),
                new Rectangulo(4, 6),
                new Cuadrado(3)
        };

        for (Figura f : figuras) {
            System.out.printf("%s -> %.2f%n", f.getClass().getSimpleName(), f.calcularArea());
        }
        System.out.printf("Área total: %.2f%n", areaTotal(figuras));
    }
}
