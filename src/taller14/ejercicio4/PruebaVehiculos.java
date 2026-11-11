package ejercicio4;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo v; // una sola referencia de tipo Vehiculo

        v = new Coche();
        v.mover();

        v = new Bicicleta();
        v.mover();

        v = new Vehiculo();
        v.mover();
    }
}
