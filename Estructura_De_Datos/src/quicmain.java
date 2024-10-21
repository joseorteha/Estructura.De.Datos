// Clase principal que prueba el algoritmo de QuickSort
public class quicmain {
    public static void main(String[] args) {
        // Se crea un arreglo de enteros desordenados
        int[] areglo = {5, 11, 7, 15, 12, 4, 75, 1, 3, 5, 7, 6, 23, 3, 4, 2, 1, 45, 13};

        // Se crea una instancia de QuickSort
        QuickSort o = new QuickSort();

        // Se ordena el arreglo
        o.ordenarQ(areglo);

        // Se imprime el arreglo ordenado
        for (int i = 0; i < areglo.length; i++) {
            System.out.println(areglo[i]);  // Imprimir cada elemento en una nueva línea
        }
    }
}