package ejercicio3;

public class Coche extends Transporte {
    private double combustible;

    public Coche() {
        super("Coche");
        this.combustible = 10;
    }

    @Override
    public void mover() {
        System.out.println(nombre + " circula por la carretera.");
    }

    // Capacidad propia del coche, no de todo transporte
    public void cargarCombustible(double litros) {
        combustible += litros;
        System.out.println("Combustible actual: " + combustible + " L");
    }
}
