import java.util.List;

public class Stock {

    public static List<Libro> librosStock;
    public static Libro principito = new Libro(true, false, true, "Principito", 1231, 12);

    public List<Libro> getLibrosStock() {
        return librosStock;
    }

    public void setLibrosStock(List<Libro> librosStock) {
        this.librosStock = librosStock;
    }

    public static void agregarLibro(){
        librosStock.add(principito);
    }
}
