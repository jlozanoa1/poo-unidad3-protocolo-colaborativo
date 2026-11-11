package ejercicio3;

public abstract class Transporte {
    protected String nombre;

    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    // Contrato: todo transporte puede moverse
    public abstract void mover();
}
