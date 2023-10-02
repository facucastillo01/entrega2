import java.util.Scanner;

public class NumerosParesHastaN {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número de 3 dígitos
        System.out.print("Por favor, ingrese un número de 3 dígitos: ");
        int numero = scanner.nextInt();
        
        // Cerrar el objeto Scanner después de usarlo
        scanner.close();
        
        // Verificar si el número tiene 3 dígitos
        if (numero >= 100 && numero <= 999) {
            System.out.println("Números pares desde 0 hasta " + numero + ":");
            
            // Usar un bucle for para imprimir números pares
            for (int i = 0; i <= numero; i += 2) {
                System.out.print(i + " ");
            }
            
            System.out.println(); // Imprimir un salto de línea al final
        } else {
            System.out.println("El número ingresado no tiene 3 dígitos.");
        }
    }
}
