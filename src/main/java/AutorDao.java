import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AutorDao implements Dao<Autor>{
    private Libro principito = new Libro(false,false,true, 123,
            (new ClaseA()));
    private List<Autor> autores = new ArrayList<>();
    public AutorDao(){
        autores.add(new Autor("Paulo","Cohelo"));

    }
    @Override
    public List<Autor> getAll(){
        return autores;
    }

    @Override
    public void save (Autor autor){
        autores.add(autor);
    }

    @Override
    public void update (Autor autor, String[] params){
        autor.setNombre(Objects.requireNonNull(params[0],"El nombre no puede ser nulo"));
        autor.setApellido(Objects.requireNonNull(params[0], "El apellido no puede ser nulo"));
    }
    @Override
    public void delete(Autor autor) {
        autores.remove(autor);
    }
}
