package sda_exercises;

//Napisz program, który pobiera od użytkownika liczbę całkowita dodatnią N - n (int),
//        a następnie wyświetla w konsoli wszystkie potęgi liczby 2 nie większe, niż podana liczba.
//        Przykładowo dla liczby 71 program powinien wypisać w konsoli liczby: 1 2 4 8 16 32 64.
//        Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.

import java.util.Scanner;

public class Zad7 {

    public static void zad7(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a number: ");
        int n = scanner.nextInt();
        int pow = 1;
        int i = 1;
        do {
            System.out.println(pow);
            pow *=2;
        } while (pow < n);
    }

    public static void main(String[] args) {

        zad7();
    }
}
