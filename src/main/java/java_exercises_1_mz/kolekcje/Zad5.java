package java_exercises_1_mz.kolekcje;

//Utwórz tablicę ArrayList przechowującą imiona
//        a. Korzystając z klasy Scanner pobierz od użytkownika 5 imion i zapisz je w
//        liście.
//        b. Wykorzystując pętlę while wyświetl wszystkie elementy znajdujące się w
//        liście.

import java.util.ArrayList;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            names.add(i, name);
        }

        System.out.println("\nPrinting names: ");

        int i = 0;
        while (i < 5) {
            System.out.println(names.get(i));
            i++;
        }
    }
}
