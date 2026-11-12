package ejercicio3;

public class ServicioAutenticacion {
    public boolean autenticar(Usuario usuario, String correo, String password) {
        return usuario.getCorreo().equals(correo)
                && usuario.getPassword().equals(password);
    }
}
