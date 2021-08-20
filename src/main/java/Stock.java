import java.util.List;

public class Stock {

    private List<Libro> librosStock;


    public List<Libro> getLibrosStock() {
        return librosStock;
    }

    public void setLibrosStock(List<Libro> librosStock) {
        this.librosStock = librosStock;
    }

    public void agregarLibro(Libro libro){
        librosStock.add(libro);
    }
}
