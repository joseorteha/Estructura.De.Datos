import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class impresora {

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int Nu_archivos;

        // Pedir la cantidad de archivos a imprimir
        System.out.print("¿Cuántos archivos va imprimir? ");
        Nu_archivos = scanner.nextInt(); //Recibe datos
        scanner.nextLine();  // Limpiar datos de entrada

        // Agregar los archivos a la cola
            for (int i = 1; i <=Nu_archivos; i++) {
            System.out.print("Ingrese el nombre del archivo " + i + " a imprimir: ");
            String archivo = scanner.nextLine();
            cola.add(archivo);
        }

        // Mostrar el archivo que será impreso primero
        System.out.println("El primer archivo en la cola es: " + cola.peek());

        // Imprimir todos los archivos de la cola
        for (int i = 0; i < Nu_archivos; i++) {
            try {
                System.out.println("\nImprimiendo archivo....: " + cola.peek());
                Thread.sleep(3000);  // Pausa de 3 segundos para simular la impresión
                cola.remove();  // Eliminar archivo impreso
            } catch (InterruptedException e) {
                System.out.println("Error en la impresión.");
            }

            // Verificar si quedan archivos en la cola
            if (!cola.isEmpty()) {
                System.out.println("El siguiente archivo a imprimir es: " + cola.peek());
            } else {
                System.out.println("No hay mas archivos en la cola.");
            }
        }

        // Verificar si la cola está vacía
        if (cola.isEmpty()) {
            System.out.println("Todos los archivos han sido impresos.");
        } else {
            System.out.println("Aún quedan archivos en la cola de impresión.");
        }

    }
}
