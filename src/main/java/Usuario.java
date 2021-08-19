import java.util.List;

public class Usuario {
    private String nombreUsuario;
    private String email;
    private String telefono;
    private String nombreCompleto;
    private List<Notificacion> formasNotificacion;

    public void enviarNotificaciones(String mensaje) {
        EnviadorNotificaciones enviadorNotificaciones = EnviadorNotificaciones.getInstancia();
        enviadorNotificaciones.enviarNotificaciones(this.formasNotificacion, mensaje, this);
    }
    public void setNotificacion(List<Notificacion> formasNotificacion) {
        this.formasNotificacion = formasNotificacion;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
