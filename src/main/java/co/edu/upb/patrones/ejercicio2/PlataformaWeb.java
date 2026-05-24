package co.edu.upb.patrones.ejercicio2;

public class PlataformaWeb implements Plataforma{
    @Override
    public void mostrar(String titulo, String mensaje) {
        System.out.println("[WEB] " + titulo + ": " + mensaje);
    }
}
