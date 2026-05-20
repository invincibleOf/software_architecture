package co.edu.upb.patrones.ejercicio2;

public class NotificacionConfirmacion extends Notificacion {

    public NotificacionConfirmacion(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("Notificacion Confirmación", mensaje);
    }
}
