
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //Automovil bmw = new Automovil( "BMW");
        Automovil bmw = new Automovil("BMW", "i320", "Negro", "3");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String var1;
        System.out.print("Modelo :");
        var1 = br.readLine();
        System.out.print("");
        bmw.setModelo(var1);
        System.out.println(" bmw.getModelo() = " + var1);

        int var2;
        System.out.println("Cilindraje : ");
        var2 = Integer.parseInt(br.readLine());
        System.out.println("");
        bmw.setCilindraje(String.valueOf(var2));
        System.out.println("bmw.getCilindraje() " + var2);

        System.out.println("bmw.verDetalle() = " + bmw.verDetalle());

        Automovil bmw2 = new Automovil("Mercedes", "ML200");
        bmw.setMarca("BMW");
        bmw.setModelo("i22");
        bmw2.setColor("Negro");
        bmw2.setCilindraje("2000");

        System.out.println("bmw.verDetalle() = " + bmw2.verDetalle());
        System.out.println("bmw.acelerar() = " + bmw.acelerar());
        System.out.println("bmw.frenar(kmph:89) = " + bmw.frenar(89));
        System.out.println("bmw.capacidadTanque(40,0.7f) = " + bmw.capacidadTanque(40,0.7f));
        System.out.println("bmw.capacidadTanque(40,0.7f) = " + bmw.capacidadTanque(40,70f));
    }
    //System.out.println(bmw.equals(bmw2));
}