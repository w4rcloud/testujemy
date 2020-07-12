package java_exercises_1_sda;

// Sprawdź, czy podany ciąg liczb jest ciągiem arytmetycznym


public class Zad8A {
    public static boolean isArithmeticProgression(int[] arithmeticProgressionArray) {
        if (arithmeticProgressionArray.length < 2) return false;
        boolean isCorrect = true;
        int difference = arithmeticProgressionArray[1] - arithmeticProgressionArray[0];
        for (int i = 2; i < arithmeticProgressionArray.length; i++) {
            int actualDifference = arithmeticProgressionArray[i] - arithmeticProgressionArray[i-1];
            if (actualDifference != difference) isCorrect = false;
            break;

        }

        return isCorrect;
    }

    public static void main(String[] args) {
        int[] correctArray = {1, 3, 5, 7};
        int[] incorrectArray = {1, 5, 5, 7};
        Zad7A.tablePrinter(correctArray);
        Zad7A.tablePrinter(incorrectArray);
        boolean isCorrect = isArithmeticProgression(correctArray);
        boolean isCorrect2 = isArithmeticProgression(incorrectArray);
        System.out.println(isCorrect);
        System.out.println(isCorrect2);
    }
}
