package ejercicio3;

import java.util.List;

public class Notificador {
    private final List<Mensajero> canales;

    public Notificador(List<Mensajero> canales) {
        this.canales = canales;
    }

    public void notificar(String destinatario, String mensaje) {
        for (Mensajero canal : canales) {
            canal.enviar(destinatario, mensaje);
        }
    }
}
