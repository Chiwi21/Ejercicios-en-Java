public class JugadorFutbol {
    private String nombre;
    private String posicion;
    private int numero;
    private int edad;
    private String nacionalidad;
    private String equipo;

    // Constructores
    public JugadorFutbol() {
    }

    public JugadorFutbol(String nombre) {
        this.nombre = nombre;
    }

    public JugadorFutbol(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    // Métodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    // Método propio
    public String verDetalle() {
        return "Jugador: " + this.nombre + "\n" +
                "Posición: " + this.posicion + "\n" +
                "Número: " + this.numero + "\n" +
                "Edad: " + this.edad + "\n" +
                "Nacionalidad: " + this.nacionalidad + "\n" +
                "Equipo: " + this.equipo + "\n";
    }
}
