package ejercicio3;

import java.util.List;

public class PruebaTransporte {

    // Cliente que solo depende del contrato de Transporte
    static void desplazarTodos(List<Transporte> transportes) {
        for (Transporte t : transportes) {
            t.mover();
        }
    }

    public static void main(String[] args) {
        List<Transporte> flota = List.of(new Bicicleta(), new Coche());
        desplazarTodos(flota);

        // La capacidad exclusiva se usa solo donde existe
        Coche coche = new Coche();
        coche.cargarCombustible(20);
    }
}
