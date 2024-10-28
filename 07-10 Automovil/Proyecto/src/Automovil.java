public class Automovil {
    private String marca = "MERCEDES BENZ";
    private String modelo;
    private String color = "Verde";
    private int cilindraje;  // El FLOAT ES NATIVO
    public float consumo = 40;
    // eN PROGRA REAL, SE DEBE LLEGAR A LOS ATRIBUTOS SIEMPRE POR UN MÉTODO
    // Private a los atributos es clave Y ACCEDER CON ELLOS POR LOS METODOS
    // Atributo también se le llama Estado
    // El metodo debe ser publico para poder acceder
//Depues de  los atributos, van los constructores, luego los getter y los setters
    //Atributos privados, métodos público
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

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    /*
    public void leerMarca(String marca){  //Si voy a leer me hace falta al menos un parametro
        this.marca = marca;  //Los atributos solo funcionaran por la clase  y el THIS a la propiedad marca, asignale la variable marca
        // No retorna porque el parametro de retorno es void

    }

    public void escribirMarca(){  //
        this.marca =
    }
*/

    public String verdetalle(){
        String mark = "BMW";
        //Cuando trabajo dentro de la clase, no necesito usar el GET
        String dv = "La marca es: " + this.getMarca() + "\n" +
        "El modelo es: " + this.modelo + "\n" +
        "El color es: " + this.color + "\n" +
        "El cilindraj es: " + this.cilindraje;
        return dv;
    }

    public String acelerar(){ //Cuando se prodce algo en caden,a con la clase se crea el molde. Pero cuando produzo a cada figura, le puedo hechar un atributo diferente, así el molde te diga que eso debe ser así
        return "El auto marca + " + this.marca + "Está acelerando"; //Metodo que retorna
    }
    public String frenar(int kmph){
        return "El auto modelo +" + this.modelo + "Está frenando a" + kmph;  //Metodo que recibe y retorna
    }

    public float capacidadTanque(int cap, float porConsumo){
        float cm = consumo / (cap*porConsumo);   //Recibe dos parametros
        return cm;
    }
}
// COn mayusculas incamos los nombres de las clases, cuando tienen; Upper Camel Case

//Metodos empieza con minuscula, la segunda con mayusucula: Lower Camel Case

// Puedo usar el this y el nombre del atributo cuando está en la clase, al momento que el atributo este privado