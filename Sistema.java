class Usuario {
    private String nombreUsuario;
    private String contraseña;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() { return nombreUsuario; }
    public String getContraseña() { return contraseña; }
}

class ValidadorUsuario {
    public boolean validar(Usuario usuario) {
        if (usuario.getNombreUsuario() == null || usuario.getNombreUsuario().isEmpty()) {
            System.out.println("El nombre de usuario no puede estar vacío.");
            return false;
        }
        if (usuario.getContraseña() == null || usuario.getContraseña().length() < 6) {
            System.out.println("La contraseña debe tener al menos 6 caracteres.");
            return false;
        }
        return true;
    }
}

class ServicioAutenticacion {
    private ValidadorUsuario validador = new ValidadorUsuario();

    public boolean autenticar(Usuario usuario, String nombreIngresado, String contraseñaIngresada) {
        if (!validador.validar(usuario)) {
            return false;
        }

        if (usuario.getNombreUsuario().equals(nombreIngresado) && usuario.getContraseña().equals(contraseñaIngresada)) {
            System.out.println("Autenticación exitosa. ¡Bienvenido " + usuario.getNombreUsuario() + "!");
            return true;
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
            return false;
        }
    }
}

public class Sistema {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Airi", "abc123");

        ServicioAutenticacion servicio = new ServicioAutenticacion();

        servicio.autenticar(usuario, "Airi", "abc123");

        servicio.autenticar(usuario, "Airi", "xyz999");
    }
}

