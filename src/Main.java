import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Notificacion> listaNotificaciones = new ArrayList<>();

        // 1. Constructor completo de Email.
        Notificacion email = new NotificacionEmail(
                "becas@u.edu.co",
                "NOT-001",
                "Carlos Perez",
                "Beca aprobada",
                Situacion.CONFIRMACION,
                "Felicidades"
        );

        // 2. Usando el constructor completo de SMS
        Notificacion smsCompleto = new NotificacionSMS(
                "NOT-002",
                "Marta Gomez",
                "Tu paquete ha llegado",
                Situacion.AVISO,
                "3159876543"
        );

        // 3. Usando el constructor con token de App
        Notificacion app = new NotificacionApp(
                "TOKEN_FIREBASE_123",
                "NOT-003",
                "Luis",
                "Clase de algebra a las 8am.",
                Situacion.RECORDATORIO
        );

        // Agregamos todas a la lista.
        listaNotificaciones.add(email);
        listaNotificaciones.add(smsCompleto);
        listaNotificaciones.add(app);

        System.out.println("=== PROCESANDO ENVÍOS DE NOTIFICACIONES ===");

        for (Notificacion n : listaNotificaciones) {
            // Imprime el estado inicial usando el toString().
            System.out.println("Estado inicial: " + n.toString());

            // Llama al método enviar() de cada hija.
            n.enviar();

            // Muestra el resultado final
            System.out.println("Después: " + n.toString());
            System.out.println("------------------------------------------------");
        }
    }
}