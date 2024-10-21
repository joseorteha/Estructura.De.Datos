public class QuickSort {

    // Método que inicia el proceso de ordenamiento llamando al quicksort
    public void ordenarQ(int[] array) {
        array = quicksort1(array);  // Llama al método que inicia el algoritmo
    }

    // Método intermedio para iniciar la recursión del quicksort
    public int[] quicksort1(int numeros[]) {
        return quicksort2(numeros, 0, numeros.length - 1);  // Llama a quicksort2 con los índices inicial y final
    }

    // Método recursivo que aplica el algoritmo de QuickSort
    public int[] quicksort2(int numeros[], int izq, int der) {
        // Condición base: si el índice izquierdo es mayor o igual al derecho, no hay nada que ordenar
        if (izq >= der) {
            return numeros;
        }

        int i = izq, d = der;  // Variables para mantener las posiciones originales de los índices

        // Si los índices son diferentes, comenzamos la partición
        if (izq != der) {
            int pivote;  // Definir el pivote
            int aux;     // Variable auxiliar para realizar intercambios
            pivote = izq;  // Tomamos el primer elemento como pivote

            // Mientras los índices no se crucen
            while (izq != der) {
                // Mover el índice derecho hacia la izquierda mientras el número sea mayor o igual al pivote
                while (numeros[der] >= numeros[pivote] && izq < der) {
                    der--;
                }
                // Mover el índice izquierdo hacia la derecha mientras el número sea menor al pivote
                while (numeros[izq] < numeros[pivote] && izq < der) {
                    izq++;
                }
                // Si los índices no se han cruzado, intercambiamos los valores
                if (der != izq) {
                    aux = numeros[der];
                    numeros[der] = numeros[izq];
                    numeros[izq] = aux;
                }
            }

            // Cuando los índices se cruzan, dividimos el arreglo y aplicamos quicksort recursivamente
            if (izq == der) {
                quicksort2(numeros, i, izq - 1);  // Ordenamos la parte izquierda
                quicksort2(numeros, izq + 1, d);  // Ordenamos la parte derecha
            }
        } else {
            return numeros;  // Si los índices son iguales, no se hace nada
        }
        return numeros;  // Devolvemos el arreglo ordenado
    }
}
