package ejercicio1.antes;

import java.io.FileWriter;
import java.io.IOException;

public class LibroMonolitico {
    private String titulo;
    private String autor;
    private int paginas;

    public LibroMonolitico(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Responsabilidad 1: información del libro
    public String getTitulo() { return titulo; }
    public String getAutor()  { return autor; }
    public int getPaginas()   { return paginas; }

    // Responsabilidad 2: generación de reportes
    public String generarReporte() {
        return "LIBRO\nTítulo: " + titulo + "\nAutor: " + autor
                + "\nPáginas: " + paginas;
    }

    // Responsabilidad 3: persistencia
    public void guardarEnArchivo(String ruta) throws IOException {
        try (FileWriter fw = new FileWriter(ruta)) {
            fw.write(titulo + ";" + autor + ";" + paginas);
        }
    }
}
