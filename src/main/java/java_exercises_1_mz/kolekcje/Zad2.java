package java_exercises_1_mz.kolekcje;

//Utwórz listę ArrayList przechowującą liczby całkowite.
//        a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
//        b. Wyświetl pierwszy element zapisany w liście.
//        c. Wyświetl ostatni element zapisany w liście

import java.util.ArrayList;
import java.util.List;

public class Zad2 {

    public static void main(String[] args) {
        List<Integer> myIntegerList = new ArrayList<>();
        myIntegerList.add(69);
        myIntegerList.add(77);
        myIntegerList.add(420);
        System.out.println("ArrayList size: "+ myIntegerList.size());
        System.out.println("ArrayList item 1: "+ myIntegerList.get(0));
        System.out.println("ArrayList item 3: "+ myIntegerList.get(2));
    }
}
