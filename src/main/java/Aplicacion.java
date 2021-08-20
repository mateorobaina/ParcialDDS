import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "ACc1410f832b6f106c103d253ce6b5156b";
    public static final String AUTH_TOKEN = "b6797365de78a710c570dc094b75970f";
    public static final String SENDGRID_API_KEY = "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";

    public static void main(String args[]) {
        Notificaciones();
       // ApiRest();
    }
    private static void Notificaciones() {
        // Probando las notificaciones

        // Contacto de Lautaro
        Usuario contactoMateo = new Usuario();
        contactoMateo.setNombre("Mateo");
        contactoMateo.setApellido("Robaina");
        //contactoMateo.setTelefono("+5491133088399");
        contactoMateo.setEmail("mateorobainaa@gmail.com");

        List<Notificacion> notificacionesMateo = new ArrayList<>();
        notificacionesMateo.add(new Email());

        //contactoMateo.setNotificacion(notificacionesPreferidasLautaro);
        contactoMateo.setNotificacion(notificacionesMateo);

        contactoMateo.enviarNotificaciones(" El libro que reservaste esta disponible!" + " " + contactoMateo.getNombre() + " " + contactoMateo.getApellido());
    }

}

