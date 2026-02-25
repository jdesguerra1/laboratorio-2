
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n--- TALLER ED I: GESTIÓN DE CLIENTES ---");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Eliminar cliente (Lógica)");
            System.out.println("4. Registrar pedido");
            System.out.println("5. Listar pedidos de un cliente");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("--- Registro de Cliente ---");
                    break;

                case 2:

                    System.out.println("--- Lista de Clientes ---");
                    break;

                case 3:
                    // Eliminar Cliente: Pedir el ID y cambiar su estado de 1 a 0
                    System.out.println("--- Eliminar Cliente (Lógica) ---");
                    break;

                case 4:
                    // Registrar Pedido: Pedir producto, precio, cantidad e ID de cliente
                    System.out.println("--- Registrar Nuevo Pedido ---");
                    break;

                case 5:
                    // Listar Pedidos: Buscar en pedidos.csv todos los del ID cliente X
                    System.out.println("--- Pedidos del Cliente ---");
                    break;

                case 6:
                    System.out.println("Saliendo del programa... ¡Adiós!");
                    break;

                default:
                    System.out.println("Error: Opción no válida. Intente de nuevo.");
            }
        }
    }
}