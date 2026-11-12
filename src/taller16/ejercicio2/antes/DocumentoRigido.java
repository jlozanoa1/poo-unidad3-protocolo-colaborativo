package ejercicio2.antes;

public class DocumentoRigido {
    private String contenido;

    public DocumentoRigido(String contenido) {
        this.contenido = contenido;
    }

    public void exportarPDF() {
        System.out.println("Exportando a PDF: " + contenido);
    }
}
