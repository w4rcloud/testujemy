package sda_exercises;

//Napisz program, który na podstawie zmiennej temperatura w stopniach Celsjusza - tempInCelsius (float),
//        obliczał będzie temperaturę w stopniach Farhenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)
//        i wypisywał ją w konsoli.
//        Temperaturę pobierz od użytkownika w konsoli za pomocą klasy Scanner.


import java.util.Scanner;

public class Zad2 {

    public static float convertCelsiusToFahrenheit(){
        Scanner scanner = new Scanner(System.in);
        final float MULTIPLIER = 1.8f;
        final float ADDITION = 32.0f;
        System.out.print("Provide temperature in Celsius: ");
        float tempInCelsius = scanner.nextFloat();
        float tempInFahrenheit = (tempInCelsius * MULTIPLIER) + ADDITION;
        return tempInFahrenheit;
    }

    public static void main(String[] args) {
        System.out.println("Temperature in Fahrenheit: " + convertCelsiusToFahrenheit());
    }
}
