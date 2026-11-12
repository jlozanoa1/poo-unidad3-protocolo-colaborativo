package ejercicio2;

public class ExportadorWord implements Exportador {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a Word (.docx): " + contenido);
    }
}
