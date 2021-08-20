

public class Libro implements ILibro {
    private boolean estaAlquilado = false;
    public boolean reservado;
    public boolean hayStock;
    public static String titulo;
    public Integer id;
    public Integer cantidadStock;
    public Integer valor;
    public Integer impuesto;

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
    public Integer calcularPrecio() {
        return valor + impuesto;
    }
}
