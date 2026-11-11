package ejercicio2;

public class Documento {
    private final String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    // Recibe cualquier Exportador: la clase no cambia al agregar formatos
    public void exportar(Exportador exportador) {
        exportador.exportar(contenido);
    }
}
