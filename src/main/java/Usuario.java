

public class Usuario {
    private String nombre;
    private String email;
    private String id;
    private String telefono;
    private String apellido;
    private Notificacion notificacion;
    private Libro libroSolicitado;

    public void enviarNotificacion(String mensaje) {
        EnviadorNotificaciones enviadorNotificaciones = EnviadorNotificaciones.getInstancia();
        enviadorNotificaciones.enviarNotificaciones(this.notificacion, mensaje, this);
    }

    public void solicitarLibro(Libro libro){
        if(libro.getCantidadStock() > 0){
            libro.setCantidadStock(libro.getCantidadStock() - 1);
        }
        else{
           libroSolicitado = libro;
        }
    }

    public Libro getLibroSolicitado() {
        return libroSolicitado;
    }

    public void setLibroSolicitado(Libro libroSolicitado) {
        this.libroSolicitado = libroSolicitado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
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
