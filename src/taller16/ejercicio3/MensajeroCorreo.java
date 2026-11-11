package ejercicio3;

public class MensajeroCorreo implements Mensajero {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[Correo] Para " + destinatario + ": " + mensaje);
    }
}
