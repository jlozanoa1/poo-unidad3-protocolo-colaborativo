package ejercicio3;

public class MensajeroSMS implements Mensajero {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[SMS] Para " + destinatario + ": " + mensaje);
    }
}
