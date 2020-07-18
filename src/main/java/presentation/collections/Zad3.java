package presentation.collections;
//
//Utwórz Mapę implementującą HashMap.
//        Kluczem niech będzie Integer a wartością String
//        Dodaj trzy imiona do mapy np.  (1 , „ Adam”)
//        Sprawdź rozmiar mapy
//        Dodaj kolejne imię pod klucz 1
//        Sprawdź rozmiar mapy i wyświetl w pętli wszystkie imiona z mapy.

import java.util.HashMap;

public class Zad3 {
    public static void Zad3() {
        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "Mike");
        myHashMap.put(2, "Olve");
        myHashMap.put(3, "Katie");
        System.out.println("Size: " + myHashMap.size());
        myHashMap.put(1, "Aimee");
        System.out.println("Size after adding a name to index 1: " + myHashMap.size());
        System.out.println("Printing names: ");
        for (int i = 1; i < 4; i++) {
            System.out.println(myHashMap.get(i));

        }

    }

    public static void main(String[] args) {
        Zad3();
    }

}

