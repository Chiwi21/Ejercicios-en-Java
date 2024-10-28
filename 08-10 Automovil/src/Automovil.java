public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private int cilindraje;

    // Parte intermedia entre el programa fuente y el programa objeto Bytecode
    // Atributos
    // Constructores


    public Automovil() {
    }

    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos set y get

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }


    // Métodos propios y de cálculo

    public String verDetalle(){
        String dv = "La marca es: " + this.marca + "\n" +
        "El modelo es: " + getModelo() +"\n" +
                "el color es: " + this.color + "\n" +
                "el cilindraje es: " + this.cilindraje + "\n";

        return dv;
    }
    // Modificación de métodos nativos
}
