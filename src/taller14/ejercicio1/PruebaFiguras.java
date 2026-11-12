package ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Figura(),
                new Circulo(5),
                new Rectangulo(4, 6)
        };

        for (Figura f : figuras) {
            f.calcularArea();
        }
    }
}
