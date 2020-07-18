package sda_exercises;

//Napisz program, który pobiera od użytkownika liczbę całkowitą i wypisuje w konsoli wszystkie jej dzielniki.
//        Przykładowo dla liczby 21, program powinien wypisać w konsoli liczby: 1, 3, 7, 21
//        Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner. 

import java.util.Scanner;

public class Zad10 {

    public static void Zad10() {
        System.out.print("Provide a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Zad10();
    }
}
