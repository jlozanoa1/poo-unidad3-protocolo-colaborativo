package ejercicio1;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.printf("Área del círculo: %.2f%n", Math.PI * radio * radio);
    }
}
