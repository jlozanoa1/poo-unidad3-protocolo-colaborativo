package ejercicio2;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    @Override
    public void presentarse() {
        System.out.println("Buenos días, soy el profesor " + nombre
                + " y enseño " + materia + ".");
    }
}
