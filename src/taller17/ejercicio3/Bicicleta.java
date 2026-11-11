package ejercicio3;

public class Bicicleta extends Transporte {
    public Bicicleta() {
        super("Bicicleta");
    }

    @Override
    public void mover() {
        System.out.println(nombre + " avanza pedaleando.");
    }
}
