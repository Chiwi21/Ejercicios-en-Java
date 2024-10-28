public class Main {
    public static void main(String[] args) {
        JugadorFutbol jugador1 = new JugadorFutbol("Lionel Messi");
        jugador1.setPosicion("Delantero");
        jugador1.setNumero(10);
        jugador1.setEdad(36);
        jugador1.setNacionalidad("Argentina");
        jugador1.setEquipo("Inter Miami");

        JugadorFutbol jugador2 = new JugadorFutbol("Kylian Mbappé", "Delantero");
        jugador2.setNumero(7);
        jugador2.setEdad(25);
        jugador2.setNacionalidad("Francia");
        jugador2.setEquipo("PSG");

        // Mostrar alineación
        System.out.println(jugador1.verDetalle());
        System.out.println(jugador2.verDetalle());
    }
}
