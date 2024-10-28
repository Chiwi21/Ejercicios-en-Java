public class Main {
    public static void main(String[] args) {
        Flor rosa = new Flor("Rosa", "Rojo", 20, "Perenne", "Templado");
        Flor girasol = new Flor("Girasol", "Amarillo", 150, "Anual", "Soleado");
        Flor tulipan = new Flor("Tulipán", "Verde", 67.5, "Bulbosa", "Frío");

        rosa.mostrarDetalles();
        girasol.mostrarDetalles();
        tulipan.mostrarDetalles();
    }
}
