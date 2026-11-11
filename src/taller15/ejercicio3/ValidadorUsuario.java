package ejercicio3;

public class ValidadorUsuario {
    public boolean esValido(Usuario u) {
        return nombreValido(u.getNombre())
                && correoValido(u.getCorreo())
                && passwordValida(u.getPassword());
    }

    private boolean nombreValido(String nombre) {
        return nombre != null && !nombre.isBlank();
    }

    private boolean correoValido(String correo) {
        return correo != null && correo.contains("@");
    }

    private boolean passwordValida(String password) {
        return password != null && password.length() >= 8;
    }
}
