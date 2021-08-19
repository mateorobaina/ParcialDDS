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
        contactoMateo.setNombreUsuario("MateoRobaina");
        contactoMateo.setTelefono("+5491133088399");
        contactoMateo.setEmail("mateorobainaa@gmail.com");

        List<Notificacion> notificacionesMateo = new ArrayList<>();
        notificacionesMateo.add(new Email());

        //contactoMateo.setNotificacion(notificacionesPreferidasLautaro);
        contactoMateo.setNotificacion(notificacionesMateo);
        // Contacto de Carol
       // Contacto contactoLucas = new Contacto();
       // contactoCarol.setApellido("Navia");
       // contactoCarol.setNombre("Carol");
       // contactoCarol.setTelefono("+5491150966922");
       // contactoCarol.setEmail("carolmdz2006@gmail.com");
       //
       // List<Notificacion> notificacionesPreferidasCarol = new ArrayList<>();
       // notificacionesPreferidasCarol.add(new Whatsapp());
       // notificacionesPreferidasCarol.add(new SMS());
       //
       // contactoCarol.setNotificacion(notificacionesPreferidasCarol);

        // Encontramos a tu mascota! Enviar notificacion
        contactoMateo.enviarNotificaciones(" Tu libro esta disponible!" + contactoMateo.getNombreUsuario());
    }
  //  private static void ApiRest() {
  //
  //      // Probando el buscador de hogar de transito
  //      BuscadorHogarTransito buscador = BuscadorHogarTransito.getInstancia();
  //
  //      List<HogarTransito> hogares = buscador.buscarHogarTransito(1);
  //
  //      System.out.println("Hogares!");
  //      hogares.forEach(hogar -> {
  //          System.out.println("{");
  //          System.out.println("nombre: " + hogar.getNombre());
  //          System.out.println("ubicacion");
  //          System.out.println("direccion: " + hogar.getUbicacion().getDireccion());
  //          System.out.println("lat: " + hogar.getUbicacion().getLatitud());
  //          System.out.println("long: " + hogar.getUbicacion().getLongitud());
  //          System.out.println("}");
  //      });
  //  }
}

