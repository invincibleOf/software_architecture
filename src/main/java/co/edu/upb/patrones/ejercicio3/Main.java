package co.edu.upb.patrones.ejercicio3;

public class Main {

    public static void main(String[] args) {
        SalaChat sala = new SalaChat("Arquitectura - Actividad 1");

        Usuario carlos = new UsuarioChat("Carlos");
        Usuario henry = new UsuarioChat("Henry");
        Usuario jorge = new UsuarioChat("Jorge");
        Usuario pedro = new UsuarioChat("Pedro");
        Usuario wolfran = new UsuarioChat("Wolfran");

        sala.registrarUsuario(carlos);
        sala.registrarUsuario(henry);
        sala.registrarUsuario(jorge);
        sala.registrarUsuario(pedro);
        sala.registrarUsuario(wolfran);

        henry.enviar("Buenas tardes, ya quedo el escenario 3 con el patron Mediator");
        carlos.enviar("Henry, cuando lo corramos mandame captura de la consola");
        jorge.enviar("Yo me encargo del diagrama de clases");
        pedro.enviar("Listo, revisemos que el codigo y el dibujo coincidan");
        wolfran.enviar("Subimos todo a main cuando estemos de acuerdo");

        sala.eliminarUsuario(carlos);

        henry.enviar("Carlos salio del grupo, este mensaje ya no le llega a el");
        jorge.enviar("Se ve bien, la sala reparte sin que cada uno conozca a todos");
    }
}
