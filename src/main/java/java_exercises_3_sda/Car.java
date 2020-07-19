package java_exercises_3_sda;

//Napisz interfejs Movable, który będzie zawierał metodę move. Napisz klasę Car
//        implementującą interfejs Movable – w metodzie move ma wypisać komunikat „jadę”.

public class Car implements Movable{

    @Override
    public void move() {
        System.out.println("I am being driven.");
    }
}
