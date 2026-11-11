package ejercicio1;

import java.io.FileWriter;
import java.io.IOException;

public class RepositorioLibro {
    public void guardar(Libro libro, String ruta) throws IOException {
        try (FileWriter fw = new FileWriter(ruta)) {
            fw.write(libro.getTitulo() + ";" + libro.getAutor()
                    + ";" + libro.getPaginas());
        }
    }
}
