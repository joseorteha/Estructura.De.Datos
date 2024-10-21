import java.util.ArrayList;

public class eachNombres2 {
    public static void main(String[] args) {
        //List
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jose"); //modficador para agergar elementos a la lista
        names.add("Diego");
        names.add("Tim");
        names.add("Cristobal");

        //for each loop
        for(String name: names){
            System.out.println(name);
        }

    }


}
