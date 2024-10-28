public class Nota {
    private Materia materia;
    private float calificacion;

    // Constructor por defecto
    public Nota() {
    }

    // Constructor con todos los atributos
    public Nota(Materia materia, float calificacion) {
        this.materia = materia;
        this.calificacion = calificacion;
    }

    // Getters y setters
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    // Método para mostrar la información de la nota
    public String mostrarNota() {
        return "Materia: " + this.materia.getNombre() + ", Calificación: " + this.calificacion;
    }
}