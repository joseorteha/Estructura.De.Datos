import java.util.ArrayList;
import java.util.List;

public class Listas_Est {
    public static void main(String[] args) {
        //crear una lista String

        List<String> listaNombre = new ArrayList<>(); //Se crea un arrayLits

        //agregar elementos a la lista
        listaNombre.add("Juan");
        listaNombre.add("Jose");
        listaNombre.add("Cristian");

        //Mostrar los elemtos de la lista

        System.out.println("Elemtos de la lista:");
        for (String nombre : listaNombre) {
            System.out.println(nombre);
        }

        //obtener un elemento de la lista por su indice
        String NombreEnIndice1 = listaNombre.get(0);
        System.out.println("\nElemento en el indice 1: " + NombreEnIndice1);

        //Eliminar un elemnto de la lista
        listaNombre.remove("Juan");
        System.out.println("\nLista despues de eliminar a Maria:");
        for (String nombre : listaNombre) {
            System.out.println(nombre);

        }
        //El tamañode la lista
        System.out.println("\nTamaño de la lista: " + listaNombre.size());

        //verificar si la lista tiene un elemento
        if (listaNombre.contains("Jose")){
            System.out.println("\nLa lista contiene a Jose.");
        }else{
            System.out.println("\nLa lista no contiene a Jose");
        }


    }

}
