

public class Libro implements ILibro {
    private boolean estaAlquilado = false;
    private Socio rentador;
    private boolean reservado;
    private boolean hayStock;
    private static String titulo;
    private Integer id;
    private Integer cantidadStock;
    private Integer valor;
    private Clase clase;
    private Autor autor;

    public boolean isEstaAlquilado() {
        return estaAlquilado;
    }

    public Socio getRentador() {
        return rentador;
    }

    public void setRentador(Socio rentador) {
        this.rentador = rentador;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Libro(boolean estaAlquilado, boolean reservado, boolean hayStock, Integer valor, Clase clase) {
        this.estaAlquilado = estaAlquilado;
        this.reservado = reservado;
        this.hayStock = hayStock;
        this.valor = valor;
        this.clase = clase;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isAlquilado() {
        return estaAlquilado;
    }

    public void setEstaAlquilado(boolean estaAlquilado) {
        this.estaAlquilado = estaAlquilado;
    }


    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public boolean isHayStock() {
        return hayStock;
    }

    public void setHayStock(boolean hayStock) {
        this.hayStock = hayStock;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock){
        this.cantidadStock = cantidadStock;
                }

    @Override
    public Integer precioTotal() {
        return valor + clase.impuesto();
    }
}
