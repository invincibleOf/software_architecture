package co.edu.upb.patrones.ejercicio2;

public class NotificacionAlerta extends Notificacion {

    public NotificacionAlerta(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("Notificacion Alerta", mensaje);
    }
}
