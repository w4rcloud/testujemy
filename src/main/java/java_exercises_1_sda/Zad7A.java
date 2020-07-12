package java_exercises_1_sda;

// Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie, różnicy ciągu

public class Zad7A {

    public static int[] getArithmeticProgression(int length, int firstNumber, int difference) {
        int[] array = new int[length];
        array[0] = firstNumber;
        for (int i = 1; i < length; i++) {
            array[i] = array[i-1] + difference;

        }
        return array;
    }

    public static void tablePrinter(int[] array){
        for (int index : array) {
            System.out.print("[" + index + "] ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int [] result = getArithmeticProgression(4, 1, 2);
        System.out.println(result);
        tablePrinter(result);
    }

}