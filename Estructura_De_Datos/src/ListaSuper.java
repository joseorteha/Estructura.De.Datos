import java.util.ArrayList;
import java.util.Scanner;

public class ListaSuper {
    public static void main(String[] args) {
        // Crear un escáner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Lista de compras
        ArrayList<String> listaCompras = new ArrayList<>();
        String opcion;

        while (true) {
            // Mostrar opciones al usuario
            System.out.println("\n1. Agregar\n2. Eliminar\n3. Ver lista\n4. Tamaño de la lista\n5. Verificar si un producto está en la lista\n6. Salir");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1": // Agregar productos
                    System.out.print("¿Cuántos productos agregar? ");
                    int cantidad = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Producto " + (i + 1) + ": ");
                        String producto = scanner.nextLine();
                        listaCompras.add(producto); // Agregar producto a la lista
                        System.out.println(producto + " agregado.");
                        try {
                            Thread.sleep(1000); // Esperar 1 segundo antes de continuar
                        } catch (InterruptedException e) {
                            System.out.println("Error en la espera.");
                        }
                    }
                    break;

                case "2": // Eliminar un producto
                    System.out.print("Producto a eliminar: ");
                    String productoEliminar = scanner.nextLine();
                    if (listaCompras.remove(productoEliminar)) // Intentar eliminar el producto
                        System.out.println(productoEliminar + " eliminado.");
                    else
                        System.out.println(productoEliminar + " no está en la lista.");
                    try {
                        Thread.sleep(1000); // Esperar 1 segundo antes de continuar
                    } catch (InterruptedException e) {
                        System.out.println("Error en la espera.");
                    }
                    break;

                case "3": // Ver la lista de compras
                    if (listaCompras.isEmpty())
                        System.out.println("La lista está vacía.");
                    else
                        for (String producto : listaCompras) {
                            System.out.println("- " + producto); // Mostrar cada producto en la lista
                        }
                    break;

                case "4": // Mostrar el tamaño de la lista
                    System.out.println("Tamaño de la lista: " + listaCompras.size());
                    break;

                case "5": // Verificar si un producto está en la lista
                    System.out.print("Producto a verificar: ");
                    String productoVerificar = scanner.nextLine();
                    if (listaCompras.contains(productoVerificar)) // Verificar la existencia del producto
                        System.out.println(productoVerificar + " está en la lista.");
                    else
                        System.out.println(productoVerificar + " no está en la lista.");
                    break;

                case "6": // Salir del programa
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
