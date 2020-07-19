package java_exercises_2_mz.regex;

//Przygotuj aplikację pobierającą od użytkownika ciąg znaków i sprawdzającą czy
//        podany tekst jest poprawnym polskim kodem pocztowym (np. 85-155, 00-122)

import java.util.Scanner;
import java.util.regex.Pattern;

public class Zad2 {

    public static void isPostalCodeCorrect(String input) {
        Pattern inputPattern = Pattern.compile("[0-9]{2}\\-[0-9]{3}");
        boolean isPostalCode = inputPattern.matcher(input).matches();
        if (isPostalCode == false) System.out.println("Not a valid postal code!");
        else {
            System.out.println("Postal code valid. ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter postal code: ");
        String input = scanner.nextLine();
        isPostalCodeCorrect(input);
        isPostalCodeCorrect("xx-xxx");
        isPostalCodeCorrect("99-000");
        isPostalCodeCorrect("99-0a0");
        isPostalCodeCorrect("999-00");
        isPostalCodeCorrect("12300");
    }
}


