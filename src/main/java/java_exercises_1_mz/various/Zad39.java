package java_exercises_1_mz.various;

//Napisz program, który pobiera od użytkownika serię liczb różnych od zera (Zero
//        kończy wprowadzanie danych). Po wprowadzeniu danych program oblicza sumę
//        liczb wprowadzonych przez użytkownika, najmniejszą oraz największą liczbę. Na
//        koniec działania wyświetla obliczone wartości. Oczywiście nie zapomnij o
//        przechwyceniu ewentualnych wyjątków.

import java.util.Scanner;

public class Zad39 {

    public static void someMethod() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        do {
            System.out.print("Provide a number: ");
            number = scanner.nextInt();
            sum = sum + number;
            if (max > number) max = number;
            if (min < number) min = number;
        } while (number != 0);
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Lowest number: " + min);
        System.out.println("Highest number: " + max);

    }

    public static void main(String[] args) {
        someMethod();
    }
}

