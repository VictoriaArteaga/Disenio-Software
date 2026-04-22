import java.util.Date;

public class NotificacionApp extends Notificacion {
    private String tokenDispositivo;

    public NotificacionApp() {
        super();
    }

    public NotificacionApp(String tokenDispositivo) {
        this.tokenDispositivo = tokenDispositivo;
    }

    public NotificacionApp(String tokenDispositivo, String codigo, String destinatario, String mensaje, Situacion situacion) {
        super(codigo, destinatario, mensaje, situacion);
        this.tokenDispositivo = tokenDispositivo;
    }

    public String getTokenDispositivo() {
        return tokenDispositivo;
    }

    @Override
    public boolean enviar() {
        System.out.println("Enviando Push al token: " + tokenDispositivo);
        setEstado(EstadoNotificacion.ENVIADO);
        this.setFechaEnvio(new Date());
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " [Token: " + tokenDispositivo + "]";
    }
}