

public class Libro {
    public static boolean reservado;
    public static boolean seAlquila;
    public static boolean hayStock;
    public static String titulo;
    public static Integer id;
    public static Integer cantidadStock;

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public boolean isSeAlquila() {
        return seAlquila;
    }

    public void setSeAlquila(boolean seAlquila) {
        this.seAlquila = seAlquila;
    }

    public boolean isHayStock() {
        return hayStock;
    }

    public void setHayStock(boolean hayStock) {
        this.hayStock = hayStock;
    }

    public String getNombre() {
        return titulo;
    }

    public void setNombre(String titulo) {
        this.titulo = titulo;
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
                }
