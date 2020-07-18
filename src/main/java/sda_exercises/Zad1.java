package sda_exercises;

//Napisz program, który na podstawie zmiennych: wzrost - height (int) oraz waga - weight (float),
//        sprawdza czy dana osoba może jechać kolejką górską.
//        W przypadku kiedy osoba jest wyższa niż 150cm oraz nie przekracza wagi 180kg,
//        program wypisze w konsoli "Zapnij pasy!", w przeciwnym wypadku wypisze w konsoli "Przykro mi, nie możesz jechać!".
//        Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.

import java.util.Scanner;

public class Zad1 {

    public static void rollercoasterValidator(){
        Scanner scanner = new Scanner(System.in);
        int height = 0;
        float wieght = 0;
        boolean canRide = false;
        System.out.print("Provide height: ");
        height = scanner.nextInt();
        System.out.print("Provide weight: ");
        wieght = scanner.nextFloat();
        if (height > 150 && wieght <180) canRide = true;
        if (canRide == true) System.out.println("Buckle up!");
        else System.out.println("I'm sorry, you can't ride...");
    }

    public static void main(String[] args) {
        rollercoasterValidator();
    }
}
