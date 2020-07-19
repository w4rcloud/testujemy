package java_exercises_1_mz.oop;

public class Main2 {

    public static void main(String[] args) {
        Engine v8 = new Engine(7.0, 400, 15);

        SportCar bmw = new SportCar("BMW", "X7", "black", v8, 7);

        System.out.println(bmw.toString());
    }
}
