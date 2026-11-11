package ejercicio1;

public class Rectangulo extends Figura {
    private final double ancho;
    private final double alto;

    public Rectangulo(double ancho, double alto) {
        if (ancho <= 0 || alto <= 0)
            throw new IllegalArgumentException("Lados positivos");
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
