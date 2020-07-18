package presentation.collections;

//2. Utwórz zbiór Set implementujący HashSet.
//        Dodaj trzy imiona do zbioru
//        Dodaj jedno z tych imion ponownie
//        Sprawdź rozmiar zbioru

import java.util.HashSet;

public class Zad2 {

    public static HashSet<String> Zad2(){
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Mike");
        myHashSet.add("Olve");
        myHashSet.add("Katie");
        System.out.println("Number of names: " + myHashSet.size());
        myHashSet.add("Katie");
        System.out.println("Number of names after adding an existing name: " + myHashSet.size());
        return myHashSet;
        }

    public static void main(String[] args) {
        System.out.println(Zad2());
    }
}
