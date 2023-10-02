import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una nota
        System.out.print("Por favor, ingrese una nota: ");
        int nota = scanner.nextInt();

        // Cerrar el objeto Scanner después de usarlo
        scanner.close();

        // Determinar la calificación y mostrar el detalle
        String calificacion;
        String detalle;

        if (nota >= 0 && nota <= 3) {
            calificacion = "Insuficiente";
            detalle = "0 - 3";
        } else if (nota == 4) {
            calificacion = "Suficiente";
            detalle = "4";
        } else if (nota >= 5 && nota <= 6) {
            calificacion = "Bien";
            detalle = "5 - 6";
        } else if (nota >= 7 && nota <= 8) {
            calificacion = "Notable";
            detalle = "7 - 8";
        } else if (nota >= 9 && nota <= 10) {
            calificacion = "Sobresaliente";
            detalle = "9 - 10";
        } else {
            calificacion = "Nota no válida";
            detalle = "Fuera del rango permitido";
        }

        // Mostrar la calificación y el detalle por pantalla
        System.out.println("Calificación: " + calificacion);
        System.out.println("Detalle: " + detalle);
    }
}
