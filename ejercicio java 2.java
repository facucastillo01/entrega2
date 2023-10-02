import java.util.Scanner;

public class ContarCifras {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Por favor, ingrese un número entre 0 y 9.999: ");
        int numero = scanner.nextInt();

        // Cerrar el objeto Scanner después de usarlo
        scanner.close();

        // Verificar si el número está en el rango solicitado
        if (numero >= 0 && numero <= 9999) {
            // Convertir el número a una cadena para contar las cifras
            String numeroStr = String.valueOf(numero);
            
            // Calcular la cantidad de cifras
            int cifras = numeroStr.length();
            
            // Mostrar el resultado
            System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
        } else {
            System.out.println("El número ingresado no pertenece al rango solicitado.");
        }
    }
}
