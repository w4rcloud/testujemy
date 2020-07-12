package java_exercises_1_sda;

// Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują
//utwórz nową tablicę, do której przepisze tylko te ujemne liczby

public class Zad6A {

    public static int getNegatives(int[] numbers) {
        int negativeCount = 0;
        for (int number : numbers) {
            if (number < 0) negativeCount++;
        }

        return negativeCount;
    }

    public static int[] storeNegativesInNewArray(int[] numbers) {
        int size = getNegatives(numbers);
        int[] negativesArray = new int[size];
        int iterator = 0;
        for (int number : numbers) {
            if (number < 0) {
                negativesArray[iterator] = number;
                iterator++;
            }
        }

        return negativesArray;
    }

    public static void tablePrinter(int[] array){
        for (int index : array) {
            System.out.print("[" + index + "] ");


        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] numbers = {99, -1, 0, 2, -44, -5, 44};
        tablePrinter(numbers);
        int[] negatives = storeNegativesInNewArray(numbers);
        tablePrinter(negatives);
    }
}
