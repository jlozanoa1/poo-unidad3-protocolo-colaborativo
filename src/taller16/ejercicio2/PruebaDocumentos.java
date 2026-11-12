package ejercicio2;

public class PruebaDocumentos {
    public static void main(String[] args) {
        Documento doc = new Documento("Informe trimestral");

        doc.exportar(new ExportadorPDF());
        doc.exportar(new ExportadorWord());
        doc.exportar(new ExportadorExcel());
    }
}
