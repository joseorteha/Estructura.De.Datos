import java.util.Arrays;
import java.util.Scanner;

public class signos {
    public static void main(String[] args) {
        //entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Definir el número de entradas (nombres y signos)
        final int NUM_ENTRADAS = 5;

        // Crear un arreglo bidimensional para almacenar nombres y signos
        String[][] personasYSignos = new String[NUM_ENTRADAS][2];

        // Bucle para la entrada de datos
        for (int i = 0; i < NUM_ENTRADAS; i++) {
            // Solicitar el nombre de la persona
            System.out.print("Ingresa el nombre de la persona " + (i + 1) + ": ");
            String nombre = scanner.nextLine(); // Guardar el nombre

            // Solicitar el signo zodiacal correspondiente
            System.out.print("Ingresa el signo zodiacal de " + nombre + ": ");
            String signo = scanner.nextLine(); // Guardar el signo

            // Almacenar nombre y signo en el arreglo
            personasYSignos[i][0] = nombre;
            personasYSignos[i][1] = signo;
        }

        // Ordenar el arreglo basado en el signo zodiacal
        Arrays.sort(personasYSignos, (persona1, persona2) -> persona1[1].compareToIgnoreCase(persona2[1]));

        // Mostrar el resultado ordenado
        System.out.println("\nPersonas y sus signos zodiacales (ordenados):");
        for (String[] personaSigno : personasYSignos) {
            String nombre = personaSigno[0];
            String signo = personaSigno[1];
            System.out.println(nombre + " - " + signo);
        }

        // Cerrar el scanner
        scanner.close();
    }
}