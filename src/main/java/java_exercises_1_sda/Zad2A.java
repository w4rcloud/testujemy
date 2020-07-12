package java_exercises_1_sda;

//      Dla danej liczby sprawdź, czy jest ona liczbą pierwszą

public class Zad2A {

    public static void main(String[] args) {
        System.out.println(prime(10));
    }
    public static boolean prime(int number) {
        boolean result = true;
        if (number > 1) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    result = false;
                }
            }
        }
        return result;
    }
}