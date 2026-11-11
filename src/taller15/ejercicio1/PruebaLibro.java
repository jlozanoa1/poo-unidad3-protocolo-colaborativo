package ejercicio1;

import java.io.IOException;

public class PruebaLibro {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);

        ReporteLibro reporte = new ReporteLibro();
        System.out.println(reporte.generar(libro));

        RepositorioLibro repo = new RepositorioLibro();
        try {
            repo.guardar(libro, "libro.txt");
            System.out.println("Libro guardado en libro.txt");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }
}
