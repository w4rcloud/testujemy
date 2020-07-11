package java_exercises_1_sda;

import java.util.Arrays;

public class Zad5 {

    public static void getMinAndMaxValueFromArray(int[] numbers){
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println(min);
        System.out.println(max);

    }

    public static void main(String[] args) {
        int[] numbers = {-1, 0, 2, 99};
        getMinAndMaxValueFromArray(numbers);
    }
}
