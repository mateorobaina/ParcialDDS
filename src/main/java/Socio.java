import java.util.List;
//Aca se usa patron state
public class Socio extends Usuario {
    private boolean tieneLibroAlquilado;
    private Libro libroAlquilado;

    public Libro getLibroAlquilado() {
        return libroAlquilado;
    }

    public boolean tieneLibroAlquilado() {
        return tieneLibroAlquilado;
    }

    public void setTieneLibroAlquilado(boolean tieneLibroAlquilado) {
        this.tieneLibroAlquilado = tieneLibroAlquilado;
    }

    public void alquilarLibro(Libro libro){
        if(!libro.isAlquilado() && ! tieneLibroAlquilado && libro.isHayStock()){
            this.tieneLibroAlquilado = true;
            this.libroAlquilado = libro;
        }

    }

}
