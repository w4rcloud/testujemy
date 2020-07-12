package java_exercises_1_sda;

//      Dla danej liczby sprawdź, czy jest ona liczbą pierwszą

public class Zad2 {

    boolean isPrimeNumber = false;

    public static void checkIfPrimeNumber (int number) {
        boolean isPrimeNumber = false;
        if (number % 2 == 0) {
            isPrimeNumber = true;
        }
        if (isPrimeNumber == false) {
            System.out.println(number + " is not a prime number");
        } else {
            System.out.println(number + " is a prime number");
        }
    }

    public static void main(String[] args) {
        checkIfPrimeNumber(121);

    }
}
