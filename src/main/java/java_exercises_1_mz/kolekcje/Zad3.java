package java_exercises_1_mz.kolekcje;

//Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
//        liczb do listy.
//        a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
//        b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
//        c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.

import java.util.ArrayList;
import java.util.List;

public class Zad3 {

    public static void main(String[] args) {
        List<Float> myFloatList = new ArrayList<>();
        myFloatList.add((float) 1.1);
        myFloatList.add((float) 1.2);
        myFloatList.add((float) 1.3);
        myFloatList.add((float) 1.4);
        myFloatList.add((float) 1.5);
        myFloatList.add((float) 6.1);
        myFloatList.add((float) 7.1);
        myFloatList.add((float) 8.1);
        myFloatList.add((float) 9.1);
        myFloatList.add((float) 9.9);
        System.out.println("Sum of first and last element = " + myFloatList.get(0) + myFloatList.get(9));
        System.out.println("Sum of first and last element = " + (myFloatList.get(0) + myFloatList.get(9)));
        System.out.println("Product of first and last element = " + myFloatList.get(0) * myFloatList.get(9));
        System.out.println("Product of first and last element = " + (myFloatList.get(0) * myFloatList.get(9)));
        System.out.println("Quotient of second and penultimate element = " + myFloatList.get(1) / myFloatList.get(8));
        System.out.println("Quotient of second and penultimate element = " + (myFloatList.get(1) / myFloatList.get(8)));

    }
}
