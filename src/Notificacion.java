import java.util.Date;

public class Notificacion {
    private String codigo;
    private String destinatario;
    private String mensaje;
    private Date fechaEnvio;
    private EstadoNotificacion estado;
    private Situacion situacion;

    // Constructor vacío.
    public Notificacion() {
    }

    // Constructor con parámetros.
    public Notificacion(String codigo, String destinatario, String mensaje, Situacion situacion) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.situacion = situacion;
        this.estado = EstadoNotificacion.PENDIENTE;
    }

    // Getters y Setters.
    public String getCodigo() {
        return codigo;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public EstadoNotificacion getEstado() {
        return estado;

    }
    public void setEstado(EstadoNotificacion estado) {
        this.estado = estado;
    }

    public Situacion getSituacion() {
        return situacion;
    }

    public boolean enviar() {
        return false;
    }

    @Override
    public String toString() {
        return "Notificacion {" +
                "codigo='" + codigo + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", fechaEnvio=" + (fechaEnvio != null ? fechaEnvio : "Pendiente") +
                ", estado=" + estado +
                ", situacion=" + situacion +
                '}';
    }
}