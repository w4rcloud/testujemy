package java_exercises_1_sda;

//Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
//        Przykład:
//        zadana tablica [12, 7, 19]
//        wynik [19, 7, 12]

import java.util.Arrays;

public class Zad4 {

    public static void swap1stAnd3rdIndex(int[] table) {
        int temp = table[0];
        table[0] = table[2];
        table[2] = temp;

        System.out.println(Arrays.toString(table));
    }

    public static void main(String[] args) {
        int[] table = {12, 17, 19};
        swap1stAnd3rdIndex(table);


    }

}
