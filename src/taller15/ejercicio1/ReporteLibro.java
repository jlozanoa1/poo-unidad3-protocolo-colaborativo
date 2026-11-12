package ejercicio1;

public class ReporteLibro {
    public String generar(Libro libro) {
        return "LIBRO\nTítulo: " + libro.getTitulo()
                + "\nAutor: " + libro.getAutor()
                + "\nPáginas: " + libro.getPaginas();
    }
}
