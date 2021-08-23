import com.twilio.Twilio;

public class EnviadorNotificaciones {

    private static final String ACCOUNT_SID = "ACc1410f832b6f106c103d253ce6b5156b";
    private static final String AUTH_TOKEN = "b6797365de78a710c570dc094b75970f";

    private static EnviadorNotificaciones instancia;

    private EnviadorNotificaciones() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    public static EnviadorNotificaciones getInstancia() {
        if(instancia == null) {
            instancia = new EnviadorNotificaciones();
        }
        return instancia;
    }

    public void enviarNotificaciones(Notificacion notificacion, String mensaje, Usuario usuario) {
            notificacion.enviar(mensaje, usuario);
    }
}
