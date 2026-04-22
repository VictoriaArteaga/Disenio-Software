import java.util.Date;

public class NotificacionSMS extends Notificacion {
    private String telefono;

    public NotificacionSMS() {
        super();
    }

    public NotificacionSMS(String telefono) {
        this.telefono = telefono;
    }

    public NotificacionSMS(String codigo, String destinatario, String mensaje, Situacion situacion, String telefono) {
        super(codigo, destinatario, mensaje, situacion);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public boolean enviar() {
        System.out.println("Enviando SMS al: " + telefono);
        setEstado(EstadoNotificacion.ENVIADO);
        this.setFechaEnvio(new Date());
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " [Tel: " + telefono + "]";
    }
}