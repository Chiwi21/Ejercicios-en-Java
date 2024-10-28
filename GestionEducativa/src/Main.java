import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear Universidad
        Universidad uni = new Universidad();
        System.out.println("Ingrese el código de la Universidad: ");
        String codigoUniversidad = sc.nextLine();
        uni.setCodigo(codigoUniversidad);

        System.out.println("Ingrese el nombre de la Universidad: ");
        String nombreUniversidad = sc.nextLine();
        uni.setNombre(nombreUniversidad);

        System.out.println("Ingrese la descripción de la Universidad: ");
        String descripcionUniversidad = sc.nextLine();
        uni.setDescripcion(descripcionUniversidad);

        System.out.println("Ingrese la dirección de la Universidad: ");
        String direccionUniversidad = sc.nextLine();
        uni.setDireccion(direccionUniversidad);

        System.out.println("Ingrese el teléfono de la Universidad: ");
        int telefonoUniversidad = sc.nextInt();
        uni.setTelefono(telefonoUniversidad);

        System.out.println("Ingrese el tipo de Universidad (Publica o Privada)");
        String tipoUniversidad = sc.nextLine();
        uni.setTipo(tipoUniversidad);
        sc.nextLine(); // Limpiar buffer

        // Crear Estudiante
        Estudiante estudiante = new Estudiante();
        System.out.println("Ingrese el nombre del Estudiante: ");
        String nombreEstudiante = sc.nextLine();
        estudiante.setNombre(nombreEstudiante);

        // Crear Materia
        Materia materia1 = new Materia("MAT101", "Matemáticas", 5);
        Materia materia2 = new Materia("CS101", "Programación", 4);

        // Crear y asignar Notas
        System.out.println("Ingrese la calificación para Matemáticas: ");
        float calificacion1 = sc.nextFloat();
        Nota nota1 = new Nota(materia1, calificacion1);

        System.out.println("Ingrese la calificación para Programación: ");
        float calificacion2 = sc.nextFloat();
        Nota nota2 = new Nota(materia2, calificacion2);

        // Mostrar resultados
        System.out.println("\n--- Información de la Universidad ---");
        System.out.println(uni.verDetalle());

        System.out.println("\n--- Información del Estudiante ---");
        System.out.println("Nombre: " + estudiante.getNombre());

        System.out.println("\n--- Notas ---");
        System.out.println(nota1.mostrarNota());
        System.out.println(nota2.mostrarNota());
    }
}