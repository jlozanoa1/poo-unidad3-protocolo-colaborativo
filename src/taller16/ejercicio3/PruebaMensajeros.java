package ejercicio3;

import java.util.List;

public class PruebaMensajeros {
    public static void main(String[] args) {
        Notificador notificador = new Notificador(List.of(
                new MensajeroCorreo(),
                new MensajeroSMS(),
                new MensajeroPush()));

        notificador.notificar("Ana", "Tu pedido fue enviado");
    }
}
