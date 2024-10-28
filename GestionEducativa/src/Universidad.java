public class Universidad {
    private String codigo;
    private String nombre;
    private String descripcion;
    private String direccion;
    private int telefono;
    static String tipo;

    public Universidad(){
    }

    public Universidad(String codigo){
        this.codigo = codigo;
    }

    public Universidad(String codigo, String nombre){
        this(codigo);
        this.nombre = nombre;
    }

    public Universidad(String codigo, String nombre, String descripcion){
        this(codigo, nombre);
        this.descripcion = descripcion;
    }

    public Universidad(String codigo, String nombre, String descripcion, String direccion){
        this(codigo, nombre, descripcion);
        this.direccion = direccion;
    }

    public Universidad(String codigo, String nombre, String descripcion, String direccion, int telefono) {
        this(codigo, nombre, descripcion, direccion);
        this.telefono = telefono;
    }

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }


    public String verDetalle(){
        String vd = "El codigo de la Universidad es " + this.codigo + "\n"+
                "El nombre de la Universidad es " + this.nombre + "\n"+
                "La descripcion de la Universidad es " + this.descripcion + "\n"+
                "El telefono de la Universidad es " + this.telefono + "\n"+
                "El tipo de Universidad es " + Universidad.tipo;
        return vd;
    }
}