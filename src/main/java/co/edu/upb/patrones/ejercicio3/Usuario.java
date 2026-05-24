package co.edu.upb.patrones.ejercicio3;

public abstract class Usuario {

    protected final String nombre;
    protected ChatMediator mediador;

    protected Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMediador(ChatMediator mediador) {
        this.mediador = mediador;
    }

    public void enviar(String mensaje) {
        mediador.enviarMensaje(this, mensaje);
    }

    public abstract void recibir(String remitente, String mensaje);
}
