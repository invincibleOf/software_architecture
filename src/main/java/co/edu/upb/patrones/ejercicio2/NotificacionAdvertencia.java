package co.edu.upb.patrones.ejercicio2;

public class NotificacionAdvertencia extends Notificacion {

    public NotificacionAdvertencia(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("Notificacion Advertencia", mensaje);
    }
}
