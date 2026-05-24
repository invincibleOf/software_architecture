package co.edu.upb.patrones.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class SalaChat implements ChatMediator {

    private final String nombreSala;
    private final List<Usuario> usuarios;

    public SalaChat(String nombreSala) {
        this.nombreSala = nombreSala;
        this.usuarios = new ArrayList<>();
    }

    public String getNombreSala() {
        return nombreSala;
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        if (!usuarios.contains(usuario)) {
            usuarios.add(usuario);
            usuario.setMediador(this);
            System.out.println(usuario.getNombre() + " entro a la sala " + nombreSala);
        }
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        if (usuarios.remove(usuario)) {
            usuario.setMediador(null);
            System.out.println(usuario.getNombre() + " salio de la sala " + nombreSala);
        }
    }

    @Override
    public void enviarMensaje(Usuario remitente, String mensaje) {
        System.out.println("--- " + remitente.getNombre() + " envia en " + nombreSala + " ---");
        for (Usuario usuario : usuarios) {
            if (usuario != remitente) {
                usuario.recibir(remitente.getNombre(), mensaje);
            }
        }
    }
}
