package java_exercises_1_sda;

// Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie, różnicy ciągu

public class Zad7 {

    public static void getArithmeticProgression(int length, int firstNumber, int difference) {
        int j = 0;
        for (int i = firstNumber; j < length; i=i+difference) {
            System.out.println(i);
            j++;

        }
    }

    public static void main(String[] args) {
        getArithmeticProgression(5,3,3);
    }
}