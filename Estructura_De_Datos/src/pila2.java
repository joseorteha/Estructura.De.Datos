import java.util.Stack;  //importar libreria Stack
import java.util.Scanner; //importar libreria Scanner

public class pila2 { //se crea la clase
    public static void main(String[] args) { //se implementa el metodo prncipal
        // Crear una pila de enteros
        Stack<Integer> pila = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de elementos que desea agregar a la pila
        System.out.print("¿Cuántos elementos deseas agregar a la pila? ");
        int numElementos = scanner.nextInt();

        // Ciclo para que el usuario ingrese los elementos
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Ingresa el elemento " + (i + 1) + ": ");
            int elemento = scanner.nextInt();
            pila.push(elemento); // Agregar el elemento a la pila
        }

        // Imprimir el contenido de la pila después de hacer push
        System.out.println("Pila después de hacer push: " + pila);

        // Eliminar el elemento superior de la pila (operación pop)
        int elementoEliminado = pila.pop();
        System.out.println("Elemento eliminado: " + elementoEliminado);

        // Consultar el elemento superior sin eliminarlo (operación peek)
        int elementoSuperior = pila.peek();
        System.out.println("Elemento superior (sin eliminar): " + elementoSuperior);

        // Imprimir el contenido final de la pila
        System.out.println("Pila final: " + pila);

        // Verificar si la pila está vacía
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía");
        } else {
            System.out.println("La pila no está vacía");
        }

        // Buscar un elemento específico en la pila
        System.out.print("Ingresa el elemento que deseas buscar en la pila: ");
        int buscaElemento = scanner.nextInt();
        int posicionElemento = pila.search(buscaElemento);

        if (posicionElemento != -1) {
            System.out.println("El elemento está en la posición: " + posicionElemento);
        } else {
            System.out.println("El elemento no se encuentra en la pila.");
        }

        scanner.close();
    }
}