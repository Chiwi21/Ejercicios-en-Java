//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil bmw2 = new Automovil( "BMW", "ML200");
        //bmw2.setMarca("BMW");
        //bmw2.setModelo("122");
        bmw2.setColor("Negro");
        bmw2.setCilindraje("2000");

        Automovil bmw2 = new Automovil();

        System.out.println("BMW" +  bmw2.verDetalle());
        //Cada objeto así tenga sus mismas características, es diferente
        System.out.println(bmw == bmw2);
    }
}

//Crear una clase que se llame Jugador de Futbol, a esa clase ponemos 6 atributos, metodos header y stter, propios metodos y desplegar la alineación de esos jugadores ( o sea lo que puede hacer el jugadir)