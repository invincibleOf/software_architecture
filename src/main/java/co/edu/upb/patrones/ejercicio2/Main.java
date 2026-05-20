package co.edu.upb.patrones.ejercicio2;

/**
 * Punto de entrada para probar la solución del Ejercicio 2.
 */
public class Main {

    public static void main(String[] args) {
        Plataforma web = new PlataformaWeb();
        Plataforma movil = new PlataformaMovil();
        Plataforma escritorio = new PlataformaEscritorio();

        //Web
        Notificacion notificacionMensajeWeb =
                new NotificacionMensaje(web);
        Notificacion notificacionAlertaWeb =
                new NotificacionAlerta(web);
        Notificacion notificacionAdvertenciaWeb =
                new NotificacionAdvertencia(web);
        Notificacion notificacionConfirmacionWeb =
                new NotificacionConfirmacion(web);

        notificacionMensajeWeb.enviar("web");
        notificacionAlertaWeb.enviar("web");
        notificacionAdvertenciaWeb.enviar("web");
        notificacionConfirmacionWeb.enviar("web");

        Notificacion notificacionMensajeMovil =
                new NotificacionMensaje(movil);
        Notificacion notificacionAlertaMovil =
                new NotificacionAlerta(movil);
        Notificacion notificacionAdvertenciaMovil =
                new NotificacionAdvertencia(movil);
        Notificacion notificacionConfirmacionMovil =
                new NotificacionConfirmacion(movil);

        notificacionMensajeMovil.enviar("movil");
        notificacionAlertaMovil.enviar("movil");
        notificacionAdvertenciaMovil.enviar("movil");
        notificacionConfirmacionMovil.enviar("movil");

        Notificacion notificacionMensajeEscritorio =
                new NotificacionMensaje(escritorio);
        Notificacion notificacionAlertaEscritorio =
                new NotificacionAlerta(escritorio);
        Notificacion notificacionAdvertenciaEscritorio =
                new NotificacionAdvertencia(escritorio);
        Notificacion notificacionConfirmacionEscritorio =
                new NotificacionConfirmacion(escritorio);

        notificacionMensajeEscritorio.enviar("escritorio");
        notificacionAlertaEscritorio.enviar("escritorio");
        notificacionAdvertenciaEscritorio.enviar("escritorio");
        notificacionConfirmacionEscritorio.enviar("escritorio");
    }
}
