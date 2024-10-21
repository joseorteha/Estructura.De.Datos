import java.util.Scanner;

public class arreglo {
    public static int length;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //tamaño de arreglo
        System.out.println("Edades que tienes que ingresar ");
        int cuantas = scanner.nextInt();

        //creamos el arreglo
        int[] edades = new int[cuantas];

        //creammos edades
        for (int i = 0; i < cuantas; i++){
            System.out.println("Ingresa la edad " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

        //mostrar las edades
        System.out.println("Las edades ingresadas son:");
        for (int edad: edades) {
            System.out.println(edad);
        }
        scanner.close();

    }
}
