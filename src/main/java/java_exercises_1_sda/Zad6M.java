package java_exercises_1_sda;

// Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują
//utwórz nową tablicę, do której przepisze tylko te ujemne liczby

public class Zad6M {

    public static int[] minusCounter(int[] in){
        int counter = 0;
        for(int number: in ){
            if (number < 0) counter++;
        }

        int[] out = new int[counter];
        int it = 0;
        for (int number: in){
            if (number < 0){
                out[it] = number;
                it ++;
            }
        }
        System.out.println("Out table");

        System.out.println("Counter result: " + counter);
        return out;
    }

    public static void main(String[] args) {
        int[] numbers = {-1, -2, 0, 1};
        System.out.println(minusCounter(numbers).toString());
    }
}