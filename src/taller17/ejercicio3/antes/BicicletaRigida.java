package ejercicio3.antes;

public class BicicletaRigida extends TransporteRigido {
    @Override
    public void cargarCombustible() {
        throw new UnsupportedOperationException("Las bicicletas no usan combustible");
    }
}
