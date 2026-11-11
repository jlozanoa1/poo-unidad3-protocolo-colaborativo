package ejercicio3;

public class MensajeroPush implements Mensajero {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[Push] Para " + destinatario + ": " + mensaje);
    }
}
