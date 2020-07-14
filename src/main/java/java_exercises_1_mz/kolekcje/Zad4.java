package java_exercises_1_mz.kolekcje;

//Utwórz listę ArrayList przechowującą imiona.
//        a. Dodaj 5 imion do listy,
//        b. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy.
//        c. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy
//        zaczynając od ostatniego, a kończąc na pierwszym.

import java.util.ArrayList;
import java.util.List;

public class Zad4 {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Mike");
        namesList.add("Olve");
        namesList.add("Zack");
        namesList.add("Katie");
        namesList.add("Aimee");

        for (int i = 0; i < namesList.size(); i++) System.out.println(namesList.get(i));
        System.out.println("");
        for (int i = namesList.size()-1; i >= 0; i--) System.out.println(namesList.get(i));
    }
}
