package sda_exercises;

//Napisz program, który pobiera od użytkownika liczbę całkowitą dodatnią - number (int),
//        a następnie wypisuje w konsoli kolejno wszystkie dodatnie liczby niepatrzyste nie większe od podanej liczby.
//        Przykładowo dla liczby 15 program powinien wypisać w konsoli liczby: 1, 3, 5, 7, 9, 11, 13, 15.
//        Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.

import java.util.Scanner;

public class Zad5 {

    public static void zad5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        zad5();
    }
}
