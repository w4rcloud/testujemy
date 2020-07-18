package sda_exercises;

//Napisz program, który pobiera od użytkownika dwie liczby całkowite A - a (int) oraz B - b (int), gdzie A < B,
//        a następnie oblicza sumę ciągu liczb od A do B (A, A + 1, A + 2, . . . , B) i wypisuje ją w konsoli.
//        Gdy warunek A < B nie został spełniony, program kończy pracę wypisuąc w konsoli "Robota skończona".  
//        Przykładowo dla A = 4 i B = 11 program powinien wypisać w konsoli liczbę 60.
//        Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.

import java.util.Scanner;

public class Zad6 {
    int number1 = 0;
    int number2 = 0;

    public static int Zad6() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide first number: ");
        int a = scanner.nextInt();
        System.out.print("Provide second number: ");
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of numbers between given numbers is: " + Zad6());
    }
}
