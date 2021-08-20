

public class Libro implements ILibro {
    private boolean estaAlquilado = false;
    private boolean reservado;
    private boolean hayStock;
    private static String titulo;
    private Integer id;
    private Integer cantidadStock;
    private Integer valor;
    private Clase clase;
    private Autor autor;

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
