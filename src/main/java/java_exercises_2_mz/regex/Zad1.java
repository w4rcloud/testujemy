package java_exercises_2_mz.regex;

//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//        czy wprowadzona wartość jest wartością liczbową. Jeśli użytkownik wprowadził
//        liczbę, sprawdź czy jest parzysta czy nieparzysta. Wyświetl komunikat informujący
//        użytkownika o wprowadzeniu poprawnej lub błędnej liczby oraz o jej parzystości lub
//        nieparzystości.

import java.util.Scanner;
import java.util.regex.Pattern;

public class Zad1 {
    public static void isInputNumber(String input) {
        Pattern inputPattern = Pattern.compile("[0-9]{1,}");
        boolean isNumber = inputPattern.matcher(input).matches();
        if (isNumber == false) System.out.println("Wrong input!");
        else {
            System.out.print("Input correct. ");
            if (Integer.parseInt(input) % 2 == 0) System.out.println("Provided an even number.");
            else System.out.println("Provided an odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        isInputNumber(input);
    }
}

