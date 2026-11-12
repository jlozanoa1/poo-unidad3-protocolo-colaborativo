package ejercicio3;

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    // Método exclusivo de Perro
    public void moverCola() {
        System.out.println("El perro mueve la cola.");
    }
}
