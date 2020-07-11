package java_exercises_1_sda;

// Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y

public class Zad3 {

    public static void sumFromXToY (int x, int y) {
        int sum = x;
        for (int i = x+1; i <= y; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumFromXToY(5,7);
    }
}
