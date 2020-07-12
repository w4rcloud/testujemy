package java_exercises_1_sda;

//Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
//        Przykład:
//        zadana tablica [12, 7, 19]
//        wynik [19, 7, 12]

public class Zad4A {

    public static int[] swapFirstAndLastArrayIndex(int[] array) {
        if (array.length > 2) {
            int temporary = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temporary;
        } else {
            System.out.println("Array too small");
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int index : array) {
            System.out.print("[" + index + "] ");

        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] sampleArray = {12, 7, 19};
        System.out.print("Before: ");
        printArray(sampleArray);
        swapFirstAndLastArrayIndex(sampleArray);
        System.out.print("After: ");
        printArray(sampleArray);


    }
}
