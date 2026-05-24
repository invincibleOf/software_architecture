package co.edu.upb.patrones.ejercicio3;

public class UsuarioChat extends Usuario {

    public UsuarioChat(String nombre) {
        super(nombre);
    }

    @Override
    public void recibir(String remitente, String mensaje) {
        System.out.println("[" + nombre + "] " + remitente + ": " + mensaje);
    }
}
