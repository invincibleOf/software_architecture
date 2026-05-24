package co.edu.upb.patrones.ejercicio3;

public interface ChatMediator {

    void registrarUsuario(Usuario usuario);

    void eliminarUsuario(Usuario usuario);

    void enviarMensaje(Usuario remitente, String mensaje);
}
