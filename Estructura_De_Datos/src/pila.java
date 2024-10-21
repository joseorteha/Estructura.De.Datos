 import java.util.Stack;  //Se importa la lireria util.stack



public class pila { //se crea la clase
    public static void main(String[] args) { //se implementa el metodo prncipal
        //crear una pila de enteros
        Stack <Integer> pila = new Stack<>(); // se crea el objeto pila (estructura de pila)

        //agrega elemntos a la pila (operacion push)
        pila.push(10); //Agrega un elemnto a la cita de la pila
        pila.push(20); //Agrega un elemnto a la cita de la pila
        pila.push(30); //Agrega un elemnto a la cita de la pila
        pila.push(40); //Agrega un elemnto a la cita de la pila
        pila.push(50); //Agrega un elemnto a la cita de la pila
        pila.push(60);

        //Imprimir el contenido de la pila
        System.out.println("Pila despues de hacer push: " + pila); //Se imprime

        //eliminar ele elemnto superior de la pila (operacin pop)
        int elemntoEliminado = pila.pop();
        System.out.println("Elemnto eliminado: " + elemntoEliminado);

        //Consultar el elemnto superior sin eliminarlo (operacion peek)
        int elemntoSuperior = pila.peek();

        //imprimir el contenido final de la pila
        System.out.println("Pila final: " + pila);


        if(pila.isEmpty()) { //El metodo va isEmpty evalua si la pila esta vacia
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("La pila no esta vacia");
        }
        int BuscaElemto= pila.search(20); //Imprime la posicion del valor
        System.out.println("El elemto esta en posicion: " + BuscaElemto);



    }
}
