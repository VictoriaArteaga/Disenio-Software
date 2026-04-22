import java.util.Date;

public class NotificacionEmail extends Notificacion {
    private String email;
    private String asunto;

    public NotificacionEmail() {
        super();
    }

    public NotificacionEmail(String email, String asunto) {
        this.email = email;
        this.asunto = asunto;
    }

    public NotificacionEmail(String email, String codigo, String destinatario, String mensaje, Situacion situacion, String asunto) {
        super(codigo, destinatario, mensaje, situacion);
        this.email = email;
        this.asunto = asunto;
    }

    public String getEmail() {
        return email;
    }
    public String getAsunto() {
        return asunto;
    }

    @Override
    public boolean enviar() {
        System.out.println("Enviando Email a: " + email);
        setEstado(EstadoNotificacion.ENVIADO);
        this.setFechaEnvio(new Date());
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " [Email: " + email + "]";
    }
}