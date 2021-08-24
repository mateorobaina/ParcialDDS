import java.util.List;

public class Autor {
    private String nombre;
    private String apellido;
    private String id;
    private List<Libro> librosCreados;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Libro> getLibrosCreados() {
        return librosCreados;
    }
    public void agregarLibro(Libro libro){
        librosCreados.add(libro);
    }
    public void setLibrosCreados(List<Libro> librosCreados) {
        this.librosCreados = librosCreados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}
