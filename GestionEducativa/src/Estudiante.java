public class Estudiante {
    private String codigo;
    private String nombre;
    private String carrera;
    private String semestre;

    // Constructor por defecto
    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, String carrera, String semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String mostrarInfoEstudiante() {
        return "Código: " + codigo + "\n" +
                "Nombre: " + nombre + "\n" +
                "Carrera: " + carrera + "\n" +
                "Semestre: " + semestre;
    }

}