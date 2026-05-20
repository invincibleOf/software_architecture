package co.edu.upb.patrones.ejercicio2;

public class NotificacionMensaje extends Notificacion {

    public NotificacionMensaje(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("Notificacion Mensaje", mensaje);
    }
}
