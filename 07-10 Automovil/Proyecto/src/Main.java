//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Instanciar clase con un objeto
        Automovil bmw = newAutomovil();  //El nombre de newAutomovil es el nombre del constructor, el cual asigna un espacio de memoria. JGC borra lo que nose usa
        //Get lee un valor asignado. Set: Asigna un valor y recibe un parametro
        //Comportamiento es poruq uso e getter y setter para hacer algo con esos atributos
        bmw.setMarca("BMW");
        bmw.setModelo("1320");
        bmw.setColor("Negro");
        bmw.setCilindraje(3);
        // Asignando los atributos del objeto
        bmw.marca = "BMW";
        bmw.modelo = "1320";
        bmw.color = "Negro";
        bmw.cilindraje = 3;

        System.out.println("bmw.verDetalle() = " + bmw.verdetalle());
        System.out.println("bmw.acelerar() = " + bmw.acelerar());
        System.out.println("bmw.frenar() = " + bmw.frenar(80));
        System.out.println("bmw.capacidadTanque(40,0,7f = " + bmw.capacidadTanque( 40, 0.7f));
        // Sobrecarga de metodos y Polimorfismo: Cuando tengo dos metodos con el mismo nombre, pero reicben diferentes parametros. Muchas cosas de hacer con el mismo nombre
        System.out.println("bmw.capacidadTanque(40,0,7f = " + bmw.capacidadTanque(40, 70f));
        // Polimorfismo: El mismo metodo con muchas formas de hacer las cosas
        // El constructor tiene le miusmo nnombre de la clase y empieza con mayuscula
        //Creo metodos con el mismo nombre, pero hacen cosas distintas dependiendo de los parametros, aunque también puede que no necesitemos pasar parametros
        //Tecnicamente, se puede tener un metodo que tenga mismo nombre y mismos parametros y mismos acciones, pero NO ES ÚTIL. El polimorfismo, es usar ese metodo y hacer cosas distitnas

        //

        System.out.println("bmw.getMarca = " + bmw.getMarca());

    }
}