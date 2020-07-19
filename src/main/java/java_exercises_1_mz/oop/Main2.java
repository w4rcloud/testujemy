package java_exercises_1_mz.oop;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Engine v8 = new Engine(7.0, 400, 15);

        SportCar bmw = new SportCar("BMW", "X7", "black", v8, 7);

        System.out.println(bmw.toString());
        Car porsche = new SportCar("Porsche", "Panamera", "red", v8, 4);
        //upwards casting - rzutowanie w gore

//        jezeli SportCar rzutujemy na Car - rzutowanie w gore, obcina czesc metod
//        jezeli Car -> SportCar - rzutowanie w dol, dostaje dostep do metod zdefiniowanych tylko w SportCar

        SportCar sportsCar = (SportCar) porsche;

        List<SportCar> sportCarsList = new ArrayList<>();
        sportCarsList.add(bmw);
        sportCarsList.add((SportCar) porsche);

        for (SportCar car : sportCarsList) {
            car.getEngine();
        }
    }
}
