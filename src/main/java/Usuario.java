import java.util.List;

public class Usuario {
    private String nombre;
    private String email;
    private String telefono;
    private String apellido;
    private List<Notificacion> formasNotificacion;

    public void enviarNotificaciones(String mensaje) {
        EnviadorNotificaciones enviadorNotificaciones = EnviadorNotificaciones.getInstancia();
        enviadorNotificaciones.enviarNotificaciones(this.formasNotificacion, mensaje, this);
    }

    public void setNotificacion(List<Notificacion> formasNotificacion) {
        this.formasNotificacion = formasNotificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
