package java_exercises_1_sda;

// Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują
//utwórz nową tablicę, do której przepisze tylko te ujemne liczby

public class Zad6 {

    public static void getNegativeAndStoreInNewArray(int[] numbers) {
        if (numbers.length > 0) {
            int[] negativeNumbers = {};
            for (int i = 0; i < 5; i++) {

                negativeNumbers[i] = numbers[i];
            }
            System.out.println(negativeNumbers.toString());


        }
    }

    public static void main(String[] args) {
        int[] numbers = {-2, -1, 0, 1, 2};
        getNegativeAndStoreInNewArray(numbers);


    }
}
