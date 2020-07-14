package java_exercises_1_mz.exceptions;

//Utwórz listę ArrayList przechowującą liczby całkowite.
//        a. Dodaj 5 liczb do listy.
//        b. Pobierz 6 element z listy.
//        c. Uruchom aplikację i sprawdź co pokaże IntelliJ w logach oraz w stacktrace.
//        d. Zabezpiecz kod za pomocą klauzuli try catch.
//        e. W przypadku wystąpienia błędu wyświetl stosowny komunikat.

import java.util.ArrayList;

public class Zad1 {

    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);

        try {

            myArrayList.get(5);
        } catch (Exception e) {
            System.out.print("Index out of bounds, value of last index is: ");
        } finally {
            System.out.println(myArrayList.get(4));
        }
    }
}
