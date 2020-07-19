package java_exercises_2_mz.regex;

//Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzjącą
//        czy wprowadzona data jest poprawna. Za poprawną datę uważamy zapis w postaci
//        "10.02.2018r.". Na potrzeby zadania nie weryfikujemy wartości dnia miesiąca. 45 to
//        też poprawna wartość.

import java.util.regex.Pattern;

public class Zad5 {
    public static boolean isDateCorrect (String input){
        Pattern datePattern = Pattern.compile("[0-9]{2}.[0-9]{2}.[0-9]{4}(r.){1}");
        boolean isDateCorrect = datePattern.matcher(input).matches();
        return isDateCorrect;
    }

    public static void main(String[] args) {

        System.out.println("Should be valid:");
        System.out.println(isDateCorrect("01.01.0000r."));
        System.out.println(isDateCorrect("99.99.9999r."));




        System.out.println("Should be invalid:");
    }
}
