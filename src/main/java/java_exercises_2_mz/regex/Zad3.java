package java_exercises_2_mz.regex;

//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
//        czy wprowadzona wartość jest poprawnym loginem użytkownika. Za poprawny login
//        uważamy tekst zawierający małe i duże litery oraz cyfry. Jego minimalna długość to 8
//        a maksymalna 16 znaków

import java.util.Scanner;
import java.util.regex.Pattern;

public class Zad3 {

    public static void isPasswordCodeCorrect(String input) {
        Pattern inputPattern = Pattern.compile("[0-9a-zA-Z]{8,16}");
        boolean isPassword = inputPattern.matcher(input).matches();
        if (isPassword == false) System.out.println("Pasword invalid.");
        else {
            System.out.println("Password valid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String input = scanner.nextLine();
        isPasswordCodeCorrect(input);
        isPasswordCodeCorrect("xx-xxfsdfsdfx");
        isPasswordCodeCorrect("990097897890");
        isPasswordCodeCorrect("99aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0a0");
        isPasswordCodeCorrect("9a");
        isPasswordCodeCorrect("123fsdfsdf00");
    }
}
