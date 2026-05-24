package co.edu.upb.patrones.ejercicio2;

public class PlataformaMovil implements Plataforma{
    @Override
    public void mostrar(String titulo, String mensaje) {
        System.out.println("[MOVIL] " + titulo + " - " + mensaje);
    }
}
