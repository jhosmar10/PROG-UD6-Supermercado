import java.util.RandomAccess;
import java.util.Scanner;

public class Hiperdino {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        Cajero cajero = new Cajero(1);

        while (true) {
            System.out.println("======= Menú =======");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir un nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar supermercado");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    cajero.abrirCaja();
                    break;
                case 2:
                    if (cajero.isCajaAbierta()) {
                        Cliente cliente = new Cliente(RandomUtils.generarNombreAleatorio());
                        int numProductos = RandomUtils.generarNumeroProductosAleatorio();
                        for (int i = 0; i < numProductos; i++) {
                            cliente.agregarProducto(RandomUtils.generarNumeroProductosAleatorio());
                        }
                        cajero.agregarCliente(cliente);
                        System.out.println("Nuevo cliente añadido a la cola:\n" + cliente);
                    } else {
                        System.out.println("La caja está cerrada.");
                    }
                    break;
                case 3:
                    cajero.atenderCliente();
                    break;
                case 4:
                    cajero.verClientesPendientes();
                    break;
                case 5:
                    if (cajero.isCajaAbierta()) {
                        cajero.cerrarCaja();
                    } else {
                        System.out.println("La caja ya está cerrada.");
                    }
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        
     }
}
