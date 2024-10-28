public class Flor {
    private String nombre;
    private String color;
    private double altura;
    private String tipo;
    private String climaPreferido;

    public Flor(String nombre, String color, double altura, String tipo, String climaPreferido) {
        this.nombre = nombre;
        this.color = color;
        this.altura = altura;
        this.tipo = tipo;
        this.climaPreferido = climaPreferido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClimaPreferido() {
        return climaPreferido;
    }

    public void setClimaPreferido(String climaPreferido) {
        this.climaPreferido = climaPreferido;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles de la Flor:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Altura: " + getAltura() + " cm");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Clima Preferido: " + getClimaPreferido());
    }
}
