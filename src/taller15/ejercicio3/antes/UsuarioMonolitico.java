package ejercicio3.antes;

public class UsuarioMonolitico {
    private String nombre;
    private String correo;
    private String password;

    public UsuarioMonolitico(String nombre, String correo, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    // Responsabilidad 1: datos
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    // Responsabilidad 2: validación
    public boolean validarDatos() {
        return nombre != null && !nombre.isBlank()
                && correo != null && correo.contains("@")
                && password != null && password.length() >= 8;
    }

    // Responsabilidad 3: autenticación
    public boolean autenticar(String correoIngresado, String passwordIngresada) {
        return correo.equals(correoIngresado) && password.equals(passwordIngresada);
    }
}
