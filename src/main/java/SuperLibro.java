import java.util.List;
// Composite
public class SuperLibro implements ILibro{
    private List<Libro> libros;

    @Override
    public Integer precioTotal(){
     return libros.stream().mapToInt(l -> l.precioTotal()).sum();
    };

}
