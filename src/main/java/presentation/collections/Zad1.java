package presentation.collections;

//Utwórz Listę implementującą ArrayList.
//        Dodaj trzy imiona do listy
//        Dodaj jedno z tych imion ponownie
//        Sprawdź rozmiar listy

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zad1 {

    public static void exampleListInterface() {
        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("Mike");
        myArrayList.add("Olve");
        myArrayList.add("Katie");
        System.out.println("List size: " + myArrayList.size());
        myArrayList.add("Aimee");
        System.out.println("List size: " + myArrayList.size());
        for (String name : myArrayList) {
            System.out.println("Hi, " + name);
        }

    }

    public static void main(String[] args) {
        exampleListInterface();

    }
}
