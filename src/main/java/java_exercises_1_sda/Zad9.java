package java_exercises_1_sda;

public class Zad9 {

    public static int myModulo(int number, int mod){
        System.out.println("number: " + number + " mod: " + mod + ":");
        int total = (int) number/mod;
        System.out.println("test total: " + total);
        float realNum = (float) number/mod;
        System.out.println("test real: " + realNum);
        System.out.print("\n");
        return number - (total * mod);
    }

    public static void main(String[] args) {
        System.out.println(Zad9.myModulo(11, 2));
        System.out.println(Zad9.myModulo(12, 2));

    }
}
