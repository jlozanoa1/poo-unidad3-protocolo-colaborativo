package ejercicio3;

public class PruebaIncorrecta {
    public static void main(String[] args) {
        Animal a = new Perro();

        a.hacerSonido();

        // No compila
        // a.moverCola();
    }
}
