import java.util.List;
// Composite
public class SuperLibro implements ILibro{
    private List<Libro> libros;

    @Override
    public Integer calcularPrecio(){
     return libros.stream().mapToInt(l -> l.calcularPrecio()).sum();
    };

}
