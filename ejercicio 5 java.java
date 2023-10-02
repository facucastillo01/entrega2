import java.util.Scanner;

public class Sueldos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese la cantidad de sueldos
        System.out.print("Por favor, ingrese la cantidad de sueldos a introducir: ");
        int n = scanner.nextInt();
        
        // Verificar si n es un número válido
        if (n <= 0) {
            System.out.println("Debe ingresar al menos un sueldo.");
            return; // Salir del programa si n no es válido
        }
        
        // Crear un array para almacenar los sueldos
        double[] sueldos = new double[n];
        
        // Solicitar al usuario que ingrese los sueldos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el sueldo " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
        }
        
        // Cerrar el objeto Scanner después de usarlo
        scanner.close();
        
        // Encontrar el sueldo más alto y el sueldo más bajo
        double sueldoMaximo = sueldos[0];
        double sueldoMinimo = sueldos[0];
        double sumaSueldos = sueldos[0];
        
        for (int i = 1; i < n; i++) {
            if (sueldos[i] > sueldoMaximo) {
                sueldoMaximo = sueldos[i];
            }
            if (sueldos[i] < sueldoMinimo) {
                sueldoMinimo = sueldos[i];
            }
            sumaSueldos += sueldos[i];
        }
        
        // Calcular el promedio
        double promedio = sumaSueldos / n;
        
        // Imprimir resultados
        System.out.println("El sueldo más alto es: " + sueldoMaximo);
        System.out.println("El sueldo más bajo es: " + sueldoMinimo);
        System.out.println("El promedio de los sueldos ingresados es: " + promedio);
    }
}
