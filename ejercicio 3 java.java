import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Crear un array para almacenar los 5 números
        int[] numeros = new int[5];
        
        // Solicitar al usuario que ingrese los números
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Cerrar el objeto Scanner después de usarlo
        scanner.close();
        
        // Ordenar los números de mayor a menor
        ordenarMayorAMenor(numeros);
        System.out.println("Números ordenados de mayor a menor:");
        imprimirNumeros(numeros);
        
        // Ordenar los números de menor a mayor
        ordenarMenorAMayor(numeros);
        System.out.println("Números ordenados de menor a mayor:");
        imprimirNumeros(numeros);
    }
    
    // Método para ordenar los números de mayor a menor
    public static void ordenarMayorAMenor(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Método para ordenar los números de menor a mayor
    public static void ordenarMenorAMayor(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Método para imprimir los números
    public static void imprimirNumeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
