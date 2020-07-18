package sda_exercises;

//Napisz program, który pobiera od użytkownika liczby tak długo, jak nie zostanie podana liczba 0.
//        Gdy zostanie podana liczba 0, program oblicza sumę podanych liczb i wypisuje ją w konsoli.
//        Przykładowo dla ciągu podawanych liczb: 3, 2, 5, 1, 0, program powinien wypisać w konsoli liczbę 11.
//        Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner. 

import java.util.Scanner;

public class Zad8 {

    public static int zad8(){
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int n = 0;
        do {
            System.out.print("Provide a number: ");
            n = scanner.nextInt();
            sum +=n;
        } while (n != 0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of numbers is: " + zad8());
    }
}
