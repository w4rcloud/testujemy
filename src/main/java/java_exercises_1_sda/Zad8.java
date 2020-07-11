package java_exercises_1_sda;

// Sprawdź, czy podany ciąg liczb jest ciągiem arytmetycznym

public class Zad8 {

    public static void checkIfArithmeticProgression (int[] numbers){
        int difference = numbers[0] - numbers[1];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] - numbers[i+1] == difference){
                System.out.println(true);
        } else {
                System.out.println(false);
            }

        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5};
        checkIfArithmeticProgression(numbers);
    }
}
