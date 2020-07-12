package java_exercises_1_sda;

//    Wypisz poniższy kawałek tabliczki mnożenia:
//            5 x 1 = 5
//            5 x 2 = 10
//            5 x 3 = 15
//            5 x 4 = 20
// Zmodyfikuj powyższe żeby wyświetlało ten kawałek tabliczki dla liczby zadanej w
//parametrze.

public class Zad1A {

    public static void multiplicationTable(int number1, int range) {
        int result = 0;
        for (int i = 1; i <= range; i++) {
            result = number1 * i;
            System.out.println(""+ i + " x " + number1 + " = " + result);
        }
    }
    public static void main(String[] args) {
        multiplicationTable(5, 5);
    }
}

