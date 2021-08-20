import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;

import java.io.IOException;

public class Email extends Notificacion {
    private static final String SENDGRID_API_KEY = "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";

    public void enviar(String mensaje, Usuario usuario) {
        try {
            com.sendgrid.helpers.mail.objects.Email from = new com.sendgrid.helpers.mail.objects.Email("jrobaina@frba.utn.edu.ar");
            com.sendgrid.helpers.mail.objects.Email to = new com.sendgrid.helpers.mail.objects.Email(usuario.getEmail());

            String subject = "Tu libro ha sido encontrado" + " " + usuario.getNombre() + " " + usuario.getApellido();
            Content content = new Content("text/html", mensaje);

            Mail mail = new Mail(from, subject, to, content);

            SendGrid sg = new SendGrid(SENDGRID_API_KEY);
            Request request = new Request();

            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());

            Response response = sg.api(request);

            System.out.println(response.getStatusCode());
            System.out.println(response.getHeaders());
            System.out.println(response.getBody());
        }
        catch (IOException exception) {
            System.out.println("ERROR: " +exception.getMessage());
        }
    }
}
