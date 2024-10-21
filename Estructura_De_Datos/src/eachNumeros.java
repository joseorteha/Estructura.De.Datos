public class eachNumeros {
    public static void main(String[] args) {
        //array
        int[] numbers = {10, 20, 40, 60, -29};
        int sum = 0;
        //se crea el ciclo foreach donde se hara la suma
        for (int number: numbers){
            sum += number;
        }
        System.out.println("Result =" + sum);

    }
}
