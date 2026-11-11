package ejercicio2;

public class PruebaPersonas {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        Persona e = new Estudiante("Laura", "Ingeniería de Sistemas");
        Persona pr = new Profesor("Carlos", "Programación");

        p.presentarse();
        e.presentarse();
        pr.presentarse();
    }
}
