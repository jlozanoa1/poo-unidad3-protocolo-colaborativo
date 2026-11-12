package ejercicio1.antes;

public class CuadradoMutable extends RectanguloMutable {
    // Para mantenerse cuadrado, cambia ambos lados
    @Override
    public void setAncho(double lado) {
        this.ancho = lado;
        this.alto = lado;
    }

    @Override
    public void setAlto(double lado) {
        this.ancho = lado;
        this.alto = lado;
    }
}
