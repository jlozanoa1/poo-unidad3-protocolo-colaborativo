package ejercicio1;

public class Cuadrado extends Figura {
    private final double lado;

    public Cuadrado(double lado) {
        if (lado <= 0)
            throw new IllegalArgumentException("El lado debe ser positivo");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
