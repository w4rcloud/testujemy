package java_exercises_1_mz.kolekcje;

// Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
//  a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
//  b. Wyświetl długość tablicy
//  c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
//  d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i
//      zapisz go ponownie w tablicy.
//  e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.

import java.lang.reflect.Array;

public class Zad1 {

    public static void arrayPrinter(int[] array) {
        for (int index : array) {
            System.out.print("[" + index + "] ");
        }
    }

    public static void addValuesToArrayIndexes(int[] array) {
        for (int i = 0; i < array.length; i++) array[i] = i + 1;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
    }

    public static int[] multiplyArrayValues(int[] array) {
        int[] multipliedArray = array;
//        for (int index : array) {
//            array[index-1] *= 2;
//        }
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return multipliedArray;
    }

    public static void main(String[] args) {
        int[] myArray = new int[10];
        System.out.print("Array created. Number of elements: " + myArray.length + ". Array contents: ");
        arrayPrinter(myArray);
        addValuesToArrayIndexes(myArray);
        System.out.print("\n" + "\n" + "Values added to array. Array contents: ");
        displayArray(myArray);
        System.out.print("\n" + "\n" + "Array elements multiplied by two. Array contents: ");
        int[] myMultipliedArray = multiplyArrayValues(myArray);
        displayArray(myMultipliedArray);


        System.out.println("");
    }
}
