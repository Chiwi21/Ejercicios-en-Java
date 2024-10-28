public class Materia {
    private String codigo;
    private String nombre;
    private int creditos;

    // Constructor por defecto
    public Materia() {
    }

    // Constructor con todos los atributos
    public Materia(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    // Método para mostrar la información de la materia
    public String mostrarMateria() {
        return "Código: " + this.codigo + ", Nombre: " + this.nombre + ", Créditos: " + this.creditos;
    }
}