  import java.util.LinkedList;
  import  java.util.Queue;


public class cola { //se crea cola
    public static void main(String[] args) {
        //crea una cola usando LinkedList
        Queue<Integer> cola = new LinkedList<>();

        //agrega elemtos a la cola (Enqueve)
        cola.add(10);
        cola.add(20);
        cola.add(30);

        System.out.println("Frente a la cola: " + cola.peek());

        System.out.println("Elento removido: " + cola.remove());

        System.out.println("Frente de la cola despues de Dequeve: " + cola.peek());

        if (cola.isEmpty()) {
            System.out.println("La cola esta vacia.");
        }else{
            System.out.println("La cola No esta vacia");
        }
    }

}
