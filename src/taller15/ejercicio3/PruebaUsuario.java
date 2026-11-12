package ejercicio3;

public class PruebaUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("Ana", "ana@correo.com", "clave12345");

        ValidadorUsuario validador = new ValidadorUsuario();
        ServicioAutenticacion auth = new ServicioAutenticacion();

        System.out.println("¿Datos válidos? " + validador.esValido(u));
        System.out.println("Login correcto: " + auth.autenticar(u, "ana@correo.com", "clave12345"));
        System.out.println("Login incorrecto: " + auth.autenticar(u, "ana@correo.com", "otra"));
    }
}
