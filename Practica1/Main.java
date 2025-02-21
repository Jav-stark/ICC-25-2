import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("CALCULADORA");
        System.err.println("Seleccione una opción:");
        System.out.println("1. Suma");
        System.out.println("2. Multiplicación");
        System.out.println("3. División");
        System.out.println("4. Ingresar nombre");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de la opción deseada: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {  // SUMA
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            System.out.println("Resultado: " + (num1 + num2));
        } else if (opcion == 2) {  // MULTIPLICACIÓN
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            System.out.println("Resultado: " + (num1 * num2));
        } else if (opcion == 3) {  // DIVISIÓN
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            if (num2 != 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Error: No se puede dividir por cero.");
            }
        } else if (opcion == 4) {  // OPCIÓN EXTRA (INGRESAR NOMBRE)
            System.out.print("Ingrese su nombre: ");
            scanner.nextLine(); // Consumir la nueva línea pendiente
            String nombre = scanner.nextLine();
            System.out.println("¡Hola, " + nombre + "!");
        } else {
            System.out.println("Opción inválida. Intente de nuevo.");
        }
        scanner.close(); 
    }
}