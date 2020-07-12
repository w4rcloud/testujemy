package java_exercises_1_sda;

// Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y

public class Zad3A {

    public static int sumFromXToY(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int result = sumFromXToY(1,4);
        System.out.println(result);
    }
}