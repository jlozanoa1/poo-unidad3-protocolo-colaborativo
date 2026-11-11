package ejercicio1.antes;

public class DescuentoRigido {
    private double porcentaje;

    public DescuentoRigido(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicar(double precio) {
        return precio - (precio * porcentaje / 100);
    }
}
