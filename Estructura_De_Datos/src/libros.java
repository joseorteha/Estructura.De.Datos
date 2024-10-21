 import java.util.Scanner; //importamos libreria Scaner
import java.util.Stack; //importamos libreria Stack

public class libros { //crear clase
    public static void main(String[] args) { //metodo principal

// Crear una pila de cadenas (strings) para almacenar los libros
        Scanner scanner = new Scanner(System.in);
        Stack<String> PilaLibros = new Stack<>();

        // Solicitar al usuario cuántos libros desea agregar a la pila
        System.out.println("¿Cuantos libros ingresaras?");
        int numLibr = scanner.nextInt();
        scanner.nextLine(); // Consumimos la nueva línea después de ingresar el número

        // Ciclo para que el usuario ingrese los títulos de los libros
        for (int i = 0; i < numLibr; i++) {
            System.out.println("Ingrese el titulo del libro " + (i + 1 + ":"));
            String libro = scanner.nextLine(); //leemos titulo del libro
            PilaLibros.push(libro); //agregamos titulo del libro
        }

        // Imprimir el contenido de la pila después de hacer push
        System.out.println("Pila de libros despues de agregar: " + PilaLibros);

        // Eliminar el libro en la parte superior de la pila (operación pop)
        String libroEliminado = PilaLibros.pop();
        System.out.println("Libro eliminado: " + libroEliminado);

        // Consultar el libro en la parte superior sin eliminarlo (operación peek)
        String LibroSuperior = PilaLibros.peek();
        System.out.println("Libro superior sin eliminar: " + LibroSuperior);

        // Imprimir el contenido final de la pila
        System.out.println("Pila final de libros: " + PilaLibros);


        // Verificar si la pila está vacía
        if (PilaLibros.isEmpty()) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("La pila no esta vacia");
        }


        // Buscar un libro específico en la pila
      System.out.println("Ingresa el título del libro que deseas buscar en la pila");
        String buscarLibro = scanner.nextLine();
        int posicionLibro = PilaLibros.search(buscarLibro);

        // Si el libro se encuentra, mostrar la posición, si no, indicar que no está
        if (posicionLibro != -1) {
            System.out.println("El libro está en la posición: " + posicionLibro);
        } else {
            System.out.println("El libro no se encuentra en la pila.");
        }
        }

    }

